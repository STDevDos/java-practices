package designpatterns.structural.decorator;

public abstract class CuentaServiceDecorador implements CuentaService {

    protected CuentaService cuentaService;

    public CuentaServiceDecorador(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }

    public void abrirCuenta(Cuenta cuenta) {
        this.cuentaService.abrirCuenta(cuenta);
    }


}
