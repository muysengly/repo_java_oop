import java.util.*;

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram_test(String str1, String str2) {
        // Check if either input string is null
        if (str1 == null || str2 == null) {
            return false;
        }
        // Check if the lengths of the two strings are different
        else if (str1.length() != str2.length()) {
            return false;
        }
        // Check if both strings are empty (an edge case)
        else if (str1.length() == 0 && str2.length() == 0) {
            return true;
        }

        // Create an integer array to count character occurrences
        int[] count = new int[256];

        // Count character occurrences in both strings
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // Check if all counts in the array are zero, indicating anagrams
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        // If all checks pass, the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Test case: Check if the strings "wxyz" and "zyxw" are anagrams
        String str1 = "wxyz";
        String str2 = "zyxw";

        // Print the original strings
        System.out.println("String-1 : " + str1);
        System.out.println("String-2 : " + str2);

        // Check if the two given strings are anagrams and print the result
        System.out.println("Check if two given strings are anagrams or not?: " + anagram_test(str1, str2));
    }
}
