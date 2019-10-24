package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Froy
 */
public class Subject {

    private List<Observador> observadores = new ArrayList<>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        notificarTodosObservadores();
    }

    public void agregar(Observador observador) {
        observadores.add(observador);
    }

    private void notificarTodosObservadores() {
        observadores.forEach(o -> o.actualizar());

    }


}
