import java.util.Scanner; // Import the Scanner class from the java.util package to read user input

public class Exercise20 { // Declare a public class named Exercise20
    public static void main(String args[]) { // Declare the main method, the entry point of the program
        // Declare variables to store the decimal number and the remainder
        int dec_num, rem;

        // Initialize an empty string to store the hexadecimal number
        String hexdec_num = "";

        // Define the hexadecimal number digits in a character array
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a decimal number: ");
        // Read the decimal number input by the user
        dec_num = in.nextInt();

        // Convert the decimal number to hexadecimal
        while (dec_num > 0) { // Loop until the decimal number is greater than 0
            rem = dec_num % 16; // Find the remainder when the decimal number is divided by 16
            hexdec_num = hex[rem] + hexdec_num; // Prepend the corresponding hexadecimal digit to the result string
            dec_num = dec_num / 16; // Update the decimal number by dividing it by 16
        }

        // Display the hexadecimal representation of the decimal number
        System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
    }
}
