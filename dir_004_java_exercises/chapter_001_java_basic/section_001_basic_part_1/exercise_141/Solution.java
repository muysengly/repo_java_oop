import java.util.*;

public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        // Convert the input string to a character array
        char[] chars = str.toCharArray();

        // Sort the character array in lexicographical order
        Arrays.sort(chars);

        // Check for repeated characters in the sorted array
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }

        // If no repeated characters are found, the string is considered to have all
        // unique characters
        return true;
    }

    public static void main(String[] args) {
        // Test case: Check if the string "xyyz" has all unique characters
        // Note: You can change the value of the 'str' variable for different input
        // strings.
        String str = "xyyz";

        // Print the original string
        System.out.println("Original String : " + str);

        // Check if the string has all unique characters and print the result
        System.out.println("String has all unique characters: " + is_Unique_str(str));
    }
}
