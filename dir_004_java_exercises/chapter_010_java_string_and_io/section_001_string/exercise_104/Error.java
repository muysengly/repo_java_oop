// Import the Arrays class from java.util package
import java.util.Arrays;

// Define a class named Main
public class Main {
    
    // Define an array of strings
    private static String[] strs = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
    
    // Define an enum to specify sorting direction
    public enum sort_asc_dsc {
        ASC, DESC
    }
    
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Print the original unsorted colors
        System.out.println("\nOriginal unsorted colors: " + Arrays.toString(strs));
        
        // Sort the array in descending order by length
        sort_array_by_length(strs, sort_asc_dsc.DESC);
        System.out.println("\nSorted color (descending order): " + Arrays.toString(strs));
        
        // Sort the array in ascending order by length
        sort_array_by_length(strs, sort_asc_dsc.ASC);
        System.out.println("\nSorted color (ascending order): " + Arrays.toString(strs));            
    }
    
    // Method to sort the array of strings by length based on the specified direction
    public static void sort_array_by_length(String[] strs, sort_asc_dsc direction) {
        // Check for null or empty input or invalid direction
        if (strs == null || direction == null || strs.length == 0) {
            return;
        }
        
        // Sort the array based on the direction specified
        if (direction.equals(sort_asc_dsc.ASC)) {
            // Sort in ascending order by length
            Arrays.sort(strs, (String str1, String str2) -> Integer.compare(str1.length(), str2.length()));
        } else if (direction.equals(sort_asc_dsc.DESC)) {
            // Sort in descending order by length
            Arrays.sort(strs, (String str1, String str2) -> (-1) * Integer.compare(str1.length(), str2.length()));
        }
    }
}
