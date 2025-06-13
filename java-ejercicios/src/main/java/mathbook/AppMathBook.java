package mathbook;

import java.math.BigInteger;

/**
 * Utility class to compare fractions using cross multiplication.
 */
public class AppMathBook {

    /**
     * Entry point. If four arguments are provided they are interpreted as two
     * fractions in the form {@code num1 den1 num2 den2}. Otherwise a set of
     * predefined examples is executed.
     */
    public static void main(String[] args) {
        if (args.length == 4) {
            Fraction a = new Fraction(Long.parseLong(args[0]), Long.parseLong(args[1]));
            Fraction b = new Fraction(Long.parseLong(args[2]), Long.parseLong(args[3]));
            System.out.println(checkMayorMenorIgual(a, b));
            return;
        }

        System.out.println("001: " + checkMayorMenorIgual(new Fraction(2, 3), new Fraction(1, 4)));
        System.out.println("002: " + checkMayorMenorIgual(new Fraction(3, 5), new Fraction(7, 8)));
        System.out.println("003: " + checkMayorMenorIgual(new Fraction(-1, 6), new Fraction(-1, 2)));
        System.out.println("004: " + checkMayorMenorIgual(new Fraction(7, 9), new Fraction(21, 27)));
        System.out.println("005: " + checkMayorMenorIgual(new Fraction(11, 4), new Fraction(12, 5)));
        System.out.println("006: " + checkMayorMenorIgual(new Fraction(6, 4), new Fraction(18, 12)));

        System.out.println("007: " + checkMayorMenorIgual(new Fraction(-7, 7), new Fraction(0, 1)));
        System.out.println("008: " + checkMayorMenorIgual(new Fraction(-5, 10), new Fraction(13, 26)));
        System.out.println("009: " + checkMayorMenorIgual(new Fraction(5, 2), new Fraction(1, 1)));
        System.out.println("010: " + checkMayorMenorIgual(new Fraction(17, 6), new Fraction(3, 1)));
        System.out.println("011: " + checkMayorMenorIgual(new Fraction(-3, 1), new Fraction(-39, 13)));
        System.out.println("012: " + checkMayorMenorIgual(new Fraction(4, 3), new Fraction(4, 9)));

    }

    private static String checkMayorMenorIgual(Fraction a, Fraction b) {
        return switch (a.compareTo(b)) {
            case -1 -> "a: " + a + " ((<)) b: " + b;
            case 0 -> "a: " + a + " ((=)) b: " + b;
            case 1 -> "a: " + a + " ((>)) b: " + b;
            default -> "ERROR"; // This should never occur
        };
    }

    /**
     * Simple immutable fraction record with a comparison method based on cross
     * multiplication.
     */
    public record Fraction(long numerator, long denominator) implements Comparable<Fraction> {

        public Fraction {
            if (denominator == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero");
            }
            if (denominator < 0) { // normalize sign
                numerator = -numerator;
                denominator = -denominator;
            }
        }

        @Override
        public int compareTo(Fraction other) {
            BigInteger left = BigInteger.valueOf(numerator).multiply(BigInteger.valueOf(other.denominator));
            BigInteger right = BigInteger.valueOf(other.numerator).multiply(BigInteger.valueOf(denominator));
            return left.compareTo(right);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }

}