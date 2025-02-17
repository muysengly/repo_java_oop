import java.util.Scanner;

public class Exercise28 {
    // Function to convert a hexadecimal string to a decimal integer
    public static int hex_to_decimal(String s) {
        // Define a string containing hexadecimal digits
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase(); // Convert the input string to uppercase
        int val = 0; // Initialize the decimal value to 0

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the current character
            int d = digits.indexOf(c); // Find the index of the character in the digits string
            val = 16 * val + d; // Update the decimal value using hexadecimal conversion
        }

        return val; // Return the decimal value
    }

    public static void main(String args[]) {
        String hexdec_num;
        int dec_num;
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a hexadecimal number
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = scan.nextLine();

        // Call the hex_to_decimal function to convert the hexadecimal number to decimal
        dec_num = hex_to_decimal(hexdec_num);

        // Display the equivalent decimal number
        System.out.print("Equivalent decimal number is: " + dec_num + "\n");
    }
}
