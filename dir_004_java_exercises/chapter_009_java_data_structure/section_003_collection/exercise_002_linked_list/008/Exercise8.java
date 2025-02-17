import java.util.LinkedList;

public class Exercise8 {
  public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> l_list = new LinkedList<String>();
    // use add() method to add values in the linked list
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    System.out.println("Original linked list:" + l_list);
    // Add an element at the end of a linked list
    l_list.offerLast("Pink");
    System.out.println("Final linked list:" + l_list);
  }
}
