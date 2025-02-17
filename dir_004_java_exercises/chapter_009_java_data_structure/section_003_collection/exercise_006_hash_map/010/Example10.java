import java.util.*;

public class Example10 {
  public static void main(String args[]) {
    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
    hash_map.put(1, "Red");
    hash_map.put(2, "Green");
    hash_map.put(3, "Black");
    hash_map.put(4, "White");
    hash_map.put(5, "Blue");
    // get value of key 3
    String val = (String) hash_map.get(3);
    // check the value
    System.out.println("Value for key 3 is: " + val);
  }
}
