package main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/**
 * Java HttpClient optimizada para Java 25 usando Virtual Threads
 */
public class StandardizedHTTPClientAPI {

    private static final Logger logger = Logger.getLogger(StandardizedHTTPClientAPI.class.getName());

    public void execute() {

        // Uso de Virtual Threads para el ejecutor del cliente HTTP (Java 21+)
        try (var executor = Executors.newVirtualThreadPerTaskExecutor();
                HttpClient httpClient = HttpClient.newBuilder()
                        .version(Version.HTTP_2)
                        .executor(executor)
                        .build()) {

            // GET Request
            var requestTicker = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.bitso.com/v3/ticker/"))
                    .GET()
                    .build();

            sendAndLog(httpClient, requestTicker);

            // POST Request
            var postRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/post"))
                    .POST(BodyPublishers.ofString("{\"key\":\"value\"}"))
                    .header("Content-Type", "application/json")
                    .build();

            sendAndLog(httpClient, postRequest);

        } catch (Exception e) {
            logger.severe("Error durante la ejecución HTTP: " + e.getMessage());
        }
    }

    private void sendAndLog(HttpClient httpClient, HttpRequest request) {
        try {
            HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

            logger.info(() -> switch (response.statusCode()) {
                case 200 -> "Success: " + response.body().substring(0, Math.min(100, response.body().length()));
                case 404 -> "Not Found: " + request.uri();
                default -> "Warning: Status Code " + response.statusCode();
            });

        } catch (IOException | InterruptedException e) {
            logger.severe("Fallo en la petición: " + e.getMessage());
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
