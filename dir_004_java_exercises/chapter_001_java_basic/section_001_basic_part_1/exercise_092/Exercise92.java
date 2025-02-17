import java.util.*;

public class Exercise92 {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] nums = { 5, 7, 2, 4, 9 };

        // Initialize counters for even and odd numbers
        int ctr_even = 0, ctr_odd = 0;

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(nums));

        // Iterate through the array to count even and odd numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                // Increment the counter for even numbers
                ctr_even++;
            } else {
                // Increment the counter for odd numbers
                ctr_odd++;
            }
        }

        // Print the counts of even and odd elements in the array
        System.out.printf("\nNumber of even elements in the array: %d", ctr_even);
        System.out.printf("\nNumber of odd elements in the array: %d", ctr_odd);
        System.out.printf("\n");
    }
}
