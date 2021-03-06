package designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class SaldoGastoServiceImpl implements SaldoFamiliarService {

    private SaldoFamiliar saldoFamiliar;
    private BigDecimal monto;

    public void execute() {
        this.saldoFamiliar.gasto(this.monto);
    }

}
