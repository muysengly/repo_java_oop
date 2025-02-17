import java.util.*;

public class Exercise22 {
  public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> c1 = new LinkedList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");
    System.out.println("Original linked list: " + c1);

    // Checks whether the color "Green" exists or not.
    if (c1.contains("Green")) {
      System.out.println("Color Green is present in the linked list.");
    } else {
      System.out.println("Color Green is not present in the linked list.");
    }

    // Checks whether the color "Orange" exists or not.
    if (c1.contains("Orange")) {
      System.out.println("Color Orange is present in the linked list.");
    } else {
      System.out.println("Color Orange is not present in the linked list.");
    }

  }
}
