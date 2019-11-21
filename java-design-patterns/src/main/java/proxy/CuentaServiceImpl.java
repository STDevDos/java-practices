package proxy;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class CuentaServiceImpl implements CuentaService {

    public void retirar(CuentaBancaria cuentaBancaria, BigDecimal monto) {
        if (monto != null && monto.compareTo(BigDecimal.ZERO) > 0) {
            cuentaBancaria.setSaldo(cuentaBancaria.getSaldo().subtract(monto));
        }
    }

    public void depositar(CuentaBancaria cuentaBancaria, BigDecimal monto) {
        if (monto != null && monto.compareTo(BigDecimal.ZERO) > 0) {
            cuentaBancaria.setSaldo(cuentaBancaria.getSaldo().add(monto));
        }
    }

    public void mostrar(CuentaBancaria cuentaBancaria) {
        System.out.println(cuentaBancaria.getSaldo());
    }

}
