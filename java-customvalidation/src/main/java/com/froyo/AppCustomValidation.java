package com.froyo;

import com.froyo.model.Viaje;
import lombok.extern.java.Log;

@Log
public class AppCustomValidation {

    public static void main(String[] args) {

        Viaje viaje1 = new Viaje("interjet");
        Viaje viaje2 = new Viaje("inTerjet");
        Viaje viaje3 = new Viaje("taca");

        log.info(viaje1.toString());
        log.info(viaje2.toString());
        log.info(viaje3.toString());

    }

}
