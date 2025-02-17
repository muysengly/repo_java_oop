import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Exercise19 { // Declare a public class named Exercise19
    public static void main(String args[]) { // Declare the main method, the entry point of the program
        // Declare variables to store decimal number, quotient, and an array for binary
        // digits
        int dec_num, quot, i = 1, j; // Declare integer variables 'dec_num', 'quot', 'i', and 'j'
        int bin_num[] = new int[100]; // Initialize an array to store binary digits

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        // Read and store the decimal number
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to binary and store binary digits
        while (quot != 0) { // Loop until the quotient is zero
            bin_num[i++] = quot % 2; // Store the remainder (binary digit) in the array
            quot = quot / 2; // Update the quotient by dividing it by 2
        }

        // Display the binary representation of the decimal number
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) { // Loop to print the binary digits in reverse order
            System.out.print(bin_num[j]); // Print each binary digit
        }
        System.out.print("\n"); // Print a newline character
    }
}
