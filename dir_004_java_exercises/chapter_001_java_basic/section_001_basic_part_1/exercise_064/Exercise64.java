import java.util.*;

public class Exercise64 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number : ");
        int a = in.nextInt();  // Read and store the first number

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int b = in.nextInt();  // Read and store the second number

        // Call the common_digit method with the two numbers and print the result
        System.out.println("Result: " + common_digit(a, b));
    }

    // Define a method to check if there's a common digit between two numbers
    public static boolean common_digit(int p, int q) {
        // Check if p is less than 25 or q is greater than 75
        if (p < 25 || q > 75) {
            return false;
        }

        // Extract the last digit of each number
        int x = p % 10;
        int y = q % 10;

        // Remove the last digit from both numbers
        p /= 10;
        q /= 10;

        // Check if there's a common digit by comparing the remaining digits
        return (p == q || p == y || x == q || x == y);
    }
}
