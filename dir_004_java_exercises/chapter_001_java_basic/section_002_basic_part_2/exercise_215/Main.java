import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Prompting the user to input the number of months
        System.out.println("Input number of months:");

        // Reading the number of months from the user
        int n = s.nextInt();

        // Initializing the principal amount (initial debt) to 100,000
        double c = 100000;

        // Looping through each month to calculate the debt amount
        for (int i = 0; i < n; i++) {
            // Calculating the new debt amount after adding 4% interest
            c += c * 0.04;

            // Checking if the debt amount is not a multiple of 1000
            if (c % 1000 != 0) {
                // Reducing the debt amount to the nearest multiple of 1000
                c -= c % 1000;
                // Adding 1000 to the debt amount
                c += 1000;
            }
        }

        // Printing the final debt amount without decimal places
        System.out.println("\nAmount of debt: ");
        System.out.printf("%.0f\n", c);
    }
} 
