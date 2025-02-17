
// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

  // Define a method to check if a given string contains all the letters of
  // another string.
  static void checkExistance(String str1, String str_to_search) {
    int chk = 0; // Variable to check existence.
    char chhr = ' '; // Character variable.
    int[] a = new int[Character.MAX_VALUE + 1]; // Array to store character counts.

    // Loop through each character of the first string and count occurrences.
    for (int i = 0; i < str1.length(); i++) {
      chhr = str1.charAt(i);
      ++a[chhr];
    }

    // Loop through each character of the string to search.
    for (int i = 0; i < str_to_search.length(); i++) {
      chhr = str_to_search.charAt(i);
      if (a[chhr] >= 1)
        chk = 1; // Set check flag if character exists in the first string.
    }

    // If check flag is set, print the first string.
    if (chk == 1)
      System.out.println(str1);
  }

  // Main method to execute the program.
  public static void main(String[] args) {
    // Create a list of strings.
    List<String> list = new ArrayList<String>();
    list.add("rabbit");
    list.add("bribe");
    list.add("dog");

    // Print the given strings.
    System.out.print("The given strings are: ");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + "   ");
    }

    // Print the given word.
    System.out.println("\nThe given word is: bib ");
    System.out.println("\nThe strings containing all the letters of the given word are: ");

    // Check each string in the list for the existence of letters from the given
    // word.
    for (int j = 0; j < list.size(); j++) {
      checkExistance(list.get(j), "bib");
    }
  }
}
