package quick.optional;

public class Velocity {
    private String data;

    @java.lang.SuppressWarnings("all")
    public Velocity() {
    }

    @java.lang.SuppressWarnings("all")
    public String getData() {
        return this.data;
    }

    @java.lang.SuppressWarnings("all")
    public void setData(final String data) {
        this.data = data;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Velocity)) return false;
        final Velocity other = (Velocity) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$data = this.getData();
        final java.lang.Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Velocity;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Velocity(data=" + this.getData() + ")";
    }
}
