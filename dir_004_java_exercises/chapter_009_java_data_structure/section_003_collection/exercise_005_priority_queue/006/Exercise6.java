import java.util.PriorityQueue;

public class Exercise6 {
  public static void main(String[] args) {
    // create an empty Priority Queue
    PriorityQueue<String> pq = new PriorityQueue<String>();
    // use add() method to add values in the Priority Queue
    pq.add("Red");
    pq.add("Green");
    pq.add("Black");
    pq.add("Pink");
    pq.add("orange");
    System.out.println("Priority Queue: " + pq);
    System.out.println("Size of the Priority Queue: " + pq.size());
  }
}
