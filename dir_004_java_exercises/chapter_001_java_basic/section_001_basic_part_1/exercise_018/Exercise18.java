import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Exercise18 { // Declare a public class named Exercise18
    public static void main(String[] args) { // Declare the main method, the entry point of the program
        // Declare variables to store two binary numbers and the product
        long binary1, binary2, multiply = 0; // Declare long variables for binary numbers and their product

        // Initialize digit and factor variables for processing binary2
        int digit, factor = 1; // Declare and initialize variables for digit and factor

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user to input the first binary number
        System.out.print("Input the first binary number: ");
        // Read and store the first binary number
        binary1 = in.nextLong();

        // Prompt the user to input the second binary number
        System.out.print("Input the second binary number: ");
        // Read and store the second binary number
        binary2 = in.nextLong();

        // Process binary2 to calculate the product
        while (binary2 != 0) { // Loop until binary2 is zero
            digit = (int) (binary2 % 10); // Extract the last digit of binary2
            if (digit == 1) { // If the digit is 1
                binary1 = binary1 * factor; // Multiply binary1 by the factor
                multiply = binaryproduct((int) binary1, (int) multiply); // Calculate the product using binaryproduct
                                                                         // method
            } else { // If the digit is not 1
                binary1 = binary1 * factor; // Multiply binary1 by the factor
            }
            binary2 = binary2 / 10; // Remove the last digit from binary2
            factor = 10; // Set the factor to 10 for the next iteration
        }

        // Display the product of the two binary numbers
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    // Method to calculate the product of two binary numbers
    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0; // Declare variables for indexing and remainder
        int[] sum = new int[20]; // Initialize an array to store the sum of binary digits
        int binary_prod_result = 0; // Initialize the result of binary product

        while (binary1 != 0 || binary2 != 0) { // Loop until both binary numbers are zero
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2; // Calculate the current digit of the sum
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2; // Calculate the carry for the next digit
            binary1 = binary1 / 10; // Remove the last digit from binary1
            binary2 = binary2 / 10; // Remove the last digit from binary2
        }

        if (remainder != 0) { // If there is a remaining carry
            sum[i++] = remainder; // Add the carry to the sum
        }

        --i; // Decrement the index to point to the last valid digit in the sum array

        while (i >= 0) { // Loop to construct the binary product result from the sum array
            binary_prod_result = binary_prod_result * 10 + sum[i--]; // Construct the binary product result
        }

        return binary_prod_result; // Return the binary product result
    }
}
