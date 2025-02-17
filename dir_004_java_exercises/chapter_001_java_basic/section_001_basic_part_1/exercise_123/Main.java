import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(-2);
        nums.add(1);
        nums.add(-3);
        nums.add(4);
        // Call the min_SubArray function and print the result
        System.out.print(min_SubArray(nums)); 
    }

    public static int min_SubArray(ArrayList<Integer> nums) { 
        // Create an array to store the same integers for dynamic programming
        int[] nums1 = new int[nums.size()];
        nums1[0] = nums.get(0);
        // Initialize the minimum value to the first element
        int min = nums1[0];
        // Loop through the ArrayList to calculate minimum subarray sum
        for (int i = 1; i < nums.size(); ++i) {
            // Calculate the minimum of the current element and the sum of the previous subarray
            nums1[i] = Math.min(nums.get(i), nums.get(i) + nums1[i - 1]);
            // Update the minimum value if needed
            min = Math.min(min, nums1[i]);
        }
        // Return the minimum subarray sum
        return min;
    }
}
