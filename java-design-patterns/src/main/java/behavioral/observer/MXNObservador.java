package behavioral.observer;

/**
 * @author Froy
 */
public class MXNObservador extends Observador {

    private double valorCambio = 19.30;

    public MXNObservador(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("MXN: " + (sujeto.getEstado() * valorCambio));
    }

}
