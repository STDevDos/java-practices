package com.froyo.junit5.parameterizedTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class OwnerTest {

    @DisplayName("Values Source Test -  ")
    @ParameterizedTest(name = "{displayName} [{index} - {arguments}] " )
    @ValueSource(strings = {"Spring","Framework","Guru"})
    void testValueSource(String val) {
//        log.info(val);
    }
}
