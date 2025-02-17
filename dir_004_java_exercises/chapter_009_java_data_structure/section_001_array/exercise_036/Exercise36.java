
// Import necessary classes from Java libraries.
import java.util.ArrayList;
import java.util.List;

// Define a class named Exercise36.
public class Exercise36 {
  // The main method for executing the program.
  public static void main(String[] args) {
    // Initialize an array of integers.
    int[] input = { 1, -2, 0, 5, -1, -4 };
    int target = 2;

    // Create an instance of Exercise36.
    Exercise36 r = new Exercise36();

    // Call the threeSum method and print the result.
    System.out.println(r.threeSum(input, target));
  }

  // Define a method named threeSum that takes an array of integers and an integer
  // target as input.
  public List<List<Integer>> threeSum(int[] nums, int target) {
    // Create a List of Lists to store the triplets that sum up to the target.
    List<List<Integer>> my_List = new ArrayList<List<Integer>>();

    // Iterate through the elements of the input array.
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        for (int k = j; k < nums.length; k++) {
          // Check if three distinct elements (i, j, k) sum up to the target.
          if (i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)) {
            // Create a List to store the triplet and add it to the result List.
            List<Integer> inner_List = new ArrayList<Integer>(3);
            inner_List.add(nums[i]);
            inner_List.add(nums[j]);
            inner_List.add(nums[k]);
            my_List.add(inner_List);
          }
        }
      }
    }

    // Return the List of triplets that satisfy the condition.
    return my_List;
  }
}
