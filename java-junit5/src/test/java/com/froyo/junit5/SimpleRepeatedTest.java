package com.froyo.junit5;

import org.junit.jupiter.api.RepeatedTest;

public class SimpleRepeatedTest {

    @RepeatedTest(5)
    void test() {
        System.out.println("Repeated test");
    }

}
