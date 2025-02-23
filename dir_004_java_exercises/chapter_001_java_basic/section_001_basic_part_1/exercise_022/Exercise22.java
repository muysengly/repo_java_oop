import java.util.Scanner; // Import the Scanner class to read input from the user

public class Exercise22 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare variables to store binary and decimal numbers, remainder, and a
        // multiplier
        long binaryNumber, decimalNumber = 0, j = 1, remainder;

        // Prompt the user to input a binary number
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong(); // Read the binary number input by the user

        // Convert the binary number to decimal
        while (binaryNumber != 0) { // Loop until the binary number is reduced to 0
            remainder = binaryNumber % 10; // Get the last digit of the binary number
            decimalNumber = decimalNumber + remainder * j; // Add the value of the last digit multiplied by the current
                                                           // power of 2 to the decimal number
            j = j * 2; // Update the multiplier to the next power of 2
            binaryNumber = binaryNumber / 10; // Remove the last digit from the binary number
        }

        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber); // Print the converted decimal number
    }
}
