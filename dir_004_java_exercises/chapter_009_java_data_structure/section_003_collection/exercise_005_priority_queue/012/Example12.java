import java.util.*;

public class Example12 {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());

    // Add numbers in the Queue
    pq1.add(10);
    pq1.add(22);
    pq1.add(36);
    pq1.add(25);
    pq1.add(16);
    pq1.add(70);
    pq1.add(82);
    pq1.add(89);
    pq1.add(14);
    System.out.println("\nOriginal Priority Queue: " + pq1);

    System.out.print("\nMaximum Priority Queue: ");
    Integer val = null;
    while ((val = pq1.poll()) != null) {
      System.out.print(val + "  ");
    }
    System.out.print("\n");
  }
}
