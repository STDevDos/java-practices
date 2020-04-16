package com.froyo.junit5.converters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.JavaTimeConversionPattern;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

/**
 * https://blog.codefx.org/libraries/junit-5-parameterized-tests/
 */
public class ArgumentConvertersTest {

    @ParameterizedTest
    @CsvSource({"true, 3.14159265359, AUGUST, 2018, 2018-08-23T22:00:00"})
    void testDefaultConverters(
            boolean b, double d, Summer s, Year y, LocalDateTime dt) {
    }

    @ParameterizedTest
    @CsvSource({"true, 3.14159265359, AUGUST, 2018, 23.08.2018"})
    void testDefaultConverters(
            boolean b, double d, Summer s, Year y,
            @JavaTimeConversionPattern("dd.MM.yyyy") LocalDate dt) {
    }


    enum Summer {
        JUNE, JULY, AUGUST, SEPTEMBER;
    }


}
