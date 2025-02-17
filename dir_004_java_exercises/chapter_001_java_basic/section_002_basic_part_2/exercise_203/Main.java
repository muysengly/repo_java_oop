import java.util.*;
// Main class named "Main"
public class Main {
    // Main method, the entry point of the program
    public static void main(String[] args) {		
        // Sample input array and value of k for finding maximum average
        int[] nums = {4, 2, 3, 3, 7, 2, 4};
        int k = 3;
        // Display the original array
        System.out.print("Original Array: " + Arrays.toString(nums));
        // Display the value of k
        System.out.print("\nValue of k: " + k);
        // Display the maximum average value
        System.out.print("\nMaximum average value: " + find_max_average(nums, k));
    }
    // Function to find the maximum average of subarrays of length k
    public static double find_max_average(int[] nums, int k) {
        int sum = 0;
        // Calculate the initial sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max_val = sum;
        // Iterate through the array to find the maximum average
        for (int i = k; i < nums.length; i++) {
            // Update the sum by removing the leftmost element and adding the current element
            sum = sum - nums[i - k] + nums[i];
            // Update the maximum value if the current sum is greater
            max_val = Math.max(max_val, sum);
        }
        // Return the maximum average value
        return (double) max_val / k;
    }
}
