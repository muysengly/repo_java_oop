
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
  // Define a constant representing the number of characters (ASCII).
  static final int NOOFCHARS = 256;

  // Define a method to find the second most frequent character in a string.
  static char get2ndMostFreq(String str1) {
    // Create an array to count occurrences of each character in the string.
    int[] ctr = new int[NOOFCHARS];
    int i;

    // Count occurrences of each character in the string.
    for (i = 0; i < str1.length(); i++) {
      (ctr[str1.charAt(i)])++;
    }

    // Variables to store indices of the first and second most frequent characters.
    int ctr_first = 0, ctr_second = 0;
    for (i = 0; i < NOOFCHARS; i++) {
      if (ctr[i] > ctr[ctr_first]) {
        ctr_second = ctr_first;
        ctr_first = i;
      } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first]) {
        ctr_second = i;
      }
    }

    // Return the second most frequent character.
    return (char) ctr_second;
  }

  // The main method to execute the code.
  public static void main(String args[]) {
    // Define the input string.
    String str1 = "successes";
    System.out.println("The given string is: " + str1);

    // Get the second most frequent character from the input string.
    char res = get2ndMostFreq(str1);

    // Display the result.
    if (res != '\0') {
      System.out.println("The second most frequent char in the string is: " + res);
    } else {
      System.out.println("No second most frequent character found in the string.");
    }
  }
}
