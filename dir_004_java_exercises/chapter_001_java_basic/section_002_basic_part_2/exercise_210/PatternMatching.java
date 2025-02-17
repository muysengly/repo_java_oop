import java.util.*;

public class PatternMatching {
    
    // Method for wildcard pattern matching
    static boolean pattern_match(String string, String pattern) {
        // i measures the length of the string
        int i = 0;
        // j measures the length of the pattern
        int j = 0;
        int star_index = -1;
        int i_index = -1;

        while (i < string.length()) {
            // If '?' matches the ith character of the string or if the jth character of the
            // pattern matches the ith character of the string. e.g. (a & ?), (ab & ab)
            if (j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == string.charAt(i))) {
                ++i;
                ++j;
            } 
            // Counts '*' characters of the pattern when the count of the string is not
            // completed yet. e.g. (a & ***), (abb & ab****)
            else if (j < pattern.length() && pattern.charAt(j) == '*') {
                star_index = j;
                i_index = i;
                j++;
            } 
            // Counts the characters of the string which are left out once a '*' of the pattern 
            // gets counted e.g. (xayb & *a*b), (a & ***), (abcd & ab*), (aa & ?**)
            else if (star_index != -1) {
                j = star_index + 1;
                i = i_index + 1;
                i_index++;
            } 
            // If the characters of the string and pattern don't match
            // e.g. (xy & ab), (abxy & ab)
            else {
                return false;
            }
        }

        // Counts the '*' characters of the pattern when the characters before the '*' characters
        // of the pattern completely match the string and both are of the same length
        // (apart from the '*' characters of the pattern)
        // e.g. (ab and ab**), (aa and ??**)
        while (j < pattern.length() && pattern.charAt(j) == '*') {
            ++j;
        } 

        return j == pattern.length();
    }

    public static void main(String args[]) { 
        String str, pat;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        str = in.nextLine();
        System.out.println("Enter a pattern");
        pat = in.nextLine();
        if (pattern_match(str, pat))
            System.out.println("Yes"); 
        else
            System.out.println("No");
    }  
} 
