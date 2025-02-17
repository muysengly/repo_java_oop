import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prime_Sum {
  private static final int NUM_THREADS = 4;

  public static void main(String[] args) {
    int limit = 10000000;

    Thread[] threads = new Thread[NUM_THREADS];
    PrimeSumTask[] tasks = new PrimeSumTask[NUM_THREADS];

    int segmentSize = limit / NUM_THREADS;
    int start = 2;
    int end = segmentSize;

    long startTime = System.currentTimeMillis();

    for (int i = 0; i < NUM_THREADS; i++) {
      if (i == NUM_THREADS - 1) {
        // Last thread takes care of remaining numbers
        end = limit;
      }

      tasks[i] = new PrimeSumTask(start, end);
      threads[i] = new Thread(tasks[i]);
      threads[i].start();

      start = end + 1;
      end += segmentSize;
    }

    long sum = 0;

    for (int i = 0; i < NUM_THREADS; i++) {
      try {
        threads[i].join();
        sum += tasks[i].getSum();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    long endTime = System.currentTimeMillis();

    System.out.println("Sum of prime numbers up to " + limit + ": " + sum);
    System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
  }

  static class PrimeSumTask implements Runnable {
    private int start;
    private int end;
    private long sum;

    public PrimeSumTask(int start, int end) {
      this.start = start;
      this.end = end;
      this.sum = 0;
    }

    public long getSum() {
      return sum;
    }

    private boolean isPrime(int number) {
      if (number < 2) {
        return false;
      }

      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          return false;
        }
      }

      return true;
    }

    @Override
    public void run() {
      for (int i = start; i <= end; i++) {
        if (isPrime(i)) {
          sum += i;
        }
      }
    }
  }
}
