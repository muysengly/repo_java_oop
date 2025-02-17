import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input first number: ");

        // Read and store the first number
        int num1 = in.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input second number: ");

        // Read and store the second number
        int num2 = in.nextInt();

        // Prompt the user to input the third number
        System.out.print("Input third number: ");

        // Read and store the third number
        int num3 = in.nextInt();

        // Prompt the user to input the fourth number
        System.out.print("Input fourth number: ");

        // Read and store the fourth number
        int num4 = in.nextInt();

        // Prompt the user to input the fifth number
        System.out.print("Enter fifth number: ");

        // Read and store the fifth number
        int num5 = in.nextInt();

        // Calculate and print the average of the five numbers
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
    }
}
