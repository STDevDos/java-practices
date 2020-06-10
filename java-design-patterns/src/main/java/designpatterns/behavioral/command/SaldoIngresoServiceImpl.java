package designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class SaldoIngresoServiceImpl implements SaldoFamiliarService {

    private SaldoFamiliar saldoFamiliar;
    private BigDecimal monto;

    public void execute() {
        this.saldoFamiliar.ingreso(this.monto);
    }

}
