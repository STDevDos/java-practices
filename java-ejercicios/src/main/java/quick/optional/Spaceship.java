package quick.optional;

import java.util.Optional;

public class Spaceship {
    private Optional<Engine> engine;
    private String pilot;

    @java.lang.SuppressWarnings("all")
    public Spaceship() {
    }

    @java.lang.SuppressWarnings("all")
    public Optional<Engine> getEngine() {
        return this.engine;
    }

    @java.lang.SuppressWarnings("all")
    public String getPilot() {
        return this.pilot;
    }

    @java.lang.SuppressWarnings("all")
    public void setEngine(final Optional<Engine> engine) {
        this.engine = engine;
    }

    @java.lang.SuppressWarnings("all")
    public void setPilot(final String pilot) {
        this.pilot = pilot;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Spaceship)) return false;
        final Spaceship other = (Spaceship) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$engine = this.getEngine();
        final java.lang.Object other$engine = other.getEngine();
        if (this$engine == null ? other$engine != null : !this$engine.equals(other$engine)) return false;
        final java.lang.Object this$pilot = this.getPilot();
        final java.lang.Object other$pilot = other.getPilot();
        if (this$pilot == null ? other$pilot != null : !this$pilot.equals(other$pilot)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Spaceship;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $engine = this.getEngine();
        result = result * PRIME + ($engine == null ? 43 : $engine.hashCode());
        final java.lang.Object $pilot = this.getPilot();
        result = result * PRIME + ($pilot == null ? 43 : $pilot.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Spaceship(engine=" + this.getEngine() + ", pilot=" + this.getPilot() + ")";
    }
}
