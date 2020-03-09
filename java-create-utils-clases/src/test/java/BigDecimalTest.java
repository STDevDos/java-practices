import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigDecimalTest {

    @Test
    public void reduce_test(){

        List<BigDecimal> calificaciones = new ArrayList<>();
        calificaciones.add(BigDecimal.valueOf(8.9));
        calificaciones.add(BigDecimal.valueOf(7.8));
        calificaciones.add(BigDecimal.valueOf(9.2));
        calificaciones.add(BigDecimal.valueOf(9.5));

        BigDecimal suma = calificaciones.stream().reduce(BigDecimal.ZERO,BigDecimal::add);
        BigDecimal promedio = suma.divide(new BigDecimal(calificaciones.size()));
        System.out.println(String.format("Suma de calificaciones: %.2f y promedio: %.2f",suma,promedio));

        //------------------------
        List<Invoice> invoices = Arrays.asList(
                new Invoice("I1001", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("I1002", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("I1003", BigDecimal.valueOf(4.888), BigDecimal.valueOf(2)),
                new Invoice("I1004", BigDecimal.valueOf(4.99), BigDecimal.valueOf(5)),
                new Invoice("I1005", BigDecimal.valueOf(.5), BigDecimal.valueOf(2.3))
        );

        BigDecimal sum = invoices.stream()
                .map(x -> x.getQty().multiply(x.getPrice()))    // map
                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce

        System.out.println(sum);    // 75.851
        System.out.println(sum.setScale(2, RoundingMode.HALF_UP));  // 75.85

    }

}
