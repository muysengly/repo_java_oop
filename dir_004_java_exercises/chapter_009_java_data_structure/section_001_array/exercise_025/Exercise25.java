
// Import the java.util package to use utility classes, including ArrayList.
import java.util.*;

// Define a class named Exercise25.
public class Exercise25 {
  // The main method for executing the program.
  public static void main(String[] args) {
    // Create an ArrayList to store common elements.
    ArrayList<Integer> common = new ArrayList<Integer>();

    // Declare three arrays of integers.
    int array1[] = { 2, 4, 8 };
    int array2[] = { 2, 3, 4, 8, 10, 16 };
    int array3[] = { 4, 8, 14, 40 };

    // Initialize three index variables for each array.
    int x = 0, y = 0, z = 0;

    // Use a while loop to compare elements of the three arrays.
    while (x < array1.length && y < array2.length && z < array3.length) {
      // Check if the elements at the current positions in all arrays are equal.
      if (array1[x] == array2[y] && array2[y] == array3[z]) {
        // If they are equal, add the element to the 'common' ArrayList and increment
        // all indices.
        common.add(array1[x]);
        x++;
        y++;
        z++;
      } else if (array1[x] < array2[y]) {
        // If the element in the first array is smaller, increment the index of the
        // first array.
        x++;
      } else if (array2[y] < array3[z]) {
        // If the element in the second array is smaller, increment the index of the
        // second array.
        y++;
      } else {
        // If the element in the third array is smaller, increment the index of the
        // third array.
        z++;
      }
    }

    // Print the common elements found in the three sorted arrays.
    System.out.println("Common elements from three sorted (in non-decreasing order) arrays: ");
    System.out.println(common);
  }
}
// </integer></integer>