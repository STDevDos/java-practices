package junit.things;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ModelBTest {

    @InjectMocks
    private ModelB modelB;

    @Test
    void testMetodo() {
        modelB.testMetodo();
    }
}
