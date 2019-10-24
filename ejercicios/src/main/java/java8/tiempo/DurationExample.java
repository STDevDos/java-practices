package java8.tiempo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationExample {

    public static void main(String[] args) {

        //Duraci�n en segundos de una hora a otra.
        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds());

        Duration oneHour2 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(oneHour2.getSeconds());

        //Duration between

        LocalDateTime fechaNacimiento = LocalDateTime.of(1985, Month.JULY, 11, 12, 50, 01);
        LocalDateTime toDay = LocalDateTime.now();


        System.out.println(fechaNacimiento);
        System.out.println(toDay);

        Duration duracion = Duration.between(fechaNacimiento, toDay);

        System.out.println("Dias de vida: " + duracion.toDays());


    }


}
