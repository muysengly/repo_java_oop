// Importing the required Java utilities package
import java.util.*;

// Defining a class named Solution
public class Solution {
  
  // Method to check if one string contains another string
  public static boolean is_str_contains(String str1, String str2) {
    // Checking if either of the input strings is null
    if (str1 == null || str2 == null) {
      throw new IllegalArgumentException("You can't pass null strings as input."); // Throwing an exception for null input strings
    }
    
    boolean ans = false; // Initializing a boolean variable to store the result
    
    // Loop to iterate through the characters of str2
    for (int i = 0; i < str2.length() - 1; i++) {
      // Checking if the current character in str2 matches the first character of str1
      if (str2.charAt(i) == str1.charAt(0)) {
        // Loop to compare str1 with a substring of str2 starting from the current character
        for (int j = 0; j < str1.length(); j++) {
          // Checking if the characters of str1 match with the corresponding substring of str2
          if ((i + j) < str2.length() && str1.charAt(j) == str2.charAt(i + j) && j == str1.length() - 1) {
            ans = true; // Setting the result to true if str1 is found in str2
            break; // Exiting the loop once the match is found
          }
        }
      }
    }
    
    return ans; // Returning the result indicating whether str2 contains str1
  }

  // The main method of the program
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the user
    
    // Asking the user to input the first string
    System.out.print("Input first string: ");
    String str1 = scanner.nextLine(); // Reading the first string input from the user
    
    // Asking the user to input the second string
    System.out.print("Input second string: ");
    String str2 = scanner.nextLine(); // Reading the second string input from the user
    
    // Checking and displaying if the second string contains the first one
    System.out.println("If the second string contains the first one? " + is_str_contains(str1, str2));
  }
} 
