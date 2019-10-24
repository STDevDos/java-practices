package proxy;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public interface CuentaService {
    void retirar(CuentaBancaria cuentaBancaria, BigDecimal monto);

    void depositar(CuentaBancaria cuentaBancaria, BigDecimal monto);

    void mostrar(CuentaBancaria cuentaBancaria);
}
