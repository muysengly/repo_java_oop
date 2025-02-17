import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompting the user to input the first number
        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        // Prompting the user to input the second number
        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        // Prompting the user to input the third number
        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        // Prompting the user to input the fourth number
        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        // Checking if all four numbers are equal
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            // Printing a message if all numbers are equal
            System.out.println("Numbers are equal.");
        } else {
            // Printing a message if numbers are not all equal
            System.out.println("Numbers are not equal!");
        }
    }
}
