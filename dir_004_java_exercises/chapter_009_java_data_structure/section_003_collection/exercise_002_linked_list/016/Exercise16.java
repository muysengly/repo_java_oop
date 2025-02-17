import java.util.*;

public class Exercise16 {
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
    System.out.println("Linked list before shuffling:\n" + l_list);
    Collections.shuffle(l_list);
    System.out.println("Linked list after shuffling:\n" + l_list);
  }
}
