import java.util.LinkedList;
import java.util.Iterator;

public class Exercise10 {
  public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> l_list = new LinkedList<String>();
    // use add() method to add values in the linked list
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("Pink");
    l_list.add("orange");

    // print original list
    System.out.println("Original linked list:" + l_list);

    // Find first element of the List
    Object first_element = l_list.getFirst();
    System.out.println("First Element is: " + first_element);

    // Find last element of the List
    Object last_element = l_list.getLast();
    System.out.println("Last Element is: " + last_element);
  }
}
