package designpatterns.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class CuentaBancaria {

    private Long idCuenta;
    private String nombre;
    private BigDecimal saldo;

    private CuentaBancaria() {
        throw new IllegalArgumentException("NOT VALID");
    }

}
