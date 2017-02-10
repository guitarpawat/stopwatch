package stopwatch;

/**
 * For measure the time of each task and print out the time.
 * @author Pawat Nakpiphatkul
 */
public class TaskTimer {
    /** Initialize Stopwatch */
    private static Stopwatch stopwatch;
    /** Initialize constructor of TaskTimer object */
    public TaskTimer(){
        stopwatch = new Stopwatch();
    }
    /**
     * Run and print description of task with run time.
     * @param runnable is a task to run.
     */
    public static void measureAndPrint(Runnable runnable){
        stopwatch.start();
        runnable.run();
        stopwatch.stop();
        System.out.println(runnable);
        System.out.println("Total time : "+String.format("%.6f",stopwatch.getElapsed())+" seconds");
    }
}
