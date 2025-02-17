import java.util.*;
import java.util.Map.Entry;

public class Example20 {
  public static void main(String args[]) {

    // Create a tree map
    TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();

    // Put elements to the map
    tree_map.put(10, "Red");
    tree_map.put(20, "Green");
    tree_map.put(40, "Black");
    tree_map.put(50, "White");
    tree_map.put(60, "Pink");

    // polling first entry
    System.out.println("Value before poll: " + tree_map);
    System.out.println("Value returned: " + tree_map.pollLastEntry());
    System.out.println("Value after poll: " + tree_map);
  }
}
