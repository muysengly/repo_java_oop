import java.util.Scanner;

public class Exercise29 {
    // Function to convert a hexadecimal string to a decimal integer
    public static int hex_to_binary(String s) {
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
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a hexadecimal number
        System.out.print("Enter Hexadecimal Number : ");
        hexdec_num = scan.nextLine();

        // Call the hex_to_binary function to convert the hexadecimal number to decimal
        dec_num = hex_to_binary(hexdec_num);

        // Convert the decimal number to binary
        while (dec_num != 0) {
            bin_num[i++] = dec_num % 2;
            dec_num = dec_num / 2;
        }

        // Display the equivalent binary number
        System.out.print("Equivalent Binary Number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }

        System.out.print("\n");
    }
}
