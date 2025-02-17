import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Test the stringPermutation function and print the result
        String str1 = "xxyz";
        String str2 = "yxzx";
        System.out.println("Original strings: " + str1 + "  " + str2);
        System.out.println(stringPermutation(str1, str2));
    }

    public static boolean stringPermutation(String str1, String str2) {
        int[] arr = new int[500]; // Create an integer array to count character frequencies (assuming extended
                                  // ASCII characters)

        // Count the frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            arr[(int) str1.charAt(i)] += 1;
        }

        // Decrement the count of characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }

        // Check if all character counts are zero, indicating a permutation
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false; // If any count is non-zero, return false
        }

        return true; // If all counts are zero, return true, indicating a permutation
    }
}
