import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner in = new Scanner(System.in);

        // Prompting the user to input the first number
        System.out.print("Input first number: ");
        double n1 = in.nextDouble();

        // Prompting the user to input the second number
        System.out.print("Input second number: ");
        double n2 = in.nextDouble();

        // Checking if both numbers are greater than 0 and less than 1
        System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
    }
}
