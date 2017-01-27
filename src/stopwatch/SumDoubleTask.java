package stopwatch;

/**
 *
 * @author Pawat Nakpiphatkul
 */
public class SumDoubleTask implements Runnable {
    /** Store times of append*/
    private int counter;
    /** Store char to append */
    private final char CHAR = 'a';
    /** Limit maximum size of array */
    static final int ARRAY_SIZE = 500000;
    /** Initialize array of Double */
    Double[] values = new Double[ARRAY_SIZE];
    /** Store sum results */
    Double sum = new Double(0.0);

    /**
     * Initialize constructor for SumDoubleTask
     *
     * @param counter times of append
     */
    public SumDoubleTask(int counter) {
        this.counter = counter;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            values[i] = new Double(i + 1);
        }
    }

    /**
     * Sum Double until reach count
     */
    public void run() {
        for (int count = 0, i = 0; count < counter; count++, i++) {
            if (i >= values.length) {
                i = 0;  // reuse the array when get to last value
            }
            sum = sum + values[i];
        }
    }

    /**
     * Get description of the task
     *
     * @return String of description and numbers of sum times.
     */
    public String toString() {
        return String.format("Sum array of Double objects with count=%,d",counter);
    }
}
