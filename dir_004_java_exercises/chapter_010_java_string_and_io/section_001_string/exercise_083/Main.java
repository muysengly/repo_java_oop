import java.util.*;

// Define a class named Main
public class Main {

  // Method to mix two strings 'stng1' and 'stng2' character-wise
  public String stringMixing(String stng1, String stng2) {
    int len1 = stng1.length(); // Get the length of the first string 'stng1'
    int len2 = stng2.length(); // Get the length of the second string 'stng2'
    int max_len = Math.max(len1, len2); // Find the maximum length between two strings
    String newstring = ""; // Initialize an empty string to store the mixed string

    // Loop through up to the maximum length of the two strings
    for (int i = 0; i < max_len; i++) {
      // Append the character at index 'i' in 'stng1' if it exists
      if (i <= len1 - 1)
        newstring += stng1.substring(i, i + 1);
      // Append the character at index 'i' in 'stng2' if it exists
      if (i <= len2 - 1)
        newstring += stng2.substring(i, i + 1);
    }
    return newstring; // Return the mixed string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "welcome"; // First string
    String str2 = "w3resource"; // Second string

    // Display the given strings and the new mixed string
    System.out.println("The given strings are: " + str1 + " and " + str2);
    System.out.println("The new string is: " + m.stringMixing(str1, str2));
  }
}
