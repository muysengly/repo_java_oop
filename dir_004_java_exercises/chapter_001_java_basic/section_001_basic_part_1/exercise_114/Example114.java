import java.util.*;

public class Example114 {
    public static void main(String[] arg) {
        // Input string
        String str = "abcdef";
        
        // Convert the string to a character array
        char[] A = str.toCharArray();
        
        // Define the offset for rotation
        int offset = 3;
        
        // Calculate the length of the character array
        int len = A.length;
        
        // Ensure that the offset is within the bounds of the array
        offset %= len;
        
        // Reverse the first portion of the array
        reverse(A, 0, len - offset - 1);
        
        // Reverse the second portion of the array
        reverse(A, len - offset, len - 1);
        
        // Reverse the entire array to complete the rotation
        reverse(A, 0, len - 1);
        
        // Print the rotated array
        System.out.println("\n" + Arrays.toString(A));
    }

    // Helper function to reverse a portion of a character array
    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
