import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardizedHTTPClientAPITest {

    private StandardizedHTTPClientAPI standardizedHTTPClientAPI;

    @BeforeEach
    void setUp() {
        standardizedHTTPClientAPI = new StandardizedHTTPClientAPI();
    }

    @Test
    void execute() {
        standardizedHTTPClientAPI.execute();
    }
}
