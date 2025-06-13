package todo.ejemplo1;

import java.util.ArrayList;

public class Estudiante {
    private ArrayList<Integer> scores;
    private double average;
    public static String ATRIBUTO_ESTATICO = "ESTATICO1";

    private void computeAverage() {
        if (!this.scores.isEmpty()) {
            //valid code to compute average
            average = this.scores.stream().mapToInt(Integer::intValue).average().getAsDouble();
        }
    }

    public Estudiante() {
        this.scores = new ArrayList<>();
        computeAverage();
    }

    @java.lang.SuppressWarnings("all")
    public ArrayList<Integer> getScores() {
        return this.scores;
    }

    @java.lang.SuppressWarnings("all")
    public double getAverage() {
        return this.average;
    }

    @java.lang.SuppressWarnings("all")
    public void setScores(final ArrayList<Integer> scores) {
        this.scores = scores;
    }

    @java.lang.SuppressWarnings("all")
    public void setAverage(final double average) {
        this.average = average;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Estudiante)) return false;
        final Estudiante other = (Estudiante) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        if (java.lang.Double.compare(this.getAverage(), other.getAverage()) != 0) return false;
        final java.lang.Object this$scores = this.getScores();
        final java.lang.Object other$scores = other.getScores();
        if (this$scores == null ? other$scores != null : !this$scores.equals(other$scores)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Estudiante;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $average = java.lang.Double.doubleToLongBits(this.getAverage());
        result = result * PRIME + (int) ($average >>> 32 ^ $average);
        final java.lang.Object $scores = this.getScores();
        result = result * PRIME + ($scores == null ? 43 : $scores.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Estudiante(scores=" + this.getScores() + ", average=" + this.getAverage() + ")";
    }
}
