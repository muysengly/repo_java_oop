import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // Find and print the maximum subarray sum
        System.out.print(max_SubArray(nums)); 
    }

    public static int max_SubArray(int[] nums) {
        // Check if the input array is empty
        if (nums.length < 1) {
            return 0;
        }
        // Initialize variables to track the maximum sum, its start and end indices
        int max = nums[0];
        int max_Begin = 0;
        int max_End = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        
        while (end < nums.length) {
            // Update the current sum with the value at the current end index
            sum += nums[end];
            if (sum < 0) {
                // If the current sum becomes negative, reset it and update the beginning index
                sum = 0;
                begin = end + 1;
            } else {
                // If the current sum is greater than the maximum, update the maximum
                if (sum > max) {
                    max = sum;
                    max_Begin = begin;
                    max_End = end;
                }
            }
            end++;
        }
        // Return the maximum sum of the subarray
        return max;
    }
}
