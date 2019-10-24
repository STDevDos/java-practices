package decorator;

/**
 * @author Froy
 */
public class Cuenta {

    private Long id;
    private String name;

    public Cuenta(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cuenta [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}
