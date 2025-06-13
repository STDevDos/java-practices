package com.froyo;

import com.froyo.model.dto.TripDTO;
import java.util.logging.Logger;

public class AppCustomValidation {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    public static void main(String[] args) {

        TripDTO tripDTO1 = new TripDTO("interjet");
        TripDTO tripDTO2 = new TripDTO("inTerjet");
        TripDTO tripDTO3 = new TripDTO("taca");

        System.out.println(tripDTO1);
        System.out.println(tripDTO2);
        System.out.println(tripDTO3);

    }

}
