// Import the necessary Java classes.
import java.util.*;

// Define the 'solution' class.
public class Solution {

  // Define a method to find the largest number using an array of numbers.
  public static String largest_Numbers(int[] num) {
    // Convert the array of numbers to an array of strings.
    String[] array_nums = Arrays.stream(num).mapToObj(String::valueOf).toArray(String[]::new);
    
    // Sort the array of strings in descending order, considering their concatenated values.
    Arrays.sort(array_nums, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
    
    // Reduce the sorted array to find the largest number.
    return Arrays.stream(array_nums).reduce((a, b) -> a.equals("0") ? b : a + b).get();
  }	
	
  public static void main(String[] args)
  {
    // Initialize an array of numbers.
    int[] nums = {1, 2, 3, 0, 4, 6};
    
    // Print the original array and the largest number using the array elements.
    System.out.printf("\nOriginal array: " + Arrays.toString(nums));	
    System.out.printf("\nLargest number using the said array numbers: " + largest_Numbers(nums));
  }  
}
