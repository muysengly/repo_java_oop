import java.util.*;

// Define a class named Main
public class Main {

  // Method to find the longest mirror image string in the given string
  public String endsWithMirrorImage(String stng) {
    int l = stng.length(); // Get the length of the given string
    String f_str = ""; // Initialize a string to store the longest mirror image string
    String t_str1 = ""; // Initialize temporary string 1
    String t_str2 = ""; // Initialize temporary string 2

    // Loop through the characters of the given string
    for (int i = 0; i < l; i++) {
      t_str1 += stng.substring(i, i + 1); // Add characters to temporary string 1
      t_str2 = ""; // Reset temporary string 2

      // Loop through the characters of temporary string 1 in reverse order
      for (int j = t_str1.length() - 1; j >= 0; j--) {
        t_str2 += t_str1.substring(j, j + 1); // Build temporary string 2 in reverse order

        // Check if temporary string 2 equals the mirror image at the end of the main string
        if (t_str2.equals(stng.substring(l - i - 1, l))) {
          f_str = t_str1; // Update the found string if a match is found
        }
      }
    }
    return f_str; // Return the longest mirror image string found
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "rotavator"; // Given string
    // Display the given string and the longest mirror image string
    System.out.println("The given string is: " + str1);
    System.out.println("The longest mirror image string in the string is: " + m.endsWithMirrorImage(str1));
  }
}
