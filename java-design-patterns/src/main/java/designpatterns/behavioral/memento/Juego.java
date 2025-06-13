package designpatterns.behavioral.memento;

public class Juego {
    private String nombre;
    private int checkpoint;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Juego(nombre=" + this.nombre + ", checkpoint=" + this.checkpoint + ")";
    }

    @java.lang.SuppressWarnings("all")
    public Juego(final String nombre, final int checkpoint) {
        this.nombre = nombre;
        this.checkpoint = checkpoint;
    }
}
