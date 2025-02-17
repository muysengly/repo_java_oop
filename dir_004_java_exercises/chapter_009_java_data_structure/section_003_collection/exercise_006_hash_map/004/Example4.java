import java.util.*;

public class Example4 {
  public static void main(String args[]) {
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    hash_map.put(1, "Red");
    hash_map.put(2, "Green");
    hash_map.put(3, "Black");
    hash_map.put(4, "White");
    hash_map.put(5, "Blue");
    // print the map
    System.out.println("The Original linked map: " + hash_map);
    // Removing all the elements from the linked map
    hash_map.clear();
    System.out.println("The New map: " + hash_map);
  }
}
