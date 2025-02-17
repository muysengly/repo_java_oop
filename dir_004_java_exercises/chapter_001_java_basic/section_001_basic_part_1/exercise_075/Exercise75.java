import java.lang.*;

public class Exercise75 {
    public static void main(String[] args) {
        // Define an integer array
        int[] num_array = {50, -20, 0, 30, 40, 60, 10};
        
        // Check if the array has at least 2 elements and if the first and last elements are equal
        boolean result = (num_array.length >= 2 && num_array[0] == num_array[num_array.length - 1]);

        // Print the result
        System.out.println(result);
    }
}
