import java.util.Scanner;

public class Exercise20 {
    public static void main(String args[]) {
        // Declare variables to store decimal number and remainder
        int dec_num, rem;

        // Initialize an empty string for the hexadecimal number
        String hexdec_num = "";

        // Define the hexadecimal number digits
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();

        // Convert the decimal number to hexadecimal
        while (dec_num > 0) {
            rem = dec_num % 16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num / 16;
        }

        // Display the hexadecimal representation of the decimal number
        System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
    }
}
