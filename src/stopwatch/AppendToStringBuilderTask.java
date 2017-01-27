package stopwatch;

/**
 *
 * @author Pawat Nakpiphatkul
 */
public class AppendToStringBuilderTask implements Runnable{

    /** Store times of append */
    private int count;
    /** Store char to append */
    private final char CHAR = 'a';
    /** Initialize StringBuilder object */
    private StringBuilder builder = new StringBuilder();

    /**
     * Initialize constructor for AppendToStringBuilderTask
     *
     * @param count times of append
     */
    public AppendToStringBuilderTask(int count) {
        this.count = count;
    }

    /**
     * Appends StringBuilder until reach count
     */
    public void run() {
        for (int k = 0; k < count; k++) {
            builder = builder.append(CHAR);
        }
    }

    /**
     * Get description of the task
     *
     * @return String of description and numbers of append times.
     */
    public String toString() {
        return "Append " + count + " chars to StringBuilder.";
    }
}
