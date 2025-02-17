import java.util.*;

// Define a class named Main
public class Main {

  // Method to check the equal appearance of "red" and "blue" substrings in the given string 'stng'
  public boolean checkSameAppearance(String stng) {
    int l = stng.length(); // Get the length of the given string 'stng'
    int red = 0; // Initialize a counter for "red" substring occurrences
    int blue = 0; // Initialize a counter for "blue" substring occurrences

    // Loop to check for "red" substring occurrences
    for (int i = 0; i < l - 2; i++) {
      String tmp = stng.substring(i, i + 3); // Extract a substring of length 3 starting at index 'i'

      // Check if the extracted substring is equal to "red"
      if (tmp.compareTo("red") == 0)
        red++; // Increment the count of "red" substring occurrences
    }

    // Loop to check for "blue" substring occurrences
    for (int i = 0; i < l - 3; i++) {
      String tmp = stng.substring(i, i + 4); // Extract a substring of length 4 starting at index 'i'

      // Check if the extracted substring is equal to "blue"
      if (tmp.compareTo("blue") == 0)
        blue++; // Increment the count of "blue" substring occurrences
    }

    // Check if the count of "red" and "blue" substrings are the same
    if (red == blue)
      return true; // Return true if the counts are equal
    else
      return false; // Return false if the counts are not equal
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "redcapmanwithbluecar"; // Given string

    // Display the given string and the result of equal appearance of "red" and "blue" substrings
    System.out.println("The given string is: " + str1);
    System.out.println("The appearance of red and blue are same: " + m.checkSameAppearance(str1));
  }
}
