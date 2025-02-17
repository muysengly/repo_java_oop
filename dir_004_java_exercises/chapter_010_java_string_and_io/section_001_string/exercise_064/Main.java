import java.util.*;

// Define a class named Main
public class Main {

    // Method to return a modified string based on certain conditions
    public String withoutMacth(String str) {
        int len = str.length(); // Get the length of the input string

        if (len == 2) // If the length of the string is 2, return an empty string
            return "";
        if (len < 2) // If the length of the string is less than 2, return the original string
            return str;
        else {
            if (str.substring(0, 2).equals(str.substring(len - 2, len)))
                // If the substring of the first two characters is equal to the substring of the last two characters,
                // return a modified string excluding the first two characters
                return str.substring(2, len);
            else
                return str; // Otherwise, return the original string
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "educated"; // Input string

        // Display the given string and the new string using withoutMacth method
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + m.withoutMacth(str1));
    }
}
