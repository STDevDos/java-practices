package designpatterns.behavioral.command;

import java.math.BigDecimal;

public class SaldoIngresoServiceImpl implements SaldoFamiliarService {
    private SaldoFamiliar saldoFamiliar;
    private BigDecimal monto;

    public void execute() {
        this.saldoFamiliar.ingreso(this.monto);
    }

    @java.lang.SuppressWarnings("all")
    public SaldoIngresoServiceImpl(final SaldoFamiliar saldoFamiliar, final BigDecimal monto) {
        this.saldoFamiliar = saldoFamiliar;
        this.monto = monto;
    }
}
