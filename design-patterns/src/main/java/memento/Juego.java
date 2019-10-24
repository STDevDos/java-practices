package memento;

/**
 * @author Froy
 */
public class Juego {

    private String nombre;
    private int checkpoint;

    public Juego(String nombre, int checkpoint) {
        super();
        this.nombre = nombre;
        this.checkpoint = checkpoint;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Juego [nombre=");
        builder.append(nombre);
        builder.append(", checkpoint=");
        builder.append(checkpoint);
        builder.append("]");
        return builder.toString();
    }


}
