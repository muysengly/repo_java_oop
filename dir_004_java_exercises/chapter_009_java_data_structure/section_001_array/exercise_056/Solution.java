
// Import the necessary Java class for working with arrays.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // A method to sort binary numbers in an array.
  public static void sort_binary_nums(int[] b_nums) {
    int k = 0;

    // Iterate through the array to move all 0s to the front.
    for (int i = 0; i < b_nums.length; i++) {
      if (b_nums[i] == 0) {
        b_nums[k++] = 0;
      }
    }

    // Fill the remaining positions with 1s to sort the binary array.
    for (int i = k; i < b_nums.length; i++) {
      b_nums[k++] = 1;
    }
  }

  public static void main(String[] args) {
    // Define an array 'b_nums' containing binary numbers.
    int b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
    System.out.println("Original array: " + Arrays.toString(b_nums));

    // Sort the binary numbers in the array.
    sort_binary_nums(b_nums);
    System.out.println("After sorting: " + Arrays.toString(b_nums));
  }
}
