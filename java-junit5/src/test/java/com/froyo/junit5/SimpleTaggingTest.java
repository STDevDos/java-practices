package com.froyo.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTaggingTest {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}
