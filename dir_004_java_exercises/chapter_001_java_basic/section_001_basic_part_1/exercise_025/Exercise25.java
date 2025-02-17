 import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Declare variables to store octal and decimal numbers, and an index counter
        long octal_num, decimal_num = 0;
        int i = 0;
        
        // Prompt the user to input an octal number
        System.out.print("Input any octal number: ");
        octal_num = in.nextLong();
        
        // Convert the octal number to decimal
        while (octal_num != 0) {
            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
            octal_num = octal_num / 10;
        }
        
        // Display the equivalent decimal number
        System.out.print("Equivalent decimal number: " + decimal_num + "\n");
    }
}
