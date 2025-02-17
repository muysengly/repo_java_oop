import java.util.*;

public class Example3 {
  public static void main(String args[]) {

    // Create a tree map
    TreeMap<String, String> tree_map1 = new TreeMap<String, String>();

    // Put elements to the map
    tree_map1.put("C1", "Red");
    tree_map1.put("C2", "Green");
    tree_map1.put("C3", "Black");
    tree_map1.put("C4", "White");

    System.out.println(tree_map1);
    if (tree_map1.containsKey("C1")) {
      System.out.println("The Tree Map contains key C1");
    } else {
      System.out.println("The Tree Map does not contain key C1");
    }
    if (tree_map1.containsKey("C5")) {
      System.out.println("The Tree Map contains key C5");
    } else {
      System.out.println("The TreeMap does not contain key C5");
    }
  }
}
