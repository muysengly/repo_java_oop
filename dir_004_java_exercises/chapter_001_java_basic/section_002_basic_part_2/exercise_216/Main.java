import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompting the user to input the number (n)
        System.out.println("Input the number(n):");

        // Creating a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Reading the input number (n) from the user
        int c = s.nextInt();

        // Calling the check method to find the number of combinations
        int ans = check(c);

        // Displaying the number of combinations of a, b, c, and d
        System.out.println("Number of combinations of a, b, c, and d :");
        System.out.println(ans);
    }

    // Method to check the number of combinations
    static int check(int c) {
        // Initializing a counter for combinations
        int ctr = 0;

        // Nested loops to iterate through all possible combinations of a, b, c, and d
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        // Checking if the sum of a, b, c, and d equals the input number (n)
                        if (i + j + k + l == c) {
                            // Incrementing the counter for valid combinations
                            ctr++;
                        }
                    }
                }
            }
        }

        // Returning the total number of combinations
        return ctr;
    }
} 
