import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define and initialize an array of integers
        int[] nums = {10, 2, 38, 22, 38, 23};
        
        // Display the original array
        System.out.println("Original array: " + Arrays.toString(nums));
        
        // Calculate and display the median of the array
        System.out.println("Median of the said array of integers: " + getMedian(nums));
        
        // Define and initialize another array of integers
        int[] nums1 = {10, 2, 38, 23, 38, 23, 21};
        
        // Display the original array
        System.out.println("\nOriginal array: " + Arrays.toString(nums1));
        
        // Calculate and display the median of the second array
        System.out.println("Median of the said array of integers: " + getMedian(nums1));
    }

    public static int getMedian(int[] array) {
        // Check if the length of the array is even
        if (array.length % 2 == 0) {
            // Calculate the median for even-sized arrays
            int mid = array.length / 2;
            return (array[mid] + array[mid - 1]) / 2;
        }
        // Calculate the median for odd-sized arrays
        return array[array.length / 2];
    }
}
