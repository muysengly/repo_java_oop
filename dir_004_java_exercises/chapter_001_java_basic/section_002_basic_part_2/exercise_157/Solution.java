import java.util.Scanner;

public class Solution {
    // Method to find the greatest common divisor using Euclidean algorithm
    public static int euclid(int x, int y) {
        // If either of the numbers is zero, return 1 as a special case
        if (x == 0 || y == 0) {
            return 1;
        }

        // If x is less than y, swap the values using a temporary variable
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }

        // Check if x is divisible by y
        if (x % y == 0) {
            return y; // Return y if it evenly divides x
        } else {
            return euclid(y, x % y); // Recursively call the euclid method with y and the remainder of x/y
        }
    }

    public static void main(String[] args) {
        // Displaying the result of the Euclidean algorithm for specific pairs of
        // numbers
        System.out.println("result: " + euclid(48, 24));
        System.out.println("result: " + euclid(125463, 9658));
    }
}
