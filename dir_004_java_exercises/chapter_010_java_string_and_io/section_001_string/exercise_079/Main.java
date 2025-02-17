import java.util.*;

// Define a class named Main
public class Main {

  // Method to create a new string following the Kit-Kat pattern
  public String kitKatPattern(String stng) {
    int len = stng.length(); // Get the length of the given string 'stng'
    String newformstring = ""; // Initialize an empty string to store the new formed string

    // Loop through each character in the given string 'stng'
    for (int i = 0; i < len; i++) {
      newformstring += stng.substring(i, i + 1); // Add each character to the new formed string 'newformstring'

      // Check if the current character is neither the first nor the last character of the string
      if (i > 0 && i < len - 1) {
        // Check if the previous character is 'z' and the next character is 'g'
        if (stng.charAt(i - 1) == 'z' && stng.charAt(i + 1) == 'g') {
          newformstring = newformstring.substring(0, newformstring.length() - 1); // Remove the last character added to 'newformstring'
        }
      }
    }
    return newformstring; // Return the new formed string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "zzgkitandkatcaketoket"; // Given string

    // Display the given string and the new string formed following the Kit-Kat pattern
    System.out.println("The given string is: " + str1);
    System.out.println("The new string is: " + m.kitKatPattern(str1));
  }
}
