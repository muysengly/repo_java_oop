import java.util.*;
import java.util.Map.Entry;

public class Example8 {
  public static void main(String args[]) {

    // Create a tree map
    TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

    // Put elements to the map
    tree_map1.put("C1", "Red");
    tree_map1.put("C2", "Green");
    tree_map1.put("C3", "Black");
    tree_map1.put("C4", "White");

    System.out.println("Orginal TreeMap content: " + tree_map1);
    System.out.println("Greatest key: " + tree_map1.firstEntry());
    System.out.println("Least key: " + tree_map1.lastEntry());
  }
}
