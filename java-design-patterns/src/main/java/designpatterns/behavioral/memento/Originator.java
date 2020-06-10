package designpatterns.behavioral.memento;

import lombok.Data;

@Data
public class Originator {

    private Juego estado;

    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento m) {
        this.estado = m.getEstado();
    }

}
