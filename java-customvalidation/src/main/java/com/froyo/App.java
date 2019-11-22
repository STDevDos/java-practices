package com.froyo;

import com.froyo.model.Viaje;

public class App {

    public static void main(String[] args) {

        Viaje viaje1 = new Viaje("interjet");
        Viaje viaje2 = new Viaje("inTerjet");
        Viaje viaje3 = new Viaje("taca");

        System.out.println(viaje1);
        System.out.println(viaje2);
        System.out.println(viaje3);

    }

}
