package designpatterns.structural.decorator;

public class Cuenta {
    private Long id;
    private String name;

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Cuenta(id=" + this.id + ", name=" + this.name + ")";
    }

    @java.lang.SuppressWarnings("all")
    public Cuenta(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }
}
