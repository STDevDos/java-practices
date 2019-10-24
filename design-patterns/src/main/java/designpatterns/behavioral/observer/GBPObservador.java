package designpatterns.behavioral.observer;

/**
 * @author Froy
 */
public class GBPObservador extends Observador {

    private double valorCambio = 0.77;

    public GBPObservador(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println("GBP: " + (sujeto.getEstado() * valorCambio));
    }

}
