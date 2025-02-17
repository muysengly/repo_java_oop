
// Import necessary Java classes.
import java.util.Scanner;
import java.util.Arrays;

// Define the 'Main' class.
public class Main {
  // Define the main method for running the program.
  public static void main(String[] args) {
    // Initialize an array of strings representing letters.
    // You can use one of these alternative 'str_arra' arrays by uncommenting them.
    String[] str_arra = { "A", "B", "D", "E" };
    // String[] str_arra = {"a", "b", "c", "e"};
    // String[] str_arra = {"p", "r", "s", "t"};

    // Print the original array of elements.
    System.out.printf("Original array of elements:\n" + Arrays.toString(str_arra));

    // Call the 'test' method to find the missing letter in the array.
    String result = test(str_arra);

    // Print the missing letter found in the array.
    System.out.printf("\nMissing letter in the said array: " + result);
  }

  // Define the 'test' method to find the missing letter in the array.
  public static String test(String[] str_arra) {
    // Iterate through the array to find the missing letter.
    for (int i = 0; i < str_arra.length - 1; i++) {
      // Check the difference between adjacent characters.
      if (str_arra[i + 1].charAt(0) - str_arra[i].charAt(0) > 1) {
        // Calculate and return the missing character as a string.
        String result_char = "" + (char) ((int) str_arra[i].charAt(0) + 1);
        return result_char;
      }
    }

    // Return an empty string if no letter is missing.
    return "";
  }
}
