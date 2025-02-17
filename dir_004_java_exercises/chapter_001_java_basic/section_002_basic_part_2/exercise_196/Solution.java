
// Import Scanner class from java.util package for user input
import java.util.*;

// Main class for the solution
public class Solution {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read the user input as an integer
        int n = in.nextInt();

        // Generate a spiral array using the spiral_Array function
        int[][] result = spiral_Array(n);

        // Display the generated spiral array
        System.out.print("Spiral array becomes:\n");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Function to generate a spiral array of size n x n
    public static int[][] spiral_Array(int n) {
        // Initialize a 2D array to store the spiral array
        int[][] temp = new int[n][n];

        // Arrays to represent movement in x and y directions
        int[] dx = new int[] { 0, 1, 0, -1 };
        int[] dy = new int[] { 1, 0, -1, 0 };

        // Variables for current position (x, y) and direction (d)
        int x, y, d;

        // Variables for iteration
        int i, j, nx, ny;

        // Initialize the array with -1 values
        for (i = 0; i < n; ++i) {
            for (j = 0; j < n; ++j) {
                temp[i][j] = -1;
            }
        }

        // Initialize starting position and direction
        x = 0;
        y = 0;
        d = 0;

        // Fill the array with spiral order values
        for (i = 1; i <= n * n; ++i) {
            temp[x][y] = i;
            nx = x + dx[d];
            ny = y + dy[d];

            // Check boundaries and visited positions
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || temp[nx][ny] != -1) {
                d = (d + 1) % 4; // Change direction if boundary or visited
                nx = x + dx[d];
                ny = y + dy[d];
            }

            // Update current position
            x = nx;
            y = ny;
        }

        // Return the generated spiral array
        return temp;
    }
}
