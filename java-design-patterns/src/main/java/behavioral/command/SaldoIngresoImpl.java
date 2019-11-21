package behavioral.command;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class SaldoIngresoImpl implements SaldoFamiliarService {

    public SaldoFamiliar saldoFamiliar;
    public BigDecimal monto;

    public SaldoIngresoImpl(SaldoFamiliar saldoFamiliar, BigDecimal monto) {
        this.saldoFamiliar = saldoFamiliar;
        this.monto = monto;
    }

    public void execute() {
        this.saldoFamiliar.ingreso(this.monto);
    }

}
