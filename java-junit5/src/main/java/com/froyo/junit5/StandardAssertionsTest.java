package com.froyo.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardAssertionsTest {

    @Test
    void standardAssertions() {
        assertEquals(2, 2);
        assertTrue(true,"The optional assertion message is now the last parameter");
        assertFalse(false, () -> "Really " + "expensive " + "message" + ".");
    }

}
