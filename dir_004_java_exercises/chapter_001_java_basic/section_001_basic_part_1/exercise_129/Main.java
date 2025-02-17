import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define an array of integers
        int nums[] = { 10, 20, 10, 20, 30, 40, 40, 30, 50 };

        // Declare a variable to store the result
        int result;

        // Display the source array
        System.out.println("Source Array : " + Arrays.toString(nums));

        // Calculate and display the number that appears only once
        result = getSingleNumber(nums);
        System.out.println("\n" + result + " appears only once.");
    }

    public static int getSingleNumber(int[] nums) {
        // Check if the array is null or empty
        if (nums == null || nums.length == 0) {
            return -1;
        }

        // Initialize the result to 0
        int result = 0;

        // Calculate the number that appears only once using XOR (^) operator
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        // Return the result
        return result;
    }
}
