package read;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ReadFileToByteArray {

    public String extractBytes(String localPath) {
        File file = new File(localPath);
        byte[] encoded = new byte[0];
        try {
            encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(encoded);
    }


}
