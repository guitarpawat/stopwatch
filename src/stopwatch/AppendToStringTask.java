package stopwatch;

/**
 * Append chars to the String in specific times.
 * @author Pawat Nakpiphatkul
 */
public class AppendToStringTask implements Runnable{
    /** Store times of append */
    private int count;
    /** Store char to append */
    private final char CHAR = 'a';
    /** Result of appended String */
    private String result = "";
    /**
     * Initialize constructor for AppendToStringTask
     * @param count times of append
     */
    public AppendToStringTask(int count){
        this.count = count;
    }
    /**
     * Appends String until reach count
     */
    public void run(){
        for(int k=0;k<count;k++){
            result = result + CHAR;
        }
    }
    /**
     * Get description of the task
     * @return String of description and numbers of append times.
     */
    public String toString(){
        return "Append "+count+" chars to String.";
    }
}
