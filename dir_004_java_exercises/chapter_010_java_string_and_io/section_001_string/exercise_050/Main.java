// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
  
  // Method to calculate factorial of a number recursively.
  public static int makefactorial(int n) {
    // If n is less than or equal to 2, return n. Otherwise, calculate n * factorial of (n - 1).
    return (n <= 2) ? n : n * makefactorial(n - 1);
  }

  // Method to calculate the lexicographic rank of a given string.
  public static int calcuLexicoRank(String str, int n) {
    // Counter for the rank initialized to 1.
    int ctrOfRank = 1;
    
    // Loop through each character in the string.
    for (int i = 0; i < n; i++) {
      int ctr = 0;
      
      // Compare the character at index i with subsequent characters.
      for (int j = i + 1; j <= n; j++) {
        // If the character at index i is greater than the character at index j, increment the counter.
        if (str.charAt(i) > str.charAt(j))
          ctr++;
      }
      
      // Calculate the lexicographic rank using the formula.
      ctrOfRank += ctr * makefactorial(n - i);
    }
    return ctrOfRank; // Return the calculated rank.
  }
  
  // Main method to execute the program.
  public static void main(String[] args) {
    String str = "BDCA";
    System.out.println("The Given String is: " + str);
    int n = str.length(); // Get the length of the string.
    // Display the lexicographic rank of the given string.
    System.out.print("The Lexicographic rank of the given string is: " + calcuLexicoRank(str, n - 1));
  }
}
