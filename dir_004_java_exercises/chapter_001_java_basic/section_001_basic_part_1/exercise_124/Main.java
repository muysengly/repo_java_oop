import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        int[] nums = {1, 2, 4, 5, 6};
       int target = 5;
     // target = 0;
     // target = 7;
     // Call the searchInsert function and print the result
        System.out.print(searchInsert(nums, target)); 
    }

    public static int searchInsert(int[] nums1, int target) {
        // Check if the input array is empty or null
        if (nums1 == null || nums1.length == 0) {
            return 0;
        }
        // Initialize variables for binary search
        int start = 0;
        int end = nums1.length - 1;
        int mid = start + (end - start) / 2;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            // Compare the middle element with the target
            if (nums1[mid] == target) {
                return mid;
            } else if (nums1[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        // Determine the insertion position based on binary search results
        if (nums1[start] >= target) {
            return start;
        } else if (nums1[start] < target && target <= nums1[end]) {
            return end;
        } else {
            return end + 1;
        }
    }
}
