package quick.optional;

import java.util.Optional;

public class Engine {
    private Optional<VelocityMonitor> velocityMonitor;

    @java.lang.SuppressWarnings("all")
    public Engine() {
    }

    @java.lang.SuppressWarnings("all")
    public Optional<VelocityMonitor> getVelocityMonitor() {
        return this.velocityMonitor;
    }

    @java.lang.SuppressWarnings("all")
    public void setVelocityMonitor(final Optional<VelocityMonitor> velocityMonitor) {
        this.velocityMonitor = velocityMonitor;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Engine)) return false;
        final Engine other = (Engine) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$velocityMonitor = this.getVelocityMonitor();
        final java.lang.Object other$velocityMonitor = other.getVelocityMonitor();
        if (this$velocityMonitor == null ? other$velocityMonitor != null : !this$velocityMonitor.equals(other$velocityMonitor)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Engine;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $velocityMonitor = this.getVelocityMonitor();
        result = result * PRIME + ($velocityMonitor == null ? 43 : $velocityMonitor.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Engine(velocityMonitor=" + this.getVelocityMonitor() + ")";
    }
}
