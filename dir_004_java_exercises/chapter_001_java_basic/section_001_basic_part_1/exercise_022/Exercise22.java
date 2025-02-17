import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declare variables to store binary and decimal numbers, remainder, and a
        // multiplier
        long binaryNumber, decimalNumber = 0, j = 1, remainder;

        // Prompt the user to input a binary number
        System.out.print("Input a binary number: ");
        binaryNumber = sc.nextLong();

        // Convert the binary number to decimal
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }

        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
