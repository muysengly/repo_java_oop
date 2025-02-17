import java.util.Arrays;

public class Exercise77 {
    public static void main(String[] args) {
        // Define two integer arrays (array1 and array2)
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};
        
        // Print the elements of array1
        System.out.println("Array1: " + Arrays.toString(array1));
        
        // Print the elements of array2
        System.out.println("Array2: " + Arrays.toString(array2));
        
        // Create a new array, array_new, with elements from array1 and array2
        int[] array_new = {array1[0], array2[2]};	
        
        // Print the elements of the new array, array_new
        System.out.println("New Array: " + Arrays.toString(array_new));
    }
}
