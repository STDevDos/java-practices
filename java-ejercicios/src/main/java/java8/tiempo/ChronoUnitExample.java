package java8.tiempo;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {

    public static void main(String[] args) {

        LocalDateTime local1 = LocalDateTime.of(-2320, Month.JULY, 11, 12, 50, 01);
        LocalDateTime local2 = LocalDateTime.now();

        long dias = ChronoUnit.DAYS.between(local1, local2);
        long decadas = ChronoUnit.DECADES.between(local1, local2);
        long centenarios = ChronoUnit.CENTURIES.between(local1, local2);
        long eras = ChronoUnit.ERAS.between(local1, local2);

        System.out.println("Dias: " + dias);
        System.out.println("Decadas: " + decadas);
        System.out.println("Centenarios: " + centenarios);
        System.out.println("Eras: " + eras);

    }


}
