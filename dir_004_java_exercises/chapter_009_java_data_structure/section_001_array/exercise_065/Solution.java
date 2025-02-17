
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // Method to find the maximum difference between two elements in the array.
  public static int diff_between_two_elemnts(int[] nums) {
    // Initialize a variable to store the maximum difference.
    int diff_two_elemnts = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        // Update the maximum difference with the maximum of the current difference and
        // the previous maximum.
        diff_two_elemnts = Integer.max(diff_two_elemnts, nums[j] - nums[i]);
      }
    }

    return diff_two_elemnts;
  }

  // Main method to demonstrate finding the maximum difference between two
  // elements in an array.
  public static void main(String[] args) {
    // Initialize an array.
    int[] nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums));

    // Call the 'diff_between_two_elemnts' method to find and print the maximum
    // difference.
    System.out.print(
        "The maximum difference between two elements of the said array elements\n" + diff_between_two_elemnts(nums));
  }
}
