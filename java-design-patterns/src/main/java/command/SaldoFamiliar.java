package command;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class SaldoFamiliar {

    private BigDecimal saldo;

    public SaldoFamiliar(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void ingreso(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
        System.out.println("ingreso: " + this.saldo);
    }

    public void gasto(BigDecimal monto) {
        this.saldo = this.saldo.subtract(monto);
        System.out.println("gasto: " + this.saldo);
    }

}
