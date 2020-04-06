package com.froyo;

import com.froyo.model.dto.TripDTO;
import lombok.extern.java.Log;

@SuppressWarnings("SpellCheckingInspection")
@Log
public class AppCustomValidation {

    public static void main(String[] args) {

        TripDTO tripDTO1 = new TripDTO("interjet");
        TripDTO tripDTO2 = new TripDTO("inTerjet");
        TripDTO tripDTO3 = new TripDTO("taca");

        log.info(tripDTO1.toString());
        log.info(tripDTO2.toString());
        log.info(tripDTO3.toString());

    }

}
