package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
