import java.util.*;

// Define a class named Main
public class Main {

    // Method to check if the string ends with 'ng'
    public boolean endsNg(String str) {
        int len = str.length(); // Calculate the length of the input string
        String ng = "ng"; // Define the string 'ng'

        // If the length of the input string is less than 2 characters, return false
        if (len < 2)
            return false;
        // If the last two characters of the input string match 'ng', return true
        else if (ng.equals(str.substring(len - 2, len)))
            return true;
        // Otherwise, return false
        else
            return false;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        // Define a string to check if it ends with 'ng'
        String str1 = "string";

        // Display the given string and whether it contains 'ng' at the end using the endsNg method
        System.out.println("The given string is: " + str1);
        System.out.println("Does the string contain 'ng' at the end? " + m.endsNg(str1));
    }
}
