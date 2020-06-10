package designpatterns.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CuentaBancaria {

    private Long idCuenta;
    private String nombre;
    private BigDecimal saldo;

}
