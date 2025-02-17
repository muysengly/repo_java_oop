import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) {
        int amount = 0; // Initialize a counter for three-digit numbers
        
        // Iterate through three nested loops to generate all unique three-digit numbers
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    // Check if 'i,' 'j,' and 'k' are all different (not equal)
                    if (k != i && k != j && i != j) {
                        amount++; // Increment the counter
                        System.out.println(i + "" + j + "" + k); // Print the generated three-digit number
                    }
                }
            }
        }
        
        // Display the total number of generated three-digit numbers
        System.out.println("Total number of the three-digit-number is " + amount);
    }
}
