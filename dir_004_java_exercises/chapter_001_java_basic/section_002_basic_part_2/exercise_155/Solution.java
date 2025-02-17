import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Initializing a 2D array with values
        int[][] twodm = {
                { 10, 20, 30 },
                { 40, 50, 60 }
        };

        // Displaying the original array
        System.out.print("Original Array:\n");
        print_array(twodm);

        // Performing transpose operation on the array
        System.out.print("After changing the rows and columns of the said array:");
        transpose(twodm);
    }

    // Method to transpose the given 2D array
    private static void transpose(int[][] twodm) {
        // Creating a new 2D array to store the transposed elements
        int[][] newtwodm = new int[twodm[0].length][twodm.length];

        // Transposing the elements of the array
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                newtwodm[j][i] = twodm[i][j];
            }
        }

        // Printing the transposed array
        print_array(newtwodm);
    }

    // Method to print the elements of a 2D array
    private static void print_array(int[][] twodm) {
        // Looping through the array and printing its elements
        for (int i = 0; i < twodm.length; i++) {
            for (int j = 0; j < twodm[0].length; j++) {
                System.out.print(twodm[i][j] + " ");
            }
            System.out.println();
        }
    }
}
