package structural.decorator;

/**
 * @author Froy
 */
public abstract class CuentaDecorador implements ICuenta {

    protected ICuenta icuenta;

    public CuentaDecorador(ICuenta icuenta) {
        this.icuenta = icuenta;
    }

    public void abrirCuenta(Cuenta cuenta) {
        this.icuenta.abrirCuenta(cuenta);
    }


}
