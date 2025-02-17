import java.lang.*;

public class Exercise74 {
    public static void main(String[] args) {
        // Define an integer array
        int[] num_array = {10, -20, 0, 30, 40, 60, 10};
        
        // Check if the first or last element of the array is equal to 10
        boolean result = (num_array[0] == 10 || num_array[num_array.length - 1] == 10);

        // Print the result
        System.out.println(result);
    }
}
