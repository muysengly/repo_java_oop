import java.util.*;
import java.io.*;

public class Exercise84 {
    public static void main(String[] args) {
        // Initialize a string
        String string1 = "Python";
        
        // Define a subpart length
        int slength = 3;
        
        // Check if the subpart length is greater than the string length
        if (slength > string1.length()) {
            slength = string1.length(); // Limit it to the string length
        }

        // Get the subpart of the string from the last 3 characters
        String subpart = string1.substring(string1.length() - 3);
        
        // Print the result, which is the subpart followed by the original string and the subpart again
        System.out.println(subpart + string1 + subpart);
    }
}
