// Importing necessary Java utilities.
import java.util.*;

// Define a class named Main.
public class Main {
    
    // Method to check for matching pattern using wildcard characters.
    public static boolean chkMatching(char[] str1, char[] patstr, int n, int m, boolean[][] lookup) {
        // Base case: Both strings are empty, return true.
        if (m < 0 && n < 0) {
            return true;
        } else if (m < 0) {
            // If pattern string is empty but main string is not, return false.
            return false;
        } else if (n < 0) {
            // If main string is empty but pattern string contains only '*', return true.
            for (int i = 0; i <= m; i++) {
                if (patstr[i] != '*') {
                    return false;
                }
            }
            return true;
        }
        
        // If lookup table at current indices has not been calculated yet.
        if (!lookup[m][n]) {
            if (patstr[m] == '*') {
                // If pattern contains '*', check for matching by moving in both directions in pattern.
                lookup[m][n] = chkMatching(str1, patstr, n - 1, m, lookup) ||
                                chkMatching(str1, patstr, n, m - 1, lookup);
            } else {
                // If characters at current positions match or are '?' (wildcard), move to the previous positions.
                if (patstr[m] != '?' && patstr[m] != str1[n]) {
                    lookup[m][n] = false;
                } else {
                    lookup[m][n] = chkMatching(str1, patstr, n - 1, m - 1, lookup);
                }
            }
        }
        return lookup[m][n];
    }
    
    // Main method to execute the program.
    public static void main(String[] args) {
        // Define two strings for comparison.
        String st1 = "abcdhgh";
        String st2 = "abc*d?*";
        System.out.println("The given string is: " + st1);
        System.out.println("The given pattern string is: " + st2);
        
        // Convert strings to char arrays for pattern matching.
        char[] str1 = st1.toCharArray();
        char[] patstr = st2.toCharArray();

        // Create a lookup table for memoization.
        boolean[][] lookup = new boolean[str1.length + 1][patstr.length + 1];
        
        // Check if the given pattern matches the string using the chkMatching method.
        if (chkMatching(str1, patstr, str1.length - 1, patstr.length - 1, lookup)) {
            System.out.println("The given pattern is matching.");
        } else {
            System.out.println("The given pattern is not matching.");
        }
    }
}
