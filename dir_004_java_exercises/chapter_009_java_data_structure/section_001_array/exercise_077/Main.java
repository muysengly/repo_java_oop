
// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of numbers.
    int[] nums = { 1, -2, 5, -4, 3, -6 };
    // Alternatively: int[] nums = {1, 2 ,5, 4, 3, 6};
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));

    // Call the 'test' method to check if the array alternates between positive and
    // negative values.
    boolean result = test(nums);
    System.out.printf("\nCheck the said array of integers alternates between positive and negative values! " + result);
  }

  // Define the 'test' method to check if the array alternates between positive
  // and negative values.
  public static boolean test(int[] nums) {
    // Check if the array contains a single element with the value 0; return false
    // in this case.
    if (nums.length == 1 && nums[0] == 0)
      return false;
    // Iterate through the 'nums' array.
    for (int i = 0; i < nums.length - 1; i++)
      // Check if the product of adjacent elements is non-negative (i.e., both
      // positive or both negative); return false in this case.
      if (nums[i] * nums[i + 1] >= 0)
        return false;
    // If no consecutive elements with the same sign are found, return true.
    return true;
  }
}
