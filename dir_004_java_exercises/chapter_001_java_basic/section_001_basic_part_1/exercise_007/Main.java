import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.println("Input the Number: ");

        // Read and store the input number
        int n = in.nextInt();

        // Use a loop to generate and print the multiplication table for the input
        // number
        for (int i = 1; i <= 10; i++) {
            // Calculate and print the result of n multiplied by i
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}
