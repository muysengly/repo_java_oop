
// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of numbers.
    int[] nums = { 1, -2, -5, -4, 3, -6 };
    // Alternative input arrays:
    // int[] nums = {1, 2, 5, -4, 3, -6};
    // int[] nums = {1, 2, -5, -4, -3, 6};
    System.out.printf("Original array of numbers:\n" + Arrays.toString(nums));

    // Call the 'test' method to check for negative dominance in the array.
    boolean result = test(nums);
    System.out.printf("\nCheck Negative Dominance in the said array! " + result);
  }

  // Define the 'test' method to check for negative dominance in the array.
  public static boolean test(int[] nums) {
    // Use IntStream to process the array and check for negative dominance.
    return IntStream.of(nums).distinct().filter(element -> element < 0).count() > IntStream.of(nums).distinct()
        .filter(element -> element > 0).count();
  }
}
