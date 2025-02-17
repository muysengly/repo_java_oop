import java.util.Scanner;

public class Exercise21 {
    public static void main(String args[]) {
        // Declare variables to store decimal number, remainder, quotient, and an array
        // for octal digits
        int dec_num, rem, quot, i = 1, j;
        int oct_num[] = new int[100];

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to octal and store octal digits
        while (quot != 0) {
            oct_num[i++] = quot % 8;
            quot = quot / 8;
        }

        // Display the octal representation of the decimal number
        System.out.print("Octal number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(oct_num[j]);
        }

        System.out.print("\n");
    }
}
