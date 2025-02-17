import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
    System.out.println("List of numbers: " + nums);
    // Find the second smallest element
    Integer secondSmallest = nums.stream()
      .distinct()
      .sorted()
      .skip(1)
      .findFirst()
      .orElse(null);

    // Find the second largest element
    Integer secondLargest = nums.stream()
      .distinct()
      .sorted((a, b) -> Integer.compare(b, a))
      .skip(1)
      .findFirst()
      .orElse(null);

    System.out.println("\nSecond smallest element: " + secondSmallest);
    System.out.println("\nSecond largest element: " + secondLargest);
  }
}
