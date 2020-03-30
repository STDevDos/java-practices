package com.froyo.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

class MyParameterResolverTest {

    @ExtendWith(MyParameterResolver.class)
    @Test
    public void test(Object parameter) {
        System.out.println("Desde el @Test " + parameter);
    }

}
