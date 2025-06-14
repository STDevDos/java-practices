package com.froyo.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

@ExtendWith(IgnoreIOExceptionExtension.class)
class IgnoreIOExceptionExtensionTest {

    @Test
    public void firstTest() throws IOException {
        throw new IOException("IO Exception");
    }

    @Test
    public void secondTest() throws IOException {
        throw new IOException("My IO Exception");
    }
}
