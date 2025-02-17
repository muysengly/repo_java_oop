import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2;
        int i = 0, remainder = 0;

        // Create an array to store the sum of binary digits
        int[] sum = new int[20];

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first binary number
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();

        // Prompt the user to input the second binary number
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0) {
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");
    }
}
