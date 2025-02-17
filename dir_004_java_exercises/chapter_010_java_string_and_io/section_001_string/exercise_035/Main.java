
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

  // The main method to start the execution of the program.
  public static void main(String[] args) {
    // Call the permutationWithRepeation method with the given string "PQR".
    permutationWithRepeation("PQR");
  }

  // Method to find permutations with repetition of characters.
  private static void permutationWithRepeation(String str1) {
    // Print the given string.
    System.out.println("The given string is: PQR");
    // Print the message for the permuted strings.
    System.out.println("The permuted strings are:");
    // Call the showPermutation method to display the permutations.
    showPermutation(str1, "");
  }

  // Recursive method to generate and display permutations.
  private static void showPermutation(String str1, String newStringToPrint) {
    // If the length of the new string equals the length of the original string,
    // print the new string.
    if (newStringToPrint.length() == str1.length()) {
      System.out.println(newStringToPrint);
      return;
    }

    // Iterate through the characters of the original string.
    for (int i = 0; i < str1.length(); i++) {
      // Recursively call showPermutation to append characters and generate
      // permutations.
      showPermutation(str1, newStringToPrint + str1.charAt(i));
    }
  }
}
