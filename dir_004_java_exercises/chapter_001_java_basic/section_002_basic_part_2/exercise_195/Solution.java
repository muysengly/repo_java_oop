
// Import Scanner class from java.util package for user input
import java.util.*;

// Main class for the solution
public class Solution {

    // Main method to execute the solution
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first side of the triangle
        System.out.print("Input side1: ");
        // Read the user input as an integer
        int s1 = in.nextInt();

        // Prompt the user to input the second side of the triangle
        System.out.print("Input side2: ");
        // Read the user input as an integer
        int s2 = in.nextInt();

        // Prompt the user to input the third side of the triangle
        System.out.print("Input side3: ");
        // Read the user input as an integer
        int s3 = in.nextInt();

        // Display the result of the isValidTriangle function
        System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
    }

    // Function to check if the given sides form a valid triangle
    public static boolean isValidTriangle(int a, int b, int c) {
        // Check the triangle inequality theorem to determine validity
        return (a + b > c && b + c > a && c + a > b);
    }
}
