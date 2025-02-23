import java.util.*; // Import all classes from the java.util package

public class Exercise24 {
    public static void main(String[] args) {
        // Declare variables to store binary and decimal numbers, remainder, quotient,
        // and an array for octal digits
        int binnum, binnum1, rem, decnum = 0, quot, i = 1, j; // Variables for calculation
        int octnum[] = new int[100]; // Array to store octal digits

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt(); // Read the binary number input by the user
        binnum1 = binnum; // Store the original binary number for later use

        // Convert the binary number to decimal
        while (binnum > 0) { // Loop until the binary number is reduced to 0
            rem = binnum % 10; // Get the last digit of the binary number
            decnum = decnum + rem * i; // Add the value of the last digit multiplied by the current power of 2 to the
                                       // decimal number
            i = i * 2; // Update the multiplier to the next power of 2
            binnum = binnum / 10; // Remove the last digit from the binary number
        }

        i = 1; // Reset the multiplier for the next conversion
        quot = decnum; // Store the decimal number in quot for conversion to octal

        // Convert the decimal number to octal
        while (quot > 0) { // Loop until the quotient is reduced to 0
            octnum[i++] = quot % 8; // Get the remainder when dividing by 8 (octal digit) and store it in the octnum
                                    // array
            quot = quot / 8; // Update the quotient by dividing it by 8
        }

        // Display the equivalent octal value of the original binary number
        System.out.print("Equivalent Octal Value of " + binnum1 + " is :");
        for (j = i - 1; j > 0; j--) { // Loop through the octnum array in reverse order
            System.out.print(octnum[j]); // Print each octal digit
        }
        System.out.print("\n"); // Print a newline character
    }
}