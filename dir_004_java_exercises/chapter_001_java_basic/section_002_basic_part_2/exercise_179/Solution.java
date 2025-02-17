
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Initializing an array of integers
        int[] nums = { 9, 9, 9, 9 };

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(nums));

        // Printing the array of digits after adding one to the input array
        System.out.println("Array of digits: " + Arrays.toString(plus_One_digit(nums)));
    }

    // Method to add one to the last digit of the input array
    public static int[] plus_One_digit(int[] digits_nums) {
        // Looping through the array from the end to the start
        for (int i = digits_nums.length - 1; i > -1; --i) {
            // Checking if the digit is not 9
            if (digits_nums[i] != 9) {
                digits_nums[i] += 1; // Incrementing the digit by 1

                // Setting the digits after the incremented digit to 0
                for (int j = i + 1; j < digits_nums.length; ++j) {
                    digits_nums[j] = 0;
                }

                return digits_nums; // Returning the updated array
            }
        }

        // If all digits are 9, creating a new array with an additional digit for
        // carrying over 1
        int[] result = new int[digits_nums.length + 1];
        result[0] = 1; // Setting the first digit to 1

        return result; // Returning the new array with the carried over 1
    }
}
