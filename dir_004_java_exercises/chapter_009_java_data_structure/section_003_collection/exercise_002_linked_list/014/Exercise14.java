import java.util.*;

public class Exercise14 {
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

    // Removing all the elements from the linked list
    l_list.clear();

    System.out.println("The New linked list: " + l_list);
  }
}
