import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Creating a 2D boolean array with initial values
        boolean[][] array = {{true, false, true},
                             {false, true, false}};
        
        // Finding the number of rows in the array
        int rows_length = array.length;
        
        // Finding the number of columns in the array by considering the length of the first row
        int columns_length = array[0].length;
        
        // Looping through each element of the 2D array
        for (int i = 0; i < rows_length; i++) {
            for (int j = 0; j < columns_length; j++) {
                // Checking if the current element is true or false and printing accordingly
                if (array[i][j]) {
                    System.out.print(" t "); // Printing " t " if true
                } else {
                    System.out.print(" f "); // Printing " f " if false
                }
            }
            System.out.println(); // Moving to the next line after printing each row
        }   
    }
} 
