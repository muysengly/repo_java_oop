import java.util.*;

public class Example11 {
  public static void main(String[] args) {

    // Create Priority Queue
    PriorityQueue<String> pq1 = new PriorityQueue<String>();
    // use add() method to add values in the Priority Queue
    pq1.add("Red");
    pq1.add("Green");
    pq1.add("Black");
    pq1.add("White");
    System.out.println("Original Priority Queue: " + pq1);

    // Convert Priority Queue to a string representation
    String str1;
    str1 = pq1.toString();
    System.out.println("String representation of the Priority Queue: " + str1);
  }
}
