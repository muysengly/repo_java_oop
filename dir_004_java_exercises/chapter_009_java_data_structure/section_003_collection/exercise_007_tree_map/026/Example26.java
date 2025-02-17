import java.util.*;
import java.util.Map.Entry;

public class Example26 {
  public static void main(String args[]) {
    // Declare tree maps
    TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
    // Put elements to the map
    tree_map.put(10, "Red");
    tree_map.put(20, "Green");
    tree_map.put(40, "Black");
    tree_map.put(50, "White");
    tree_map.put(60, "Pink");
    System.out.println("Orginal TreeMap content: " + tree_map);
    System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingKey(20));
    System.out.println("Keys greater than or equal to 30: " + tree_map.ceilingKey(30));
    System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingKey(50));
  }
}
