
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Declaring and initializing two strings representing numbers
        String n1 = "123";
        String n2 = "456";

        // Printing the addition of two strings representing numbers
        System.out.println("'" + n1 + "'" + " + " + "'" + n2 + "'" + " = " + addStrings(n1, n2));
    }

    // Method to add two strings representing numbers
    public static String addStrings(String n1, String n2) {
        // Convert input strings to integer arrays
        int[] x = str_num(n1);
        int[] y = str_num(n2);

        // Initialize an array to store the sum, considering carry
        int[] sum = new int[Math.max(x.length, y.length) + 1];
        int z = 0;
        int index = sum.length - 1;
        int i = 0;
        int j = 0;

        // Iterate through both integer arrays to calculate the sum
        while (index >= 0) {
            if (i < x.length) {
                z += x[i++];
            }
            if (j < y.length) {
                z += y[j++];
            }
            sum[index--] = z % 10;
            z /= 10; // store the carry
        }

        // Construct the sum string from the array
        StringBuilder sb = new StringBuilder(sum.length);
        for (i = (sum[0] == 0 ? 1 : 0); i < sum.length; ++i) {
            sb.append(sum[i]);
        }
        return sb.toString();
    }

    // Helper method to convert a string of digits to an integer array
    private static int[] str_num(String num) {
        char[] digits = num.toCharArray();
        int[] number = new int[digits.length];
        int index = number.length - 1;
        for (char digit : digits) {
            number[index--] = digit - '0'; // Convert character to integer and store in the array
        }
        return number;
    }
}
