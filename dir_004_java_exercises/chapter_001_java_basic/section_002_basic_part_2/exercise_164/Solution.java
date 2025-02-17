 import java.util.Scanner;

public class Solution {
    // Method to perform division using subtraction
    public static float divide_using_subtraction(int dividend, int divider) {
        if (divider == 0) {
            return 0; // If the divider is zero, return 0 (division by zero error)
        }
        
        float result = 0; // Initialize the result variable to store the quotient
        
        // Perform division using subtraction
        while (dividend > divider) {
            dividend -= divider; // Subtract the divider from the dividend
            result++; // Increment the result (quotient)
        }
        
        float decimalPart = (float) dividend / (float) divider; // Calculate the decimal part of the quotient
        result += decimalPart; // Add the decimal part to the result
        return result; // Return the final result (quotient)
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create Scanner object to take user input
        System.out.print("Input the dividend: "); // Prompt user to input the dividend
        int dividend = in.nextInt(); // Read input dividend
        
        System.out.print("Input the divider: "); // Prompt user to input the divider
        int divider = in.nextInt(); // Read input divider
        
        System.out.println("\nResult: " + divide_using_subtraction(dividend, divider)); // Display the result of division
    }
}
