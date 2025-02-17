
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

  // Main method to execute the program.
  public static void main(String[] args) {
    // Declare and initialize a string variable.
    String str1 = "gibblegabbler";

    // Print the original string.
    System.out.println("The given string is: " + str1);

    // Loop through each character of the string.
    for (int i = 0; i < str1.length(); i++) {
      // Assume the character at index 'i' is unique initially.
      boolean unique = true;

      // Loop through the string again to compare characters.
      for (int j = 0; j < str1.length(); j++) {
        // Check if the characters at positions 'i' and 'j' are the same but not at the
        // same index.
        if (i != j && str1.charAt(i) == str1.charAt(j)) {
          // If found, set unique to false and break the loop.
          unique = false;
          break;
        }
      }

      // If the character at index 'i' is unique, print it and exit the loop.
      if (unique) {
        System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
        break;
      }
    }
  }
}
