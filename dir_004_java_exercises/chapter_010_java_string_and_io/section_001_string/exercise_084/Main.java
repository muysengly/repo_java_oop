import java.util.*;

// Define a class named Main
public class Main {

  // Method to repeat the beginning characters of a string 'stng' 'n' times
  public String beginningRepetition(String stng, int n) {
    int l = stng.length(); // Get the length of the input string 'stng'
    String newstring = ""; // Initialize an empty string to store the new string
    
    // Loop 'n' times to repeat the beginning characters
    for (int i = n; n > 0; n--) {
      newstring += stng.substring(0, n); // Append the substring from index 0 to 'n' of 'stng' to 'newstring'
    }
    return newstring; // Return the new string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "welcome"; // Input string
    int rep_no = 4; // Number of repetitions

    // Display the given string, the number of repetitions, and the new string after repetition
    System.out.println("The given string is: " + str1);
    System.out.println("Number of repetition characters and repetition: " + rep_no);
    System.out.println("The new string is: " + m.beginningRepetition(str1, rep_no));
  }
}
