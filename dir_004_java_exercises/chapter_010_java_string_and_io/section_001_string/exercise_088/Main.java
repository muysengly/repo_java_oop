import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to replace 'is' with 'is not' in specific conditions
  public String wordReplaceBy(String stng) {
    String newstring = ""; // Initialize an empty string to store the modified string
    int l = stng.length(); // Get the length of the given string
    
    // Loop through the string to perform the word replacement
    for(int i = 0; i < l; i++) {
      // Check conditions to replace 'is' with 'is not'
      if(i - 1 >= 0 && Character.isLetter(stng.charAt(i - 1)) || i + 2 < l && Character.isLetter(stng.charAt(i + 2))) {
        newstring += stng.charAt(i); // Append the character if conditions don't meet for 'is'
      } else if(i + 1 < l && stng.substring(i, i + 2).equals("is")) {
        newstring += "is not"; // Replace 'is' with 'is not'
        i++; // Increment the index to skip the next character
      } else {
        newstring += stng.charAt(i); // Append the character if it doesn't match 'is'
      }
    }
    return newstring; // Return the modified string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "it is a string"; // Given input string

    // Display the given string and the modified string after word replacement
    System.out.println("The given string is: " + str1);
    System.out.println("The new string is: " + m.wordReplaceBy(str1));
  }
}
