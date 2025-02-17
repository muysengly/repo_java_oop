import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to extract pairs of characters from the string
  public String pairsToReturn(String stng) {
    String fin_str = ""; // Initialize an empty string to store the modified string
    
    // Loop through the string with a step size of 5
    for (int i = 0; i < stng.length(); i += 5) {
      int end = i + 3; // Set the end index for extracting pairs
      
      // Check if the calculated end index is greater than the string's length
      if (end > stng.length()) {
        end = stng.length(); // If yes, update the end index to the string's length
      }
      
      // Extract a pair of characters from the string and append it to the final string
      fin_str = fin_str + stng.substring(i, end);
    }
    return fin_str; // Return the modified string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "w3resource.com"; // Given string
    // Display the given string and the new string after extracting pairs
    System.out.println("The given string is: " + str1);
    System.out.println("The new string is: " + m.pairsToReturn(str1));
  }
}
