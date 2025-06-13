package com.froyo.junit5;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CollectionTest {

    @TestFactory
    List<DynamicTest> dynamicTestsWithInvalidReturnType() {
        return Arrays.asList(
                dynamicTest("invalid return type fixed", () -> assertTrue(true))
        );
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () ->
                        assertTrue(true)),
                dynamicTest("2nd dynamic test", () -> assertEquals(4, 2
                        * 2)));
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestsFromIterable() {
        return Arrays.asList(
                dynamicTest("3rd dynamic test", () ->
                        assertTrue(true)),
                dynamicTest("4th dynamic test", () -> assertEquals(4, 2
                        * 2)));
    }

    @TestFactory
    Iterator<DynamicTest> dynamicTestsFromIterator() {
        return Arrays.asList(
                dynamicTest("5th dynamic test", () ->
                        assertTrue(true)),
                dynamicTest("6th dynamic test", () -> assertEquals(4, 2
                        * 2))).iterator();
    }

}
