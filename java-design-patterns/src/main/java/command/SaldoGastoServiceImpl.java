package command;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class SaldoGastoServiceImpl implements SaldoFamiliarService {

    public SaldoFamiliar saldoFamiliar;
    public BigDecimal monto;

    public SaldoGastoServiceImpl(SaldoFamiliar saldoFamiliar, BigDecimal monto) {
        this.saldoFamiliar = saldoFamiliar;
        this.monto = monto;
    }

    public void execute() {
        this.saldoFamiliar.gasto(this.monto);
    }

}
