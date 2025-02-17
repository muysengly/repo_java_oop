import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to check if 'z' is happy in the given string
  public boolean aCharacterIsHappy(String stng) {
    int l = stng.length(); // Get the length of the given string
    boolean char_happy = true; // Initialize a boolean variable to check 'z' happiness
    
    // Loop through the string to check each character
    for (int i = 0; i < l; i++) {
      if (stng.charAt(i) == 'z') { // Check if the current character is 'z'
        if (i > 0 && stng.charAt(i - 1) == 'z') {
          char_happy = true; // If the previous character is 'z', set 'z' as happy
        } else if (i < l - 1 && stng.charAt(i + 1) == 'z') {
          char_happy = true; // If the next character is 'z', set 'z' as happy
        } else {
          char_happy = false; // If 'z' does not have a neighboring 'z', set 'z' as not happy
        }
      }
    }
    return char_happy; // Return whether 'z' is happy or not
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "azzlea"; // Given input string

    // Display the given string and whether 'z' is happy in it
    System.out.println("The given string is: " + str1);
    System.out.println("Is Z happy in the string: " + m.aCharacterIsHappy(str1));
  }
}
