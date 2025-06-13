package designpatterns.behavioral.command;

import java.math.BigDecimal;

public class SaldoGastoServiceImpl implements SaldoFamiliarService {
    private SaldoFamiliar saldoFamiliar;
    private BigDecimal monto;

    public void execute() {
        this.saldoFamiliar.gasto(this.monto);
    }

    @java.lang.SuppressWarnings("all")
    public SaldoGastoServiceImpl(final SaldoFamiliar saldoFamiliar, final BigDecimal monto) {
        this.saldoFamiliar = saldoFamiliar;
        this.monto = monto;
    }
}
