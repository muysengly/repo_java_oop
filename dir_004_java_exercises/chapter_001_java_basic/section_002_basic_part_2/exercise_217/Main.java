import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Prompting the user to input the number (n)
        System.out.println("Input the number(n):");

        // Creating a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Reading the input number (n) from the user
        int c = s.nextInt();

        // Calling the check method to find the number of prime numbers
        int ans = check(c);

        // Displaying the number of prime numbers which are less than or equal to n
        System.out.println("Number of prime numbers which are less than or equal to n:");
        System.out.println(ans);
    }

    // Method to check the number of prime numbers
    static int check(int c) {
        // Creating a boolean array to mark numbers as prime or not
        boolean[] prime = new boolean[c + 1];

        // Initializing a counter for prime numbers
        int count = 0;

        // Loop to mark non-prime numbers in the array
        for (int i = 2; i <= Math.sqrt(c); i++) {
            for (int j = i + i; j <= c; j += i) {
                prime[j] = true;
            }
        }

        // Counting the number of prime numbers
        for (int i = 2; i <= c; i++) {
            if (!prime[i]) {
                count++;
            }
        }

        // Returning the total number of prime numbers
        return count;
    }
} 
