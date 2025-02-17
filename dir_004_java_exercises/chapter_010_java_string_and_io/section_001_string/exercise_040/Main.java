
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

  // Method to split the string into 'n' parts.
  static void splitString(String str1, int n) {
    // Get the length of the string.
    int str_size = str1.length();
    int part_size;

    // Check if the size of the string is divisible by 'n'.
    if (str_size % n != 0) {
      // If not divisible, print a message and return.
      System.out.println("The size of the given string is not divisible by " + n);
      return;
    } else {
      // If divisible, proceed to split the string.
      System.out.println("The given string is: " + str1);
      System.out.println("The string divided into " + n + " parts and they are: ");

      // Calculate the size of each part.
      part_size = str_size / n;

      // Loop through the string characters.
      for (int i = 0; i < str_size; i++) {
        // If the current index is a multiple of 'part_size', start a new line.
        if (i % part_size == 0)
          System.out.println();
        // Print the character at the current index.
        System.out.print(str1.charAt(i));
      }
    }
  }

  // Main method to execute the program.
  public static void main(String[] args) {
    // Define a string and the number of parts to split.
    String str1 = "abcdefghijklmnopqrstuvwxy";
    int split_number = 5;

    // Call the method to split the string.
    splitString(str1, split_number);
  }
}
