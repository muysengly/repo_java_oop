import java.util.*;

public class Exercise83 {
    public static void main(String[] args) {	
        // Initialize a string to store the result
        String result = "";
        
        // Define two integer arrays
        int[] left_array = {1, 3, -5, 4};
        int[] right_array = {1, 4, -5, -2};
        
        // Print the elements of Array1
        System.out.println("\nArray1: " + Arrays.toString(left_array));  
        
        // Print the elements of Array2
        System.out.println("\nArray2: " + Arrays.toString(right_array)); 
        
        // Multiply corresponding elements from both arrays and build the result string
        for (int i = 0; i < left_array.length; i++) {
            int num1 = left_array[i];
            int num2 = right_array[i];
            result += Integer.toString(num1 * num2) + " "; 
        }
        
        // Print the result string
        System.out.println("\nResult: " + result);     
    }
}
