import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if the string contains 'good' either at the beginning or after the first character
    public boolean hasGood(String str) {
        if (str.length() < 4) // If the string length is less than 4, return false
            return false;
        else if ((str.substring(0, 4)).equals("good")) // If the substring from index 0 to 4 matches "good", return true
            return true;
        else if (str.length() > 4) { // If the string length is greater than 4
            if ((str.substring(1, 5)).equals("good")) // If the substring from index 1 to 5 matches "good", return true
                return true;
        }
        return false; // Return false if none of the conditions are met
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "goodboy"; // Input string

        // Display the given string and whether 'good' appears in the string using hasGood method
        System.out.println("The given strings is: " + str1);
        System.out.println("The 'good' appears in the string: " + m.hasGood(str1));
    }
}
