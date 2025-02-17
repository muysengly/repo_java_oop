import java.util.*;

public class Exercise65 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number : ");
        int a = in.nextInt();  // Read and store the first number

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int b = in.nextInt();  // Read and store the second number

        // Calculate the division result of a by b
        int divided = a / b;

        // Calculate the remainder of a divided by b
        int result = a - (divided * b);

        // Print the remainder
        System.out.println(result);
    }
} 
