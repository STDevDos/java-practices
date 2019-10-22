package read;

import org.junit.jupiter.api.Test;

class ReadFileToByteArrayTest {

    @Test
    void extractBytes() {

        ReadFileToByteArray readFileToByteArray = new ReadFileToByteArray();
        String result = readFileToByteArray.extractBytes("C:/test.png");
        System.out.println(result);

    }
}
