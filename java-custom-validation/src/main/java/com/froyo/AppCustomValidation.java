package com.froyo;

import com.froyo.model.dto.TripDTO;
import lombok.extern.java.Log;

public class AppCustomValidation {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public static void main(String[] args) {

        TripDTO tripDTO1 = new TripDTO("interjet");
        TripDTO tripDTO2 = new TripDTO("inTerjet");
        TripDTO tripDTO3 = new TripDTO("taca");

        logger.info(tripDTO1.toString());
        logger.info(tripDTO2.toString());
        logger.info(tripDTO3.toString());

    }

}
