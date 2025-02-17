
// Import the java.util package to use utility classes, including Arrays.
import java.util.*;

// Define a class named Exercise26.
public class Exercise26 {
  // The main method for executing the program.
  public static void main(String[] args) throws Exception {
    // Declare and initialize an array of integers.
    int[] array_nums = { 0, 0, 1, 0, 3, 0, 5, 0, 6 };
    int i = 0;

    // Print the original array.
    System.out.print("\nOriginal array: \n");
    for (int n : array_nums)
      System.out.print(n + "  ");

    // Use a loop to move zeros to the end of the array.
    for (int j = 0, l = array_nums.length; j < l;) {
      if (array_nums[j] == 0)
        j++;
      else {
        // Swap the non-zero element with the first available zero.
        int temp = array_nums[i];
        array_nums[i] = array_nums[j];
        array_nums[j] = temp;
        i++;
        j++;
      }
    }

    // Fill the remaining positions with zeros.
    while (i < array_nums.length)
      array_nums[i++] = 0;

    // Print the array after moving zeros to the end.
    System.out.print("\nAfter moving 0's to the end of the array: \n");
    for (int n : array_nums)
      System.out.print(n + "  ");
    System.out.print("\n");
  }
}
