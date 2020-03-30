package com.froyo.junit5;

import lombok.Data;

@Data
public class Address {

    private String firstName;
    private String lastName;

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
