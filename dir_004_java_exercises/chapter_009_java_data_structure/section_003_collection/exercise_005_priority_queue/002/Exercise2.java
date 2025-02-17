import java.util.PriorityQueue;

public class Exercise2 {
  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();
    pq.add("Red");
    pq.add("Green");
    pq.add("Orange");
    pq.add("White");
    pq.add("Black");
    System.out.println("Elements of the Priority Queue: ");
    // iterate the Priority Queue
    for (String element : pq) {
      System.out.println(element);
    }
  }
}
