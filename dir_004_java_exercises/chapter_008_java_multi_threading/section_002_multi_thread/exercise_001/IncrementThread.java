//IncrementThread.java
public class IncrementThread extends Thread {
    private Counter counter;
    private int incrementsPerThread;

    public IncrementThread(Counter counter, int incrementsPerThread) {
        this.counter = counter;
        this.incrementsPerThread = incrementsPerThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < incrementsPerThread; i++) {
            counter.increment();
        }
    }
}
