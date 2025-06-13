package designpatterns.behavioral.command;

import java.math.BigDecimal;

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

    @java.lang.SuppressWarnings("all")
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    @java.lang.SuppressWarnings("all")
    public SaldoFamiliar(final BigDecimal saldo) {
        this.saldo = saldo;
    }
}
