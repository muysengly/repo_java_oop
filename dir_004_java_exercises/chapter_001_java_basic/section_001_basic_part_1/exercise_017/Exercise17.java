import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Exercise17 { // Declare a public class named Exercise17
    public static void main(String[] args) { // Declare the main method, the entry point of the program
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2; // Declare two long variables to store the binary numbers
        int i = 0, remainder = 0; // Declare an integer variable 'i' for indexing and 'remainder' for carry

        // Create an array to store the sum of binary digits
        int[] sum = new int[20]; // Initialize an array to store the sum of binary digits

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user to input the first binary number
        System.out.print("Input first binary number: ");
        // Read and store the first binary number
        binary1 = in.nextLong();

        // Prompt the user to input the second binary number
        System.out.print("Input second binary number: ");
        // Read and store the second binary number
        binary2 = in.nextLong();

        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0) { // Loop until both binary numbers are zero
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2); // Calculate the current digit of the sum
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2); // Calculate the carry for the next digit
            binary1 = binary1 / 10; // Remove the last digit from binary1
            binary2 = binary2 / 10; // Remove the last digit from binary2
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) { // Check if there is a carry left
            sum[i++] = remainder; // Add the carry to the sum
        }

        // Decrement the index to prepare for printing
        --i; // Decrement the index to point to the last valid digit in the sum array

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) { // Loop to print the sum array from the most significant digit
            System.out.print(sum[i--]); // Print each digit of the sum
        }

        System.out.print("\n"); // Print a newline character
    }
}
