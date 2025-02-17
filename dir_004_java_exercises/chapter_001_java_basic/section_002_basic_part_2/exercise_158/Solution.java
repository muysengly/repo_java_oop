import java.util.Scanner;

public class Solution {
    // Method to determine if two numbers are relatively prime
    public static int prime_cell(int a, int b) {
        // If either number is zero, return 1 as a special case
        if (a == 0 || b == 0) {
            return 1;
        }
        
        // If a is less than b, swap the values using a temporary variable
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        
        // Check if a is divisible by b
        if (a % b == 0) {
            return b; // Return b if it evenly divides a
        } else {
            return prime_cell(b, a % b); // Recursively call prime_cell method with b and the remainder of a/b
        }
    }

    public static void main(String[] args) {
        int n = 3; // Initialize variable 'n' with value 3
        boolean[][] A = new boolean[n][n]; // Create a 2D boolean array of size n x n
        
        // Loop through each element of the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Assign true if the result of prime_cell is 1 (relatively prime), otherwise assign false
                A[i][j] = prime_cell(i, j) == 1;
                System.out.print(A[i][j] + " "); // Print the value of the array element
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
} 
