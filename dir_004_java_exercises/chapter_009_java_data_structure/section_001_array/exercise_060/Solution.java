
// Import necessary Java classes.
import java.util.Arrays;
import java.util.Random;

// Define a class named 'solution'.
public class Solution {
  // A method to shuffle an array using the Fisher-Yates algorithm.
  public static void shuffle(int nums[]) {
    for (int i = nums.length - 1; i >= 1; i--) {
      // Create a random number generator.
      Random rand = new Random();

      // Generate a random index j between 0 and i (inclusive).
      int j = rand.nextInt(i + 1);

      // Swap elements at indices i and j.
      swap_elements(nums, i, j);
    }
  }

  // A method to swap two elements in an array.
  private static void swap_elements(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    System.out.println("Original Array: " + Arrays.toString(nums));

    // Shuffle the array using the Fisher-Yates algorithm.
    shuffle(nums);

    System.out.println("Shuffled Array: " + Arrays.toString(nums));
  }
}
