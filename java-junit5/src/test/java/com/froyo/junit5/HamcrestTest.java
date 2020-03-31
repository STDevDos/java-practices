package com.froyo.junit5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 * Hamcrest (http://hamcrest.org/): an assertion framework to write matcher objects allowing rules to be defined declaratively.
 * AssertJ (http://joel-costigliola.github.io/assertj/): fluent assertions for Java.
 * Truth (https://google.github.io/truth/): an assertions Java library designed to make test assertions and failure messages more readable.
 *
 */
public class HamcrestTest {

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(2 + 1, equalTo(3));
        assertThat("Foo", notNullValue());
        assertThat("Hello world", containsString("world"));
    }

}
