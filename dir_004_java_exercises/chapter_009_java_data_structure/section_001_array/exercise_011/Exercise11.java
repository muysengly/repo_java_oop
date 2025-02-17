
// Import the Arrays class from the java.util package.
import java.util.Arrays;

// Define a class named Exercise11.
public class Exercise11 {

  // The main method where the program execution starts.
  public static void main(String[] args) {
    // Declare and initialize an integer array 'my_array1'.
    int[] my_array1 = {
        1789, 2035, 1899, 1456, 2013,
        1458, 2458, 1254, 1472, 2365,
        1456, 2165, 1457, 2456
    };

    // Print the original array using Arrays.toString() method.
    System.out.println("Original array : " + Arrays.toString(my_array1));

    // Iterate through the first half of the array and reverse its elements.
    for (int i = 0; i < my_array1.length / 2; i++) {
      // Swap the elements at positions 'i' and 'length - i - 1'.
      int temp = my_array1[i];
      my_array1[i] = my_array1[my_array1.length - i - 1];
      my_array1[my_array1.length - i - 1] = temp;
    }

    // Print the reversed array using Arrays.toString() method.
    System.out.println("Reverse array : " + Arrays.toString(my_array1));
  }
}
