import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Initialize the 'target' value for searching
        int target = 0;
        
        // Create a 3x3 matrix and populate it with values
        int[][] matrix = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrix[row][col] = (1 + row * 3 + col);
            }
        }
        
        // Display the contents of the matrix
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
                if (col == 2) {
                    System.out.println();
                }
            }
        }
        
        // Print the result of the 'searchMatrix' function
        System.out.print(Boolean.toString(searchMatrix(matrix, target)));
    }
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is empty or has no columns
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        // Get the number of rows 'm' and columns 'n' in the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Initialize 'lower' and 'higher' for binary search
        int lower = 0;
        int higher = m * n - 1;
        
        // Perform binary search to find 'target' in the matrix
        while (lower <= higher) {
            int mid = (lower + higher) >> 1;
            int val = matrix[mid / n][mid % n];
            if (val == target) {
                return true;
            }
            if (val < target) {
                lower = mid + 1;
            } else {
                higher = mid - 1;
            }
        }
        
        // If 'target' is not found, return false
        return false;
    }
}
