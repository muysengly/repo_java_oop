import java.util.*;

public class Exercise9 {
  public static void main(String[] args) {
    List<String> List1 = new ArrayList<String>();
    List1.add("1");
    List1.add("2");
    List1.add("3");
    List1.add("4");
    System.out.println("List1: " + List1);
    List<String> List2 = new ArrayList<String>();
    List2.add("A");
    List2.add("B");
    List2.add("C");
    List2.add("D");
    System.out.println("List2: " + List2);
    // Copy List2 to List1
    Collections.copy(List1, List2);
    System.out.println("Copy List to List2,\nAfter copy:");
    System.out.println("List1: " + List1);
    System.out.println("List2: " + List2);
  }
}
