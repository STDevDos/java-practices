package designpatterns.behavioral.command;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class SaldoFamiliar {

    private BigDecimal saldo;

    public void ingreso(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
        System.out.println("ingreso: " + this.saldo);
    }

    public void gasto(BigDecimal monto) {
        this.saldo = this.saldo.subtract(monto);
        System.out.println("gasto: " + this.saldo);
    }

}
