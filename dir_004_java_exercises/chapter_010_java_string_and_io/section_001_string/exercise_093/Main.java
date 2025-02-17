import java.util.*;

// Define a class named Main
public class Main {

  // Method to find the longest substring that appears at both ends of the given string
  public String appearInBothEnds(String stng) {
    int l = stng.length(); // Get the length of the given string
    String f_str = ""; // Initialize a string to store the found substring
    String tmp = ""; // Initialize a temporary string

    // Loop through the characters of the given string
    for (int i = 0; i < l; i++) {
      tmp += stng.charAt(i); // Add the current character to the temporary string
      int t_len = tmp.length(); // Get the length of the temporary string

      // Check if the temporary string is present both at the beginning and end of the main string
      if (i < l / 2 && tmp.equals(stng.substring(l - t_len, l))) {
        f_str = tmp; // Update the found substring if a match is found
      }
    }
    return f_str; // Return the longest substring appearing at both ends of the string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "playersplay"; // Given string
    // Display the given string and the longest substring appearing at both ends
    System.out.println("The given string is: " + str1);
    System.out.println("The longest substring in the string is: " + m.appearInBothEnds(str1));
  }
}
