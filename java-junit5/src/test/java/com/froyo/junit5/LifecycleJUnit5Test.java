package com.froyo.junit5;

import org.junit.jupiter.api.*;

public class LifecycleJUnit5Test {

    @BeforeAll
    static void setupAll() {
        System.out.println("Setup ALL TESTS in the class");
    }

    @BeforeEach
    void setup() {
        System.out.println("Setup EACH TEST in the class");
    }

    @Test
    void testOne() {
        System.out.println("TEST 1");
    }

    @Test
    void testTwo() {
        System.out.println("TEST 2");
    }

    @AfterEach
    void teardown() {
        System.out.println("Teardown EACH TEST in the class");
    }

    @AfterAll
    static void teardownAll() {
        System.out.println("Teardown ALL TESTS in the class");
    }

}
