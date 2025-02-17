import java.util.PriorityQueue;

public class Exercise7 {
  public static void main(String[] args) {
    // Create a empty Priority Queue
    PriorityQueue<String> pq1 = new PriorityQueue<String>();
    // use add() method to add values in the Priority Queue
    pq1.add("Red");
    pq1.add("Green");
    pq1.add("Black");
    pq1.add("White");
    System.out.println("First Priority Queue: " + pq1);
    PriorityQueue<String> pq2 = new PriorityQueue<String>();
    pq2.add("Red");
    pq2.add("Pink");
    pq2.add("Black");
    pq2.add("Orange");
    System.out.println("Second Priority Queue: " + pq2);
    // comparison output in Priority Queue
    for (String element : pq1) {
      System.out.println(pq2.contains(element) ? "Yes" : "No");
    }
  }
}
