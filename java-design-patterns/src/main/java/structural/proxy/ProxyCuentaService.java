package structural.proxy;

import java.math.BigDecimal;

/**
 * @author Froy
 */
public class ProxyCuentaService implements CuentaService {

    private CuentaServiceImpl cuentaServiceImpl;

    public ProxyCuentaService() {
        this.cuentaServiceImpl = new CuentaServiceImpl();
    }

    public void retirar(CuentaBancaria cuentaBancaria, BigDecimal monto) {
        //Poder hacer alguna validación antes de que llegue al objeto real, ejemplo alguna seguridad.
        cuentaServiceImpl.retirar(cuentaBancaria, monto);
    }

    public void depositar(CuentaBancaria cuentaBancaria, BigDecimal monto) {
        //Poder hacer alguna validación antes de que llegue al objeto real, ejemplo alguna seguridad.
        cuentaServiceImpl.depositar(cuentaBancaria, monto);
    }

    public void mostrar(CuentaBancaria cuentaBancaria) {
        //Poder hacer alguna validación antes de que llegue al objeto real, ejemplo alguna seguridad.
        cuentaServiceImpl.mostrar(cuentaBancaria);
    }


}
