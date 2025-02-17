import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to check if 'z' appears twice in succession in the string
  boolean appearTwice(String stng) {
    int i = stng.indexOf("z"); // Get the index of the first occurrence of 'z'
    if (i == -1) return false; // If 'z' is not found, return false
    
    if (i + 1 >= stng.length()) return false; // If 'z' is at the end of the string, return false
    
    // Check if the character after the first 'z' is also 'z'
    return stng.substring(i + 1, i + 2).equals("z");
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "fizzez"; // Given string
    // Display the given string and whether 'z' appears twice respectively
    System.out.println("The given string is: " + str1);
    System.out.println("Is 'z' appear twice respectively? " + m.appearTwice(str1));
  }
}
