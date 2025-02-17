import java.util.*;
import java.util.Map.Entry;

public class Example10 {
  public static void main(String args[]) {

    // Create a tree map
    TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

    // Put elements to the map
    tree_map1.put("C2", "Red");
    tree_map1.put("C1", "Green");
    tree_map1.put("C4", "Black");
    tree_map1.put("C3", "White");

    System.out.println("Orginal TreeMap content: " + tree_map1);
    System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
  }
}
