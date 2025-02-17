import java.util.*;

// Define a class named Main
public class Main {

  // Method to create a new string using even-indexed characters from the given string
  public String makeWithEvenCharacters(String stng) {
    int len = stng.length(); // Get the length of the given string
    String fin_str = ""; // Initialize an empty string to store the result

    // Loop through the string, incrementing by 2 to get even-indexed characters
    for (int i = 0; i < len; i = i + 2) {
      fin_str += stng.charAt(i); // Concatenate even-indexed characters to the result string
    }

    return fin_str; // Return the final string containing even-indexed characters
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "w3resource.com"; // Given string
    // Display the given string and the new string with even-indexed characters
    System.out.println("The given string is: " + str1);
    System.out.println("The new string is: " + m.makeWithEvenCharacters(str1));
  }
}
