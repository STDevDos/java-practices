package designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class  Invoker {

    private List<SaldoFamiliarService> listSaldoFamiliar = new ArrayList<>();

    public void recibirMovimientos(SaldoFamiliarService saldoFamiliarService) {
        listSaldoFamiliar.add(saldoFamiliarService);
    }

    public void realizarOperaciones() {
        this.listSaldoFamiliar.forEach(x -> x.execute());
        this.listSaldoFamiliar.clear();
    }

}
