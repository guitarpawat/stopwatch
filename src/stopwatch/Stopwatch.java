package stopwatch;

/**
 * A stopwatch that measures time between starting time
 * to stopping time or to the current time.
 * @author Pawat Nakpiphatkul
 * @version 1.0
 */
public class Stopwatch {
    /** Constant for convert nanoseconds to seconds. */
    private static final double NANOSECONDS = 1.0E-9;
    /** To store starting time in nanoseconds. */
    private long startTime;
    /** Store the time between starting time and stopping time */
    private long totalTime;
    /**
     * Initialize constructor of Stopwatch.
     * Set the startTime and totalTime to minimum value of Long.
     */
    public Stopwatch(){
        totalTime = Long.MIN_VALUE;
        startTime = Long.MIN_VALUE;
    }
    /**
     * Start the stopwatch if it is not running.
     */
    public void start(){
        if(!isRunning())
            startTime = System.nanoTime();
    }
    /**
     * Stop the stopwatch and store totalTime in nanoseconds
     * if it is currently running.
     */
    public void stop(){
        if(isRunning())
            totalTime = System.nanoTime()-startTime;
    }
    /**
     * Get the elapsed of the stopwatch.
     * @return the total time in seconds if stopwatch has stopped
     *  else get the time between starting time until current time.
     */
    public double getElapsed(){
        if(isRunning())
            return (System.nanoTime()-startTime)*NANOSECONDS;
        else
            return totalTime*NANOSECONDS;
    }
    /**
     * Get that the stopwatch is currently running or not.
     * @return true if it is currently running else return false.
     */
    public boolean isRunning(){
        return startTime!=Long.MIN_VALUE;
    }
}
//package stopwatch;
//
///**
// * A stopwatch that measures time between starting time
// * to stopping time or to the current time.
// * @author Pawat Nakpiphatkul
// * @version 1.0
// */
//public class Stopwatch {
//    /** Constant for convert nanoseconds to seconds. */
//    private static final double NANOSECONDS = 1.0E-9;
//    /** To store starting time in nanoseconds. */
//    private long startTime;
//    /** Store the time between starting time and stopping time */
//    private long totalTime;
//    /**
//     * Initialize constructor of Stopwatch.
//     * Set the startTime and totalTime to minimum value of Long.
//     */
//    public Stopwatch(){
//        totalTime = Long.MIN_VALUE;
//        startTime = Long.MIN_VALUE;
//    }
//    /**
//     * Start the stopwatch if it is not running.
//     */
//    public void start(){
//        if(!isRunning())
//            startTime = System.nanoTime();
//    }
//    /**
//     * Stop the stopwatch and store totalTime in nanoseconds
//     * if it is currently running.
//     */
//    public void stop(){
//        if(isRunning())
//            totalTime = System.nanoTime()-startTime;
//    }
//    /**
//     * Get the elapsed of the stopwatch.
//     * @return the total time in seconds if stopwatch has stopped
//     *  else get the time between starting time until current time.
//     */
//    public double getElapsed(){
//        if(isRunning())
//            return (System.nanoTime()-startTime)*NANOSECONDS;
//        else
//            return totalTime*NANOSECONDS;
//    }
//    /**
//     * Get that the stopwatch is currently running or not.
//     * @return true if it is currently running else return false.
//     */
//    public boolean isRunning(){
//        return startTime!=Long.MIN_VALUE;
//    }
//}
