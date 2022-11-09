package epsi;

import java.util.Collection;

/**
 * The Calculator class.
 *
 */
public final class CalculatorService {

    /**
     * Adds two numbers.
     * @param a the first number
     * @param b the second number
     * @return the result of a + b
     */
    public int add(Collection<Integer> numbers) {
        return numbers.stream().reduce(0, CalculatorAlgo::add);
    }
}
