// Importing Arrays class from java.util package
import java.util.Arrays;

// Main class declaration
public class Main {    
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Define main string and sub string
        String main_string = "abcd abc aabc baa abcaa";
        String sub_string = "aa";
        
        // Count occurrences of sub string in main string using method count_sub_str_in_main_str
        int countV1 = count_sub_str_in_main_str(main_string, sub_string);
        
        // Print the count of occurrences of sub string in main string
        System.out.println(sub_string + "' has occured " + countV1 + " times in '" + main_string + "'");            
    }
    
    // Method to count occurrences of sub string in main string
    public static int count_sub_str_in_main_str(String main_string, String sub_string) {
        // Check for null strings
        if (main_string == null || sub_string == null) {
            throw new IllegalArgumentException("The given strings cannot be null");
        }
        
        // Check for empty strings
        if (main_string.isEmpty() || sub_string.isEmpty()) {
            return 0;
        }
        
        // Initialize variables for position and counter
        int position = 0;
        int ctr = 0;
        int n = sub_string.length();
        
        // Loop to find occurrences of sub string in main string
        while ((position = main_string.indexOf(sub_string, position)) != -1) {
            position = position + n;
            ctr++;
        }
        return ctr;
    }
}
