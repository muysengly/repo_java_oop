//SemaphoreExercise.java
import java.util.concurrent.Semaphore;

public class SemaphoreExercise {
  private static final int NUM_THREADS = 5;
  private static final int NUM_PERMITS = 2;

  public static void main(String[] args) {
    Semaphore semaphore = new Semaphore(NUM_PERMITS);

    Thread[] threads = new Thread[NUM_THREADS];
    for (int i = 0; i < NUM_THREADS; i++) {
      threads[i] = new Thread(new Worker(semaphore));
      threads[i].start();
    }

    try {
      for (Thread thread: threads) {
        thread.join();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  static class Worker implements Runnable {
    private Semaphore semaphore;

    public Worker(Semaphore semaphore) {
      this.semaphore = semaphore;
    }

    public void run() {
      try {
        semaphore.acquire();

        // Perform work that requires the semaphore
        System.out.println("Thread " + Thread.currentThread().getName() + " acquired the semaphore.");
        Thread.sleep(2000); // Simulating work
        System.out.println("Thread " + Thread.currentThread().getName() + " released the semaphore.");

        semaphore.release();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
