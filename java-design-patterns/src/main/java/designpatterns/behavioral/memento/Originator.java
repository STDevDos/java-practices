package designpatterns.behavioral.memento;

public class Originator {
    private Juego estado;

    public Memento guardar() {
        return new Memento(estado);
    }

    public void restaurar(Memento m) {
        this.estado = m.getEstado();
    }

    @java.lang.SuppressWarnings("all")
    public Originator() {
    }

    @java.lang.SuppressWarnings("all")
    public Juego getEstado() {
        return this.estado;
    }

    @java.lang.SuppressWarnings("all")
    public void setEstado(final Juego estado) {
        this.estado = estado;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Originator)) return false;
        final Originator other = (Originator) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$estado = this.getEstado();
        final java.lang.Object other$estado = other.getEstado();
        if (this$estado == null ? other$estado != null : !this$estado.equals(other$estado)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Originator;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $estado = this.getEstado();
        result = result * PRIME + ($estado == null ? 43 : $estado.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Originator(estado=" + this.getEstado() + ")";
    }
}
