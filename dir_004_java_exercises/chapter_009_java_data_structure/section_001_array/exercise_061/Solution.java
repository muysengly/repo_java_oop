
// Import the necessary Java class.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // A private method to swap two elements in an array.
  private static void swap_nums(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  // A method to rearrange an array such that every second element is greater
  // than its left and right elements.
  public static void rearrange_Array_nums(int[] nums) {
    for (int i = 1; i < nums.length; i += 2) {
      // Check if the element to the left is greater and swap if needed.
      if (nums[i - 1] > nums[i]) {
        swap_nums(nums, i - 1, i);
      }

      // Check if the element to the right is greater and swap if needed.
      if (i + 1 < nums.length && nums[i + 1] > nums[i]) {
        swap_nums(nums, i + 1, i);
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14 };
    System.out.println("Original array:\n" + Arrays.toString(nums));

    // Rearrange the array so that every second element is greater than its
    // left and right elements.
    rearrange_Array_nums(nums);

    System.out.println("\nArray with every second element is greater than its left and right elements:\n"
        + Arrays.toString(nums));
  }
}
