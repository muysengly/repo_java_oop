import java.util.*;

public class Exercise12 {
  public static void main(String[] args) {
    // Create a empty hash set
    HashSet<String> h_set = new HashSet<String>();
    // use add() method to add values in the hash set
    h_set.add("Red");
    h_set.add("Green");
    h_set.add("Black");
    h_set.add("White");
    System.out.println("Original hash set contains: " + h_set);
    // clear() method removes all the elements from a hash set
    // and the set becomes empty.
    h_set.clear();

    // Display original hash set content again
    System.out.println("HashSet content: " + h_set);
  }
}
