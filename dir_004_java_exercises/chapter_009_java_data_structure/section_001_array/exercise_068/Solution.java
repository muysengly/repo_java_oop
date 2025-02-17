
// Import the necessary Java classes.
import java.util.*;
import java.util.List;

// Define the 'solution' class.
public class Solution {
  // Main method to demonstrate permutation of arrays.
  public static void main(String[] args) throws Exception {
    // Initialize the first array.
    int[] nums1 = { 1, 2, 3, 4 };
    System.out.println("\nOriginal array 1: " + Arrays.toString(nums1));
    // Calculate and display the permutations of the first array.
    List<List<Integer>> result1 = new Solution().permute(nums1);
    System.out.println("\nPossible permutations of the first array:");
    result1.forEach(System.out::println);

    // Initialize the second array.
    int[] nums2 = { 1, 2, 3 };
    System.out.println("\nOriginal array 2: " + Arrays.toString(nums2));
    // Calculate and display the permutations of the second array.
    List<List<Integer>> result2 = new Solution().permute(nums2);
    System.out.println("\nPossible permutations of the second array:");
    result2.forEach(System.out::println);
  }

  // Method to calculate permutations of an array.
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Permutation(0, nums, result);
    return result;
  }

  // Recursive method to generate permutations.
  private void Permutation(int i, int[] nums, List<List<Integer>> result) {
    if (i == nums.length - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : nums)
        list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = nums.length; j < l; j++) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
        Permutation(i + 1, nums, result);
        temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
  }
}
