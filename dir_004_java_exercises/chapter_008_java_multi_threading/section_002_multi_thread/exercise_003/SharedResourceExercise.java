
// SharedResourceExercise.java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceExercise {
    private static final int NUM_THREADS = 3;
    private static final int NUM_ITERATIONS = 5;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        SharedResource sharedResource = new SharedResource();

        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new Worker(lock, sharedResource));
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
        private Lock lock;
        private SharedResource sharedResource;

        public Worker(Lock lock, SharedResource sharedResource) {
            this.lock = lock;
            this.sharedResource = sharedResource;
        }

        public void run() {
            for (int i = 0; i < NUM_ITERATIONS; i++) {
                lock.lock();
                try {
                    sharedResource.doWork();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    static class SharedResource {
        public void doWork() {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread-> " + threadName + " is performing work.");
            // Perform work on the shared resource
        }
    }
}
