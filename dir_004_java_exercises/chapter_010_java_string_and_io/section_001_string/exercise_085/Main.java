import java.util.*;

// Define a class named Main
public class Main {

  // Method to find the 'm_stng' occurrences around the 't_stng' string
  public String mAndTstring(String m_stng, String t_stng) {
    int m_st_len = m_stng.length(); // Get the length of the 'm_stng'
    int t_st_len = t_stng.length(); // Get the length of the 't_stng'
    String fin = ""; // Initialize an empty string to store the result

    // Loop through 'm_stng' to find occurrences of 't_stng'
    for (int i = 0; i < m_st_len - t_st_len + 1; i++) {
      String tmp = m_stng.substring(i, i + t_st_len); // Get a substring of 'm_stng' from 'i' to 'i+t_st_len'

      // Check if 'tmp' substring equals 't_stng'
      if (i > 0 && tmp.equals(t_stng)) {
        fin += m_stng.substring(i - 1, i); // Append the character before the 't_stng' occurrence
      }

      // Check if 'tmp' substring equals 't_stng' and not at the end of 'm_stng'
      if (i < m_st_len - t_st_len && tmp.equals(t_stng)) {
        fin += m_stng.substring(i + t_st_len, i + t_st_len + 1); // Append the character after the 't_stng' occurrence
      }
    }
    return fin; // Return the resulting string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "weablcoabmeab"; // Input string
    String str2 = "ab"; // String to find occurrences

    // Display the given strings and the new string after processing
    System.out.println("The given string are: " + str1 + "  and " + str2);
    System.out.println("The new string is: " + m.mAndTstring(str1, str2));
  }
}
