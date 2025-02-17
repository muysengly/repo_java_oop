
// Import necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

  // The main method to start the execution of the program.
  public static void main(String args[]) {
    // Define three strings.
    String str1 = "MNO";
    String str2 = "PQ";
    String str3 = "PMQNO";

    // Print the given string and interleaving strings.
    System.out.println("The given string is: " + str3);
    System.out.println("The interleaving strings are " + str1 + " and " + str2);

    // Check if the given string is interleaving of str1 and str2, then print the
    // result.
    System.out.println("The given string is interleaving: " + checkInterleaved(str1, str2, str3));
  }

  // Method to check if a string is interleaving of two other strings.
  private static boolean checkInterleaved(String str1, String str2, String CheckInString) {
    int i = 0, j = 0, k = 0;

    // If the length of concatenated str1 and str2 doesn't match the length of the
    // checked string, return false.
    if (str1.length() + str2.length() != CheckInString.length()) {
      return false;
    }

    // Loop through the checked string.
    while (k < CheckInString.length()) {
      // Check if character at index i in str1 matches with character at index k in
      // CheckInString.
      if (i < str1.length() && str1.charAt(i) == CheckInString.charAt(k)) {
        i++;
      }
      // Check if character at index j in str2 matches with character at index k in
      // CheckInString.
      else if (j < str2.length() && str2.charAt(j) == CheckInString.charAt(k)) {
        j++;
      } else {
        return false;
      }
      k++;
    }

    // If lengths of str1, str2, and CheckInString don't match, return false.
    if (!(i == str1.length() && j == str2.length() && k == CheckInString.length())) {
      return false;
    }

    return true;
  }
}
