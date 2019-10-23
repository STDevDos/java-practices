package read;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * If we use Spring: https://www.baeldung.com/spring-classpath-file-access
 */
public class ResourceFilesUtils {

    private ClassLoader classLoader;

    public ResourceFilesUtils() {
        classLoader = getClass().getClassLoader();
    }

    public String convertResourceToByteArray() {
        InputStream inputStream = classLoader.getResourceAsStream("img/test.png");
        try {
            return Objects.isNull(inputStream) ? "RESOURCE NOT FOUND" : new String(inputStream.readAllBytes());
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    /**
     * Need check with \Users\ONE_NAME\ because Nombre%20Apellido
     *
     * @return
     */
    public String convertResourceFileToBase64() {
        File file = new File(classLoader.getResource("img/test.png").getFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        try {
            return Objects.isNull(file) ? "RESOURCE NOT FOUND" : new String(Base64.encodeBase64(FileUtils.readFileToByteArray(file)));
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    public String convertResourceInputStreamToBase64() {
        InputStream inputStream = classLoader.getResourceAsStream("img/test.png");
        try {
            if (Objects.isNull(inputStream)) {
                return "RESOURCE NOT FOUND";
            } else {
                return new String(Base64.encodeBase64(inputStream.readAllBytes()));
            }
        } catch (IOException e) {
            return e.getMessage();
        }
    }

}
