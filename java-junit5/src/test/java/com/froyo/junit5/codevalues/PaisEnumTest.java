package com.froyo.junit5.codevalues;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import static com.froyo.junit5.codevalues.PaisEnum.ESTADOS_UNIDOS;
import static com.froyo.junit5.codevalues.PaisEnum.MEXICO;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Log
class PaisEnumTest {

    @Test
    void retrieveLenguage() {

        assertAll("ya te digo",
                () -> assertEquals("english", ESTADOS_UNIDOS.retrieveLenguage()),
                () -> assertEquals("spanish", MEXICO.retrieveLenguage())
        );

    }
}
