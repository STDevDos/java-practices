package com.froyo.junit5;

import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class TimeoutWithPreemptiveTerminationTest {

    /**
     * The other Jupiter assertion for timeouts is called assertTimeoutPreemptively.
     * The difference with assertTimeoutPreemptively with respect to assertTimeout is
     * that assertTimeoutPreemptively does not wait until the end of the operation,
     * and the execution is aborted when the expected timeout is exceeded.
     */
    @Test
    void timeoutExceededWithPreemptiveTermination() {
        assertTimeoutPreemptively(ofMillis(10), () -> {
            Thread.sleep(5);
        });
    }

}
