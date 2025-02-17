// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {

    // Method to find the smallest window in a string containing all characters of another string.
    public static String pickSubstring(String samp_str, String pat_str) {
        // Get the lengths of the given string and the pattern string.
        int ln1 = samp_str.length();
        int ln2 = pat_str.length();
        
        // Check if the given string is smaller than the pattern string.
        if (ln1 < ln2) {
            System.out.println("No such window can exist");
            return "";
        }
        
        // Initialize arrays to store character frequencies.
        int gvn_strg[] = new int[256];
        int pat_stgr[] = new int[256];
        
        // Count frequencies of characters in the pattern string.
        for (int i = 0; i < ln2; i++)
            pat_stgr[pat_str.charAt(i)]++;
        
        // Initialize variables for counting characters, starting index, and minimum length.
        int ctr = 0, start = 0, start_index = -1, min_length = Integer.MAX_VALUE;
        
        // Iterate through the given string.
        for (int j = 0; j < ln1; j++) {
            gvn_strg[samp_str.charAt(j)]++;
            
            // Update the counter if the current character in the given string is in the pattern.
            if (pat_stgr[samp_str.charAt(j)] != 0 && gvn_strg[samp_str.charAt(j)] <= pat_stgr[samp_str.charAt(j)])
                ctr++;
            
            // When all characters in the pattern are found in the given string.
            if (ctr == ln2) {
                while (gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0) {
                    if (gvn_strg[samp_str.charAt(start)] > pat_stgr[samp_str.charAt(start)] || pat_stgr[samp_str.charAt(start)] == 0)
                        gvn_strg[samp_str.charAt(start)]--;
                    start++;
                }
                
                // Calculate the length of the window.
                int length_window = j - start + 1;
                
                // Update minimum length and start index.
                if (min_length > length_window) {
                    min_length = length_window;
                    start_index = start;
                }
            }
        }
        
        // If no window exists.
        if (start_index == -1) {
            System.out.println("No such window exists");
            return "";
        }
        
        // Return the smallest window containing all characters of the pattern string.
        return samp_str.substring(start_index, start_index + min_length);
    }

    // Main method to execute the program.
    public static void main(String args[]) {
        // Define the main string and the pattern string.
        String str = "welcome to w3resource";
        String pat = "tower";
        System.out.println("The given string is: " + str);
        System.out.println("Characters to find in the main string are: " + pat);

        // Find and display the smallest window containing all characters of the pattern in the given string.
        System.out.print("The smallest window which contains the finding characters is : " + pickSubstring(str, pat));
    }
}
