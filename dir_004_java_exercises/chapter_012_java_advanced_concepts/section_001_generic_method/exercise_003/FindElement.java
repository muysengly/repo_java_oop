// FindElement.java
// FindElement Class
import java.util.List;

public class FindElement {

  public static < T > int findIndexOfElement(List < T > list, T target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    List < Integer > numbers = List.of(1, 2, 3, 4, 5);
    List < String > colors = List.of("Red", "Green", "Blue", "Orange", "White");
    System.out.println("Original list elements:");
    System.out.println("Nums: " + numbers);
    System.out.println("Colors: " + colors);

    int index1 = findIndexOfElement(numbers, 3);
    System.out.println("\nIndex of 3 in numbers: " + index1); // Output: 2

    int index2 = findIndexOfElement(numbers, 6);
    System.out.println("Index of 6 in numbers: " + index2); // Output: -1

    int index3 = findIndexOfElement(colors, "Green");
    System.out.println("Index of \"Green\" in colors: " + index3); // Output: 1

    int index4 = findIndexOfElement(colors, "Black");
    System.out.println("Index of \"Black\" in colors: " + index4); // Output: -1
  }
}
