import java.util.*;

public class Solution {
    // Function to find the subarray with a sum of zero in the given array
    public static List<Integer> subarraySum(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        // Check if the input array is null or empty, and return an empty list if so
        if (nums == null || nums.length == 0) {
            return temp;
        }

        int pre_Sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(pre_Sum, -1);

        // Iterate through the elements of the input array
        for (int i = 0; i < nums.length; i++) {
            pre_Sum += nums[i];

            // Check if the current prefix sum already exists in the map
            if (map.containsKey(pre_Sum)) {
                temp.add(map.get(pre_Sum) + 1); // Add the start index of the subarray
                temp.add(i); // Add the end index of the subarray
                return temp; // Return the list of indices
            }

            // If the prefix sum is not found, add it to the map with its index
            map.put(pre_Sum, i);
        }

        return temp; // Return an empty list if no subarray with a sum of zero is found
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, -6, 5, 4 };

        // Print the original array and the indices of the subarray with a sum of zero
        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println(
                "Index of the subarray of the said array where the sum of numbers is zero: " + subarraySum(nums));
    }
}
