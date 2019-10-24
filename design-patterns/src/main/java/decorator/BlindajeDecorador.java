package decorator;

/**
 * @author Froy
 */
public class BlindajeDecorador extends CuentaDecorador {

    public BlindajeDecorador(ICuenta icuenta) {
        super(icuenta);
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        this.icuenta.abrirCuenta(cuenta);
        agregarBlindaje();
    }

    private void agregarBlindaje() {
        System.out.println("Se añadió Blindaje a la cuenta.");

    }

}
