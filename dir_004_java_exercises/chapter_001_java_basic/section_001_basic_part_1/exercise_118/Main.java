import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define two strings, 's' and 't'
   		String s = "Python";
   		//String t = "Py";
   		  String t = "yt";
   		// String t = "ab";
        // Call the 'strStr' function with 's' and 't' as arguments and print the result
        System.out.printf(String.valueOf(strStr(s, t)));
    }

    public static int strStr(String source, String target) {
        // Check if either 'source' or 'target' is null
        if (source == null || target == null) {
            return -1; // Return -1 if either of them is null
        }
        
        // Check if 'target' is an empty string or is equal to 'source'
        if ("".equals(target) || source.equals(target)) {
            return 0; // Return 0 if 'target' is empty or equal to 'source'
        }
        
        int i = 0;
        int last = source.length() - target.length() + 1;

        // Iterate through 'source' while there are characters left to compare
        while (i < last) {
            if (source.charAt(i) == target.charAt(0)) {
                boolean equal = true;

                // Check if characters in 'source' match 'target' from the current position
                for (int j = 0; j < target.length() && equal; ++j) {
                    if (source.charAt(i + j) != target.charAt(j)) {
                        equal = false;
                    }
                }

                // If 'target' matches a substring of 'source', return the starting index
                if (equal) {
                    return i;
                }
            }
            ++i;
        }

        // If 'target' is not found in 'source', return -1
        return -1;
    }
}
