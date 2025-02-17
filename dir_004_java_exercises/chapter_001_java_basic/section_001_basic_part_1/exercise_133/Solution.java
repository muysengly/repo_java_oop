import java.util.*;

public class Solution {
    // Static method to find the minimum path sum in a 2D grid
    public static int minPathSum(int[][] grid) {
        // Check for invalid or empty input grid
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length; // Number of rows in the grid
        int n = grid[0].length; // Number of columns in the grid
        int[][] temp = new int[m][n]; // Temporary array to store minimum path sum

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    temp[i][j] = grid[i][j]; // Initialize the starting point
                    continue;
                }

                // Calculate the minimum path sum from either the cell above or the cell on the
                // left
                int from_up = i == 0 ? Integer.MAX_VALUE : temp[i - 1][j];
                int from_left = j == 0 ? Integer.MAX_VALUE : temp[i][j - 1];
                temp[i][j] = Math.min(from_up, from_left) + grid[i][j]; // Update the temporary array
            }
        }
        // Return the minimum path sum for the last cell
        return temp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        // Example grid
        int[][] grid = new int[][] {
                { 7, 4, 2 },
                { 0, 5, 6 },
                { 3, 1, 2 } };

        System.out.println("Sum of all numbers along its path: " + minPathSum(grid));
    }
}
