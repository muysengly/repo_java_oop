
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // Method to find the length and elements of the longest bitonic subarray.
  public static int find_Bitonic_Subarray(int[] nums) {
    // Initialize arrays to store increasing and decreasing lengths.
    int[] incre_array = new int[nums.length];
    int[] decre_array = new int[nums.length];

    // Initialize the first element of the increasing array.
    incre_array[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      incre_array[i] = 1;
      // Calculate increasing lengths based on the previous element.
      if (nums[i - 1] < nums[i]) {
        incre_array[i] = incre_array[i - 1] + 1;
      }
    }

    // Initialize the last element of the decreasing array.
    decre_array[nums.length - 1] = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      decre_array[i] = 1;
      // Calculate decreasing lengths based on the next element.
      if (nums[i] > nums[i + 1]) {
        decre_array[i] = decre_array[i + 1] + 1;
      }
    }

    int lbs_len = 1;
    int start = 0, end = 0;

    for (int i = 0; i < nums.length; i++) {
      // Calculate the longest bitonic subarray.
      if (lbs_len < incre_array[i] + decre_array[i] - 1) {
        lbs_len = incre_array[i] + decre_array[i] - 1;
        start = i - incre_array[i] + 1;
        end = i + decre_array[i] - 1;
      }
    }

    // Print the longest bitonic subarray.
    System.out.println("The longest bitonic subarray is [" + start + "," + end + "]");
    System.out.print("Elements of the said sub-array: ");
    for (int x = start; x <= end; x++) {
      System.out.print(nums[x] + " ");
    }

    System.out.println("\nThe length of the longest bitonic subarray is " + lbs_len);

    return lbs_len;
  }

  // Main method to demonstrate finding the longest bitonic subarray in an array.
  public static void main(String[] args) {
    // Initialize an array.
    int[] nums = { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 };
    System.out.println("\nOriginal array: " + Arrays.toString(nums));

    // Call the 'find_Bitonic_Subarray' method to find and print the longest bitonic
    // subarray.
    find_Bitonic_Subarray(nums);
  }
}
