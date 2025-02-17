import java.util.ArrayList;
import java.util.Collections;

public class Exercise16 {
  public static void main(String[] args) {
    ArrayList<String> c1 = new ArrayList<String>();
    c1.add("Red");
    c1.add("Green");
    c1.add("Black");
    c1.add("White");
    c1.add("Pink");
    System.out.println("Original array list: " + c1);
    ArrayList<String> newc1 = (ArrayList<String>) c1.clone();
    System.out.println("Cloned array list: " + newc1);
  }
}
