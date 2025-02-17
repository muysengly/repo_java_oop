
// Import necessary Java utility and language packages
import java.util.*;
import java.lang.*;

// Main class for the solution
public class Solution {
    // Constant representing the maximum number of characters
    static final int MAX_CHAR = 20;

    // Main method to execute the solution
    public static void main(String args[]) {
        // Input string with alphanumeric characters
        String str1 = "AND456HSE8";

        // Print the result of the arrange_String_nums function
        System.out.println(arrange_String_nums(str1));
    }

    // Function to arrange uppercase characters and sum of numbers in the given
    // string
    static String arrange_String_nums(String str1) {
        // Array to count the occurrences of each uppercase character
        int char_count[] = new int[MAX_CHAR];

        // Variable to store the sum of numeric characters
        int sum_num = 0;

        // Iterate through the characters in the input string
        for (int i = 0; i < str1.length(); i++) {
            // Check if the character is uppercase and update the char_count array
            if (Character.isUpperCase(str1.charAt(i)))
                char_count[str1.charAt(i) - 'A']++;
            else
                // Accumulate the numeric characters for sum
                sum_num = sum_num + (str1.charAt(i) - '0');
        }

        // Initialize a string to store the rearranged characters
        String rarr_part = "";

        // Iterate through the characters using their ASCII values
        for (int i = 0; i < MAX_CHAR; i++) {
            // Convert ASCII value to corresponding character
            char ch = (char) ('A' + i);

            // Append the characters to the result string based on their occurrences
            while (char_count[i]-- != 0)
                rarr_part = rarr_part + ch;
        }

        // If the sum of numeric characters is greater than 0, append it to the result
        // string
        if (sum_num > 0)
            rarr_part = rarr_part + sum_num;

        // Return the rearranged string
        return rarr_part;
    }
}
