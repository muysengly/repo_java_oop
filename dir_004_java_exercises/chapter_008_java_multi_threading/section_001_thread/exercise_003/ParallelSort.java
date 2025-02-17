import java.util.Arrays;

public class ParallelSort {
  private static final int ARRAY_SIZE = 400;
  private static final int NUM_THREADS = 4;

  public static void main(String[] args) {
    int[] array = createArray();
    System.out.println("Before sorting: " + Arrays.toString(array));

    Thread[] threads = new Thread[NUM_THREADS];
    int segmentSize = ARRAY_SIZE / NUM_THREADS;

    for (int i = 0; i < NUM_THREADS; i++) {
      int startIndex = i * segmentSize;
      int endIndex = (i == NUM_THREADS - 1) ? ARRAY_SIZE - 1 : (startIndex + segmentSize - 1);
      threads[i] = new Thread(new SortTask(array, startIndex, endIndex));
      threads[i].start();
    }

    for (Thread thread: threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    mergeSort(array, 0, ARRAY_SIZE - 1);

    System.out.println("After sorting: " + Arrays.toString(array));
  }

  private static int[] createArray() {
    int[] array = new int[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = (int)(Math.random() * 400); // Generate random numbers between 0 and 400
    }
    return array;
  }

  private static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }

  private static void merge(int[] array, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;

    while (i <= mid && j <= right) {
      if (array[i] <= array[j]) {
        temp[k++] = array[i++];
      } else {
        temp[k++] = array[j++];
      }
    }

    while (i <= mid) {
      temp[k++] = array[i++];
    }

    while (j <= right) {
      temp[k++] = array[j++];
    }

    System.arraycopy(temp, 0, array, left, temp.length);
  }

  static class SortTask implements Runnable {
    private int[] array;
    private int startIndex;
    private int endIndex;

    public SortTask(int[] array, int startIndex, int endIndex) {
      this.array = array;
      this.startIndex = startIndex;
      this.endIndex = endIndex;
    }

    @Override
    public void run() {
      Arrays.sort(array, startIndex, endIndex + 1);
    }
  }
}
