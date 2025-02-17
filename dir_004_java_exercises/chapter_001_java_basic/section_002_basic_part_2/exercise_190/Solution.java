
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Declaring and initializing two strings
        String str1 = "Java Programming Exercises, Practice, Solution";
        String str2 = "Java Programming Exercises, Practice,";

        // Printing the missing words in the string
        System.out.println("Missing string: " + Arrays.toString(missing_Words(str1, str2)));
    }

    // Method to find missing words in the given strings
    public static String[] missing_Words(String t, String s) {
        // Splitting the strings into arrays using space as delimiter
        String[] s1 = t.split(" ");
        String[] s2 = s.split(" ");

        // Calculating the number of missing words
        int sz = s1.length - s2.length;
        String[] missing_str = new String[sz];
        int c = 0;

        // Looping through the first array to find missing words
        for (int i = 0; i < s1.length; i++) {
            int flag = 0;
            // Checking if the word is present in the second array
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j]))
                    flag = 1;
            }
            // If word is not found in the second array, add it to missing string array
            if (flag == 0) {
                missing_str[c++] = s1[i];
            }
        }
        return missing_str; // Return the array containing missing words
    }
}
