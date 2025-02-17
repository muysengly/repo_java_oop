import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Exercise21 { // Declare a public class named Exercise21
    public static void main(String args[]) { // Declare the main method, the entry point of the program
        // Declare variables to store decimal number, remainder, quotient, and an array
        // for octal digits
        int dec_num, rem, quot, i = 1, j; // Declare integer variables 'dec_num', 'rem', 'quot', 'i', and 'j'
        int oct_num[] = new int[100]; // Initialize an array to store octal digits

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        // Read and store the decimal number
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to octal and store octal digits
        while (quot != 0) { // Loop until the quotient is zero
            oct_num[i++] = quot % 8; // Store the remainder (octal digit) in the array
            quot = quot / 8; // Update the quotient by dividing it by 8
        }

        // Display the octal representation of the decimal number
        System.out.print("Octal number is: ");
        for (j = i - 1; j > 0; j--) { // Loop to print the octal digits in reverse order
            System.out.print(oct_num[j]); // Print each octal digit
        }

        System.out.print("\n"); // Print a newline character
    }
}
