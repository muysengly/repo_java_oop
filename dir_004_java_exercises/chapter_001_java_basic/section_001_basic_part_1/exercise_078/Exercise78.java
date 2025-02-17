import java.util.Arrays;

public class Exercise78 {
    public static void main(String[] args) {
        // Define an integer array, array_nums
        int[] array_nums = {5, 7};
        
        // Print the elements of the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums)); 
        
        // Check if the first element of the array is 4 or 7 and print the result
        if (array_nums[0] == 4 || array_nums[0] == 7) {
            System.out.println("True");
        } else {
            // If the first element is not 4 or 7, check the second element and print the result
            System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
        }
    }
}
