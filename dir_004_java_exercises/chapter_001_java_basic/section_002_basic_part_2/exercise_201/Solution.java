// Import Arrays and other utility classes from java.util package
import java.util.Arrays;

// Main class for the solution
public class Solution {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Sample input array and target value for testing subset partitioning
        int[] nums = {1, 3, 3, 5, 6, 6};
        int target = 4;

        // Display the original array
        System.out.print("Original Array: " + Arrays.toString(nums));

        // Display the target value for subsets
        System.out.print("\nTarget of subsets: " + target);

        // Display the result after removing duplicate characters using partition_k_subsets function
        System.out.print("\nAfter removing duplicate characters: " + partition_k_subsets(nums, target));
    }

    // Function to recursively search for valid subsets with a specific sum
    static boolean search_subset(int used, int n, boolean[] flag, int[] nums, int target) {
        // Base case: all elements used, subset found
        if (n == 0) {
            return true;
        }

        // Check if the current subset has not been considered before
        if (!flag[used]) {
            // Mark the current subset as visited
            flag[used] = true;

            // Calculate the remaining sum needed for the subset
            int remain_num = (n - 1) % target + 1;

            // Iterate through the elements in the array
            for (int i = 0; i < nums.length; i++) {
                // Check if the current element is not used in the subset and its value is less than or equal to the remaining sum
                if ((((used >> i) & 1) == 0) && nums[i] <= remain_num) {
                    // Recursively search for the subset with the updated parameters
                    if (search_subset(used | (1 << i), n - nums[i], flag, nums, target)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Function to partition an array into k subsets with equal sum
    public static boolean partition_k_subsets(int[] nums, int k) {
        // Calculate the total sum of the elements in the array
        int sum = Arrays.stream(nums).sum();

        // Check if the sum is not divisible by k, return false
        if (sum % k > 0) {
            return false;
        }

        // Create a boolean array to track visited subsets
        boolean[] flag = new boolean[1 << nums.length];

        // Call the recursive search_subset function to check for valid subsets
        return search_subset(0, sum, flag, nums, sum / k);
    }
} 
