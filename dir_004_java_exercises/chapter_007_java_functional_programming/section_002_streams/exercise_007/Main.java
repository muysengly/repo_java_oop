import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
    System.out.println("Original list of numbers: " + nums);
    // Find the maximum value
    Integer max_val = nums.stream()
      .max(Integer::compare)
      .orElse(null);

    // Find the minimum value
    Integer min_val = nums.stream()
      .min(Integer::compare)
      .orElse(null);

    System.out.println("\nMaximum value of the said list: " + max_val);
    System.out.println("\nMinimum value of the said list: " + min_val);
  }
}
