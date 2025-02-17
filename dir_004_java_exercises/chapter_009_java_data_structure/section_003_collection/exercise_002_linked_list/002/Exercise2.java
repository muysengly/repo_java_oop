import java.util.LinkedList;

public class Exercise2 {
  public static void main(String[] args) {
    // create an empty linked list
    LinkedList<String> l_list = new LinkedList<String>();
    // use add() method to add values in the linked list
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("White");
    l_list.add("Pink");
    // Print the linked list
    for (String element : l_list) {
      System.out.println(element);
    }
  }
}
