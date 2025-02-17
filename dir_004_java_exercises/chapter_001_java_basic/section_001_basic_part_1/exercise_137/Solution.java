import java.util.*;

public class Solution {
    public static int uniquePaths_With_obstacle_Grid(int[][] obstacle_Grid) {
        // Get the number of rows (m) in the obstacle grid
        int m = obstacle_Grid.length;
        if (m <= 0) {
            return 0;
        }
        // Get the number of columns (n) in the obstacle grid
        int n = obstacle_Grid[0].length;
        if (n <= 0) {
            return 0;
        }
        // Create a dynamic programming array to store unique paths
        int[][] dp = new int[m + 1][n + 1];
        dp[m][n - 1] = 1;

        // Nested loops to iterate through the grid
        for (int i = m - 1; i >= 0; --i) { // Start from the bottom row and move upwards
            for (int j = n - 1; j >= 0; --j) { // Start from the rightmost column and move leftwards
                // Calculate unique paths for the current cell based on obstacles
                dp[i][j] = (obstacle_Grid[i][j] == 0) ? dp[i + 1][j] + dp[i][j + 1] : 0;
            }
        }
        // Return the count of unique paths from top-left to bottom-right corner
        return dp[0][0];
    }

    // Main method for testing the uniquePaths_With_obstacle_Grid function
    public static void main(String[] args) {
        int[][] obstacle_Grid = {
                { 0, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 0 },
        };
        System.out.println(
                "Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): "
                        + uniquePaths_With_obstacle_Grid(obstacle_Grid));
    }
}
