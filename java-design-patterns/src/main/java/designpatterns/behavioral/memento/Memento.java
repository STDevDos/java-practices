package designpatterns.behavioral.memento;

public class Memento {
    private Juego estado;

    @java.lang.SuppressWarnings("all")
    public Juego getEstado() {
        return this.estado;
    }

    @java.lang.SuppressWarnings("all")
    public Memento(final Juego estado) {
        this.estado = estado;
    }
}
