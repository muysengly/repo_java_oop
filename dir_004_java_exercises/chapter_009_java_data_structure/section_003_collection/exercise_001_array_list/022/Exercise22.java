import java.util.ArrayList;

public class Exercise22 {
  public static void main(String[] args) {
    ArrayList<String> c1 = new ArrayList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");
    System.out.println("\nOriginal array list: " + c1);
    System.out.println("\nPrint using index of an element: ");
    int no_of_elements = c1.size();
    for (int index = 0; index < no_of_elements; index++)
      System.out.println(c1.get(index));
  }
}
