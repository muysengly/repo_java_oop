
// Import Scanner class from java.util package for user input
import java.util.*;

// Main class for the solution
public class Main {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input x
        System.out.print("Input x : ");
        // Read the user input as an integer
        int x = in.nextInt();

        // Prompt the user to input n
        System.out.print("Input n : ");
        // Read the user input as an integer
        int n = in.nextInt();

        // Prompt the user to input y
        System.out.print("Input y : ");
        // Read the user input as an integer
        int y = in.nextInt();

        // Calculate the result of x raised to the power of n
        double result = Math.pow(x, n);

        // Calculate the remainder when result is divided by y
        double result1 = result % y;

        // Display the result of (x^n % y)
        System.out.println("x^n % y = " + result1);
    }
}
