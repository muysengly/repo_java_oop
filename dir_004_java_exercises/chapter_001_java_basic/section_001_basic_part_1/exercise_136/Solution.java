import java.util.*;

public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public static int unique_Paths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] grid = new int[m][n]; // Create a grid to store the number of unique paths

        // Nested loops to iterate through the grid
        for (int i = m - 1; i >= 0; --i) { // Start from the bottom row and move upwards
            for (int j = n - 1; j >= 0; --j) { // Start from the rightmost column and move leftwards
                grid[i][j] = get_Paths(grid, i, j); // Calculate the unique paths for the current cell
            }
        }
        return grid[0][0]; // The top-left corner now contains the total unique paths
    }

    // Helper function to calculate unique paths for a cell
    private static int get_Paths(int[][] grid, int i, int j) {
        if (i >= grid.length - 1 || j >= grid[0].length - 1) {
            return 1; // If at the rightmost column or bottom row, there is only one path
        }
        return grid[i][j + 1] + grid[i + 1][j]; // Sum the unique paths from the right and bottom cells
    }

    // Main method for testing the unique_Paths function
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.println(
                "Unique paths from top-left corner to bottom-right corner of the said grid: " + unique_Paths(m, n));
    }
}
