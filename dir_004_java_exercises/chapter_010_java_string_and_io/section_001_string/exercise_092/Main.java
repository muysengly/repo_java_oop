import java.util.*;

// Define a class named Main
public class Main {

  // Method to remove occurrences of a string from another string
  public String removeString(String m_string, String r_string) {
    int m_st_len = m_string.length(); // Get the length of the main string
    int r_st_len = r_string.length(); // Get the length of the removable string
    String m_lower = m_string.toLowerCase(); // Convert the main string to lowercase
    String r_lower = r_string.toLowerCase(); // Convert the removable string to lowercase
    String f_string = ""; // Initialize a new string to store the modified string

    // Loop through the main string
    for (int i = 0; i < m_st_len; i++) {
      // Check if there are enough characters left in the main string to match the removable string
      if (i <= m_st_len - r_st_len) {
        String tmp = m_lower.substring(i, i + r_st_len); // Extract a substring for comparison
        if (!tmp.equals(r_lower))
          f_string += m_string.substring(i, i + 1); // Append the character to the new string
        else {
          i += r_st_len - 1; // Skip the removable string in the main string
        }
      } else {
        String tmp2 = m_lower.substring(i, i + 1); // Extract a single character for comparison
        if (!tmp2.equals(r_lower))
          f_string += m_string.substring(i, i + 1); // Append the character to the new string
      }
    }
    return f_string; // Return the modified string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "This is the test string"; // Given main string
    String str2 = "st"; // Given removable string

    // Display the main string, the removable string, and the modified string after removal
    System.out.println("The main string is: " + str1);
    System.out.println("The removable string is: " + str2);
    System.out.println("The new string is: " + m.removeString(str1, str2));
  }
}
