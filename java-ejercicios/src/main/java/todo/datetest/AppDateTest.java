package todo.datetest;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class AppDateTest {

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());

        System.out.println(LocalDateTime.now().getNano());
        System.out.println(LocalDateTime.now().getNano());

        System.out.println(System.nanoTime());
        System.out.println("Text ---------------------- 2 ");

        System.out.println(LocalDateTime.now().getNano());

        System.out.println("Text ---------------------- 3");
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss")));
        System.out.println("Text ---------------------- ");

        //Capturar fechas de naciemientos, etc... para el registro del tiempo transcurrido.

        long millis = 1556175797428L; // April 25, 2019 7:03:17.428 UTC

        LocalDate localDateDefault = LocalDate.of(1492, 07, 11);
        LocalTime localTimeDefault = LocalTime.of(18, 15, 25, 9800);
        LocalDateTime localDateTime = LocalDateTime.of(localDateDefault, localTimeDefault);

        Duration duration = Duration.between(localDateTime, LocalDateTime.now());
        System.out.println(duration.getSeconds());
        Period period = Period.between(localDateTime.toLocalDate(), LocalDate.now());
        System.out.println(period.getYears());

        LocalDate utcDate = Instant.ofEpochMilli(1556175797428L).atZone(ZoneId.of("UTC")).toLocalDate();
        System.out.println(utcDate);
        LocalDateTime utcDateTime = Instant.ofEpochMilli(1556175797428L).atZone(ZoneId.of("UTC")).toLocalDateTime();
        System.out.println(utcDateTime);

        System.out.printf(" Milisegundos; %d ", Instant.now().toEpochMilli());

        LocalDateTime localDateTime2 = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.of(localDateTime2, ZoneId.systemDefault());
        System.out.printf(" Milisegundos 2: %d", zdt.toInstant().toEpochMilli());


    }

}
