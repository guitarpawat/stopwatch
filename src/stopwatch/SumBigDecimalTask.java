package stopwatch;

import java.math.BigDecimal;

/**
 * Sum BigDecimal object with specific times.
 * @author Pawat Nakpiphatkul
 */
public class SumBigDecimalTask implements Runnable {
    /** Store times of append*/
    private int counter;
    /** Store char to append */
    private final char CHAR = 'a';
    /** Limit maximum size of array */
    static final int ARRAY_SIZE = 500000;
    /** Initialize array of BigDecimal */
    BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
    /** Store sum results */
    BigDecimal sum = new BigDecimal(0.0);

    /**
     * Initialize constructor for SumBigDecimalTask
     *
     * @param counter times of append
     */
    public SumBigDecimalTask(int counter) {
        this.counter = counter;
        for(int i=0; i<ARRAY_SIZE; i++) values[i] = new BigDecimal(i+1);
    }

    /**
     * Sum BigDecimal until reach count
     */
    public void run() {
        for (int count = 0, i = 0; count < counter; count++, i++) {
            if (i >= values.length) {
                i = 0;
            }
            sum = sum.add(values[i]);
        }
    }

    /**
     * Get description of the task
     *
     * @return String of description and numbers of sum times.
     */
    public String toString() {
        return String.format("Sum array of BigDecimal objects with count=%,d",counter);
    }
}