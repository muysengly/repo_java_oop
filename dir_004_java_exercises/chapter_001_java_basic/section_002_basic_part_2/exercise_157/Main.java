import java.util.Scanner;

public class Main {
    // Method to find the greatest common divisor using Euclidean algorithm
    // iteratively
    public static int euclid(int x, int y) {
        // Continue until y becomes zero
        while (y != 0) {
            int temp = x; // Store the value of x in a temporary variable
            x = y; // Assign y to x
            y = temp % y; // Calculate the remainder of temp divided by y and assign it to y
        }
        return Math.abs(x); // Return the absolute value of x as the greatest common divisor
    }

    public static void main(String[] args) {
        // Displaying the result of the Euclidean algorithm for specific pairs of
        // numbers
        System.out.println("Result: " + euclid(48, 24));
        System.out.println("Result: " + euclid(125463, 9658));
    }
}
