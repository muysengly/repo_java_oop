import java.util.Scanner; // Import the Scanner class to read input from the user

public class Exercise23 {
    public static void main(String[] args) {
        // Declare an array to store hexadecimal digits, variables for calculation, and
        // binary input
        int[] hex = new int[1000]; // Array to store hexadecimal digits
        int i = 1, j = 0, rem, dec = 0, bin; // Variables for calculation

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number: ");
        bin = in.nextInt(); // Read the binary number input by the user

        // Convert the binary number to decimal
        while (bin > 0) { // Loop until the binary number is reduced to 0
            rem = bin % 2; // Get the last digit of the binary number
            dec = dec + rem * i; // Add the value of the last digit multiplied by the current power of 2 to the
                                 // decimal number
            i = i * 2; // Update the multiplier to the next power of 2
            bin = bin / 10; // Remove the last digit from the binary number
        }
        i = 0; // Reset the multiplier for the next conversion

        // Convert the decimal number to hexadecimal
        while (dec != 0) { // Loop until the decimal number is reduced to 0
            hex[i] = dec % 16; // Get the remainder when dividing by 16 (hexadecimal digit)
            dec = dec / 16; // Update the decimal number by dividing it by 16
            i++; // Move to the next position in the hex array
        }

        // Display the hexadecimal value
        System.out.print("Hexadecimal value: ");
        for (j = i - 1; j >= 0; j--) { // Loop through the hex array in reverse order
            if (hex[j] > 9) { // If the hex digit is greater than 9, convert it to a letter (A-F)
                System.out.print((char) (hex[j] + 55)); // Convert to corresponding ASCII character (A-F)
            } else {
                System.out.print(hex[j]); // Print the hex digit (0-9)
            }
        }
        System.out.print("\n"); // Print a newline character
    }
}
