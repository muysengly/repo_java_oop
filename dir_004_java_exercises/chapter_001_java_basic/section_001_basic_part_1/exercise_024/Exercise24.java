import java.util.*;

public class Exercise24 {
    public static void main(String[] args) {
        // Declare variables to store binary and decimal numbers, remainder, quotient,
        // and an array for octal digits
        int binnum, binnum1, rem, decnum = 0, quot, i = 1, j;
        int octnum[] = new int[100];

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number : ");
        binnum = scan.nextInt();
        binnum1 = binnum;

        // Convert the binary number to decimal
        while (binnum > 0) {
            rem = binnum % 10;
            decnum = decnum + rem * i;
            i = i * 2;
            binnum = binnum / 10;
        }

        i = 1;
        quot = decnum;

        // Convert the decimal number to octal
        while (quot > 0) {
            octnum[i++] = quot % 8;
            quot = quot / 8;
        }

        // Display the equivalent octal value of the original binary number
        System.out.print("Equivalent Octal Value of " + binnum1 + " is :");
        for (j = i - 1; j > 0; j--) {
            System.out.print(octnum[j]);
        }
        System.out.print("\n");
    }
}
