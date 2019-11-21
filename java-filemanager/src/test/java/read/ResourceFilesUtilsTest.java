package read;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ResourceFilesUtilsTest {

    private ResourceFilesUtils resourceFilesUtils;

    @BeforeEach
    void setUp() {
        resourceFilesUtils = new ResourceFilesUtils();
    }

    @Test
    void test_convertResourceToByteArray() {
        String result = resourceFilesUtils.convertResourceToByteArray();
        System.out.println(result);
        assertTrue(Objects.nonNull(result));
    }

    @Test
    void test_convertResourceToBase64() {
        String result = resourceFilesUtils.convertResourceFileToBase64();
        System.out.println(result);
        assertTrue(Objects.nonNull(result));
    }

    @Test
    void test_convertResourceInputStreamToBase64() {
        String result = resourceFilesUtils.convertResourceInputStreamToBase64();
        System.out.println(result);

        // assert
        assertAll(
                () -> assertTrue(Objects.nonNull(result)),
                () -> assertTrue(Objects.nonNull(result)),
                () -> assertTrue(Objects.nonNull(result))
        );

    }

}
