import java.util.Scanner;

public class Example111 {
    public static void main(String[] arg) {
        int x, y; // Declare two integer variables, 'x' and 'y'
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Input first number: "); // Prompt the user to input the first number
        x = in.nextInt(); // Read and store the first number from the user

        System.out.print("Input second number: "); // Prompt the user to input the second number
        y = in.nextInt(); // Read and store the second number from the user

        while (y != 0) {
            int carry = x & y; // Calculate the carry by bitwise AND operation between x and y
            x = x ^ y; // Calculate the sum without considering the carry by bitwise XOR operation
            y = carry << 1; // Calculate the carry for the next iteration by shifting it left by one position
        }

        System.out.print("Sum: " + x); // Print the sum of the two numbers
        System.out.print("\n"); // Print a new line
    }
}
