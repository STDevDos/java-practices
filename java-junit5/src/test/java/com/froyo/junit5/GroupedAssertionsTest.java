package com.froyo.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupedAssertionsTest {

    @Test
    void groupedAssertions() {
        Address address = new Address("John", "Smith");
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        assertAll("address", //
                () -> assertEquals("John", address.getFirstName()), //
                () -> assertEquals("User", address.getLastName(),"no charcho") //
        );
    }

}
