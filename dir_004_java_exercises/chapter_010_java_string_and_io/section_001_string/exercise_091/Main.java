import java.util.*;

// Define a class named Main
public class Main {

  // Method to count the number of words that end with 'm' or 'n'
  public int endWithmOrn(String stng) {
    int l = stng.length(); // Get the length of the given string
    int ctr = 0; // Initialize a counter for words ending with 'm' or 'n'

    stng = stng.toLowerCase(); // Convert the string to lowercase for uniformity

    // Loop through the string to find words ending with 'm' or 'n'
    for (int i = 0; i < l; i++) {
      // Check if the character is 'm' or 'n'
      if (stng.charAt(i) == 'm' || stng.charAt(i) == 'n') {
        // Check if it is at the end of the string or followed by a non-letter character
        if (i < l - 1 && !Character.isLetter(stng.charAt(i + 1)))
          ctr++;
        else if (i == l - 1)
          ctr++;
      }
    }
    return ctr; // Return the count of words ending with 'm' or 'n'
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "mam is in the room"; // Given input string

    // Display the given string and the number of words ending with 'm' or 'n'
    System.out.println("The given string is: " + str1);
    System.out.println("The number of words that end with 'm' or 'n' is: " + m.endWithmOrn(str1));
  }
}
