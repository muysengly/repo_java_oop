// Import the necessary Java classes.
import java.util.Arrays;

// Define the 'solution' class.
public class Solution {
  public static void main(String[] args)
  {
    // Initialize the 'nums' array and the target sum 'm_len'.
    int[] nums = {1, 2, 3, 4, 6};
    int m_len = 8;

    // Find and store the minimum subarray length with a sum of 'm_len'.
    int result = min_SubArray_length(m_len, nums);

    // Print the original array and the minimum subarray length.
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));
    System.out.printf("\nMinimum length of a contiguous subarray of which the sum is %d: %d", m_len, result);
  }

  public static int min_SubArray_length(int s, int[] nums) {
    // Initialize variables for sum, counter, and minimum length.
    int sum = 0, ctr = 0, min_len = Integer.MAX_VALUE;
    
    // Iterate through the 'nums' array.
    for (int i = 0, j = 0; j < nums.length; ) {
      // Check if the current element is greater than or equal to the target sum 's'.
      if (nums[j] >= s) {
        return 1; // A single element is sufficient.
      } else {
        // Update the sum and counter with the current element.
        sum += nums[j];
        ctr++;
        
        // Check if the current subarray sum is greater than or equal to 's'.
        if (sum >= s) {
          // Update the minimum length, then shrink the subarray from the front.
          min_len = Math.min(min_len, ctr);
          while (j > i) {
            sum -= nums[i];
            ctr--;
            i++;
            if (sum < s) break;
            min_len = Math.min(min_len, ctr);
          }
        }
      }
      j++;
    }
    
    // Check if the minimum length was updated, and return it.
    if (min_len == Integer.MAX_VALUE) {
      return 0; // No subarray found.
    }
    return min_len;
  }
}
