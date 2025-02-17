// Import utility classes from java.util package
import java.util.*;
// Main class
public class Main {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Sample input array and value of k for counting continuous subarrays
        int[] nums = {4, 2, 3, 3, 7, 2, 4};
        int k = 6;
        // Display the original array
        System.out.print("Original Array: " + Arrays.toString(nums));
        // Display the value of k
        System.out.print("\nValue of k: " + k);
        // Display the total number of continuous subarrays whose sum equals k
        System.out.print("\nTotal number of continuous subarrays: " + max_SubArray(nums, k));
    }
    // Function to find the total number of continuous subarrays whose sum equals k
    public static int max_SubArray(int[] nums, int k) {
        int ctr = 0; // Counter for total subarrays found
        int sum = 0; // Variable to track current sum
        Map<Integer, Integer> map = new HashMap<>(); // HashMap to store prefix sums and their counts
        // Initialize the map with a sum of 0 and count 1 (base case)
        map.put(0, 1);
        // Iterate through the input array
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Update the current sum
            // Check if there exists a prefix sum at (sum - k), increment counter if found
            if (map.containsKey(sum - k)) {
                ctr += map.get(sum - k);
            }
            // Update the count of the current sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // Return the total count of continuous subarrays whose sum equals k
        return ctr;
    }
}
