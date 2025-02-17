// Import the Java utility for reading input.
import java.util.Scanner;

// Define a class named Exercise19.
public class Exercise19 {
    public static void main(String args[]) {
        int m, n, c, d;
        
        // Create a new Scanner object to read user input.
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the number of rows for the matrix.
        System.out.println("Input number of rows of the matrix");
        m = in.nextInt();
        
        // Prompt the user to input the number of columns for the matrix.
        System.out.println("Input number of columns of the matrix");
        n = in.nextInt();

        // Create two-dimensional arrays to store matrix data.
        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        // Prompt the user to input elements of the first matrix.
        System.out.println("Input elements of the first matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array1[c][d] = in.nextInt();
            }
        }

        // Prompt the user to input elements of the second matrix.
        System.out.println("Input elements of the second matrix");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                array2[c][d] = in.nextInt();
            }
        }

        // Calculate the sum of the matrices.
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                sum[c][d] = array1[c][d] + array2[c][d];
            }
        }

        // Display the result, which is the sum of the matrices.
        System.out.println("Sum of the matrices:");
        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++) {
                System.out.print(sum[c][d] + "\t");
            }
            System.out.println();
        }
    }
}
