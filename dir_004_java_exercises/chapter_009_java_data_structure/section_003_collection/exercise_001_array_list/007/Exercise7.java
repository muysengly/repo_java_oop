import java.util.*;

public class Exercise7 {
  public static void main(String[] args) {
    // Creae a list and add some colors to the list
    List<String> list_Strings = new ArrayList<String>();
    list_Strings.add("Red");
    list_Strings.add("Green");
    list_Strings.add("Orange");
    list_Strings.add("White");
    list_Strings.add("Black");
    // Search the value Red
    if (list_Strings.contains("Red")) {
      System.out.println("Found the element");
    } else {
      System.out.println("There is no such element");
    }
  }
}
