import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to repeat the last 'no_repeat' characters of a string 'stng' 'no_repeat' times
  public String lastNchrRepeat(String stng, int no_repeat) {
    int l = stng.length(); // Get the length of the given string 'stng'
    String new_word = ""; // Initialize an empty string to store the resulting word

    // Loop 'no_repeat' times to concatenate the last 'no_repeat' characters of 'stng' 'no_repeat' times
    for (int i = 0; i < no_repeat; i++) {
      new_word += stng.substring(l - no_repeat, l); // Extract the last 'no_repeat' characters of 'stng' and concatenate them to 'new_word'
    }
    return new_word; // Return the concatenated string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "string"; // Given string
    int no_char = 3; // Number of times to repeat the last characters

    // Display the given string and the number of times to repeat
    System.out.println("The given string is: " + str1);
    System.out.println("The new string after repetition: " + m.lastNchrRepeat(str1, no_char));
  }
}
