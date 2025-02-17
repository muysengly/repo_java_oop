import java.util.*;

public class Exercise51 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number (as a string)
        System.out.print("Input a number (string): ");

        // Read the input string and store it in str1
        String str1 = in.nextLine();

        // Parse the string as an integer
        int result = Integer.parseInt(str1);

        // Display the integer value
        System.out.printf("The integer value is: %d", result);

        // Print a new line for better formatting
        System.out.printf("\n");
    }
}
