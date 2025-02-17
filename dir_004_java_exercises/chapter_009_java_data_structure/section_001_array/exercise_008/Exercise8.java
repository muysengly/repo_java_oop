
// Import the Arrays class from the java.util package.
import java.util.Arrays;

// Define a class named Exercise8.
public class Exercise8 {

  // The main method where the program execution starts.
  public static void main(String[] args) {
    // Declare and initialize an integer array 'my_array'.
    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    // Declare and initialize a new integer array 'new_array' with the same size.
    int[] new_array = new int[10];

    // Print the source array using Arrays.toString() method.
    System.out.println("Source Array : " + Arrays.toString(my_array));

    // Loop to copy elements from the source array to the new array.
    for (int i = 0; i < my_array.length; i++) {
      new_array[i] = my_array[i];
    }

    // Print the new array containing copied elements.
    System.out.println("New Array: " + Arrays.toString(new_array));
  }
}
