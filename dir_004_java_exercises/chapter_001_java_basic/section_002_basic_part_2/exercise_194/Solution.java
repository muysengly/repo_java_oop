// Main class for the solution
public class Solution {

    // Main method to execute the solution
    public static void main(String[] args) {
        // Initialize the target number
        int num = 3;

        // Initialize a 2D matrix
        int matrix[][] = {
                { 2, 5, 3 },
                { 3, 2, 1 },
                { 1, 3, 5 }
        };

        // Get the number of rows in the matrix
        int r = matrix.length;

        // Get the number of columns in the matrix
        int c = matrix[0].length - 1;

        // Initialize variables for matrix traversal
        int m = 0, n = 0;

        // Boolean flag to check if the number is found in the matrix
        Boolean flag = false;

        // Iterate through the rows of the matrix
        while (m < r) {
            // Iterate through the columns of the matrix
            while (n <= c) {
                // Check if the current element is equal to the target number
                if (matrix[m][n] == num) {
                    // Display the coordinates of the found number
                    System.out.print("\n(" + m + "," + n + ")\n");
                    // Set the flag to true indicating the number is found
                    flag = true;
                }
                // Move to the next column
                n++;
            }

            // Move to the next row and reset column index
            m++;
            n = 0;
        }

        // Display a message if the number is not found in the matrix
        if (flag == false)
            System.out.print("Number not found!");
    }
}
