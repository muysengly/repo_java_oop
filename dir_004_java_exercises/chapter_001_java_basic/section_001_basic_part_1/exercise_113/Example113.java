import java.util.*;

public class Example113 {
    public static void main(String[] arg) {
        // Declare two sorted integer arrays, array1 and array2
        // array1 has 'm' elements but is large enough to accommodate 'm+n' elements
        // array2 has 'n' elements
        
        // Declaration and instantiation of array1
        int array1[] = new int[8];
        
        // Initialize the first four elements of array1
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        
        // Initialize array2
        int[] array2 = {2, 5, 7, 8};
        
        System.out.println("\nArray1: " + Arrays.toString(array1));
        System.out.println("\nArray2: " + Arrays.toString(array2));
        
        // Define variables m and n
        int m = 4, n = 4;
        
        // Initialize pointers for array1 (i) and array2 (j) and the index for merging (index)
        int i = m - 1, j = n - 1, index = m + n - 1;
        
        // Merge the two arrays into array1
        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[index--] = array1[i--];
            } else {
                array1[index--] = array2[j--];
            }
        }
        
        // Handle remaining elements in array1 (if any)
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        
        // Handle remaining elements in array2 (if any)
        while (j >= 0) {
            array1[index--] = array2[j--];
        }

        System.out.println("\nMerged array: " + Arrays.toString(array1));
    }
}
