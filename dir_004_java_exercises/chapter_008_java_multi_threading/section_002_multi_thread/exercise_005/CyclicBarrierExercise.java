import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExercise {
    private static final int NUM_THREADS = 3;
    private static final CyclicBarrier barrier = new CyclicBarrier(NUM_THREADS, new BarrierAction());

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new Worker());
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Worker implements Runnable {
        public void run() {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting at the barrier.");
                barrier.await();

                // Perform work after reaching the barrier

                System.out.println("Thread " + Thread.currentThread().getName()
                        + " has crossed the barrier and continued execution.");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    static class BarrierAction implements Runnable {
        public void run() {
            System.out.println("Barrier reached! All threads have arrived at the barrier.");
        }
    }
}
