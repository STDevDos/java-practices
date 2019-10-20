import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.logging.Logger;

public class StandardizedHTTPClientAPI {

    public void execute(){

        final Logger logger = Logger.getLogger("com.froyo.http.StandardizedHTTPClientAPI");

        HttpClient httpClient = HttpClient.newBuilder()
                .version(Version.HTTP_2)  // this is the default
                .build();

        //Start HttpRequest GET ------------------------------------------------------------
        HttpRequest requestBitsoTicker = HttpRequest.newBuilder()
                .uri(URI.create("https://api.bitso.com/v3/ticker/"))
                .GET()   // this is the default
                .build();

        printLogger(logger, httpClient, requestBitsoTicker);
        //End HttpRequest GET ------------------------------------------------------------

        //Start HttpRequest POST ------------------------------------------------------------
        HttpRequest mainRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://http2.github.io/"))
                .POST(BodyPublishers.ofString("json"))
                .build();

        printLogger(logger, httpClient, mainRequest);
        //End HttpRequest POST ------------------------------------------------------------

    }

    private void printLogger(Logger logger, HttpClient httpClient, HttpRequest requestBitsoTicker) {
        try {
            HttpResponse<String> response = httpClient.send(requestBitsoTicker, BodyHandlers.ofString());

            logger.info("Response status code: " + response.statusCode());
            logger.info("Response headers: " + response.headers());
            logger.info("Response body: " + response.body());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
