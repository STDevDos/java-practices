package quick.optional;

public class VelocityMonitor {
    private Velocity velocity;

    @java.lang.SuppressWarnings("all")
    public VelocityMonitor() {
    }

    @java.lang.SuppressWarnings("all")
    public Velocity getVelocity() {
        return this.velocity;
    }

    @java.lang.SuppressWarnings("all")
    public void setVelocity(final Velocity velocity) {
        this.velocity = velocity;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof VelocityMonitor)) return false;
        final VelocityMonitor other = (VelocityMonitor) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$velocity = this.getVelocity();
        final java.lang.Object other$velocity = other.getVelocity();
        if (this$velocity == null ? other$velocity != null : !this$velocity.equals(other$velocity)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof VelocityMonitor;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $velocity = this.getVelocity();
        result = result * PRIME + ($velocity == null ? 43 : $velocity.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "VelocityMonitor(velocity=" + this.getVelocity() + ")";
    }
}
