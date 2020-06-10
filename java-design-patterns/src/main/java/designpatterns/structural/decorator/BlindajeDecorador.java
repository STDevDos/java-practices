package designpatterns.structural.decorator;

public class BlindajeDecorador extends CuentaServiceDecorador {

    public BlindajeDecorador(CuentaService cuentaService) {
        super(cuentaService);
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        this.cuentaService.abrirCuenta(cuenta);
        agregarBlindaje();
    }

    private void agregarBlindaje() {
        System.out.println("Se añadió Blindaje a la cuenta.");
    }

}
