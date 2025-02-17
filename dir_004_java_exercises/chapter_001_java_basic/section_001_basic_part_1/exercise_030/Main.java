import java.util.Scanner;

public class Main {
    // Function to convert a hexadecimal string to a decimal integer
    public static int hex_to_oct(String s) {
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
        int dec_num, i = 1, j;
        int octal_num[] = new int[100];
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a hexadecimal number
        System.out.print("Input a hexadecimal number: ");
        hexdec_num = in.nextLine();

        // Call the hex_to_oct function to convert the hexadecimal number to decimal
        dec_num = hex_to_oct(hexdec_num);

        // Convert the decimal number to octal
        while (dec_num != 0) {
            octal_num[i++] = dec_num % 8;
            dec_num = dec_num / 8;
        }

        // Display the equivalent octal number
        System.out.print("Equivalent of octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octal_num[j]);
        }

        System.out.print("\n");
    }
}
