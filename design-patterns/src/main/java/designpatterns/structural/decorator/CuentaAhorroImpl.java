package designpatterns.structural.decorator;

/**
 * @author Froy
 */
public class CuentaAhorroImpl implements ICuenta {

    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("Abrir cuenta Ahorro");
    }

}
