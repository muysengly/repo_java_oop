import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to concatenate strings with a separator 'ctr' times
  public String addBySeparator(String main_str, String sep_str, int ctr) {
    String new_word = ""; // Initialize an empty string to store the resulting word

    // Loop 'ctr' times to concatenate 'main_str' and 'sep_str' (except for the last iteration)
    for (int i = 0; i < ctr; i++) {
      if (i < ctr - 1)
        new_word += main_str + sep_str; // Concatenate 'main_str' and 'sep_str' if it's not the last iteration
      else
        new_word += main_str; // Concatenate 'main_str' only in the last iteration
    }
    return new_word; // Return the concatenated string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "try"; // First string
    String str2 = "best"; // Second string
    int ctr = 3; // Number of times to repeat the concatenation

    // Display the given strings and the number of times to repeat
    System.out.println("The given strings are: " + str1 + " and " + str2);
    System.out.println("Number of times to be repeated: " + ctr);

    // Display the resulting string after concatenation with a separator
    System.out.println("The new string is: " + m.addBySeparator(str1, str2, ctr));
  }
}
