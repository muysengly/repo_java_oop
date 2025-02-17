import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Initializing an array of integers
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        
        int k = 2; // Initializing the value of 'k' as 2
        
        // Displaying the original array
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr));
        
        // Displaying the k'th smallest element of the array
        System.out.println("K'th smallest element of the said array: ");
        
        // Sorting the array in ascending order
        Arrays.sort(arr);
        
        // Printing the k'th smallest element from the sorted array
        System.out.print(arr[k-1] + " ");
        
        // Displaying the k'th largest element of the array
        System.out.println("\nK'th largest element of the said array:");
        
        // Sorting the array in descending order to find the k'th largest element
        Arrays.sort(arr, Collections.reverseOrder());
        
        // Printing the k'th largest element from the sorted array
        System.out.print(arr[k-1] + " ");
    }
} 
