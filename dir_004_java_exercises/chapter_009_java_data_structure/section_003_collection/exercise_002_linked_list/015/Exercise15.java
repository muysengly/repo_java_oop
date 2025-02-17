import java.util.*;

public class Exercise15 {
  public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> l_list = new LinkedList<String>();
    // use add() method to add values in the linked list
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("Pink");
    l_list.add("orange");
    // print the list
    System.out.println("The Original linked list: " + l_list);

    // Swapping 1st(index 0) element(Red) with the 3rd(index 2) element (Black)
    Collections.swap(l_list, 0, 2);
    System.out.println("The New linked list after swap: " + l_list);
  }
}
