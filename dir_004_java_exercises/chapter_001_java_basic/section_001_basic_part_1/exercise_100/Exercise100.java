import java.util.*;

public class Exercise100 {
    public static void main(String[] args) {
        int[] array_nums1 = {10, 11, 10, 20, 43, 20, 50};
        int[] array_nums2 = {10, 13, 11, 20, 44, 30, 50};
        System.out.println("Array1: "+Arrays.toString(array_nums1)); 
        System.out.println("Array2: "+Arrays.toString(array_nums2)); 
        
        int ctr = 0; // Initialize a counter to keep track of the number of elements

        // Iterate through the arrays to compare elements at the same index
        for (int i = 0; i < array_nums1.length; i++) {
            // Check if the absolute difference between elements is less than or equal to 1
            // and the elements are not equal
            if (Math.abs(array_nums1[i] - array_nums2[i]) <= 1 && array_nums1[i] != array_nums2[i]) {
                ctr++; // If the condition is met, increment the counter
            }
        }
        
        System.out.printf("Number of elements: "+ctr); // Print the number of elements meeting the condition
        System.out.printf("\n");	 
    }
}
