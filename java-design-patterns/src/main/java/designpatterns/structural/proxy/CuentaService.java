package designpatterns.structural.proxy;

import java.math.BigDecimal;

public interface CuentaService {
    void retirar(CuentaBancaria cuentaBancaria, BigDecimal monto);
    void depositar(CuentaBancaria cuentaBancaria, BigDecimal monto);
    void mostrar(CuentaBancaria cuentaBancaria);
}
