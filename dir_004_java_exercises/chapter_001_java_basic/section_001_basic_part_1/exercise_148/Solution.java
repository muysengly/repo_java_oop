import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Test the first_Uniq_Char function and print the result
        String s = "wresource";
        System.out.println("Original String: " + s);
        System.out.println("First unique character of the above: " + first_Uniq_Char(s));
    }

    public static int first_Uniq_Char(String s) {
        int[] freq = new int[256]; // Create an array to store character frequencies (assuming ASCII characters)

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // Increment the count at the corresponding index in the array
        }

        // Iterate through the string to find the index of the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index of the first character with a frequency of 1
            }
        }

        return -1; // Return -1 if there are no unique characters
    }
}
