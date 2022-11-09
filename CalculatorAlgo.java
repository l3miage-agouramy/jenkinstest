package epsi;

/**
 * The computation methods..
 *
 */
public final class CalculatorAlgo {

    /**
     * Adds two numbers.
     * @param a the first number
     * @param b the second number
     * @return the result of a + b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    private CalculatorAlgo() {
        throw new IllegalArgumentException("Utility class - do not instantiate");
    }
}
