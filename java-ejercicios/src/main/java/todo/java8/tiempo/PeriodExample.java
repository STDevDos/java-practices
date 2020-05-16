package todo.java8.tiempo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        Period tenDays = Period.ofDays(10);
        System.out.println(tenDays);

        Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
        System.out.println("A�o: " + oneYearTwoMonthsThreeDays.getYears());
        System.out.println("Mes: " + oneYearTwoMonthsThreeDays.getMonths());
        System.out.println("D�a: " + oneYearTwoMonthsThreeDays.getDays());

        LocalDate fechaDeNacimiento = LocalDate.of(1985, Month.JULY, 11);
        System.out.println(Period.between(fechaDeNacimiento, LocalDate.now()));


    }

}
