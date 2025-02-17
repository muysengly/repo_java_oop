// Import the necessary Java utility class for working with arrays.
import java.util.Arrays;

// Define the Main class.
public class Main {

    // The main method for executing the program.
    public static void main(String[] args) {
        // Define an array of integers.
        int arra_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        
        // Print the original array.
        System.out.println("Original array: " + Arrays.toString(arra_nums)); 
        
        int j, temp, arr_size;

        // Get the size of the array.
        arr_size = arra_nums.length;

        for (int i = 0; i < arr_size; i++) {
            j = i;  
            
            // Shift positive numbers to the left and negative numbers to the right.
            while ((j > 0) && (arra_nums[j] > 0) && (arra_nums[j - 1] < 0)) {
                temp = arra_nums[j];
                arra_nums[j] = arra_nums[j - 1];
                arra_nums[j - 1] = temp;
                j--;
            }
        }

        // Print the modified array.
        System.out.println("New array: " + Arrays.toString(arra_nums)); 
    }       
}
