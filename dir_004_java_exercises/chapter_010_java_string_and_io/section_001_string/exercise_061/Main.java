import java.util.*;

// Define a class named Main
public class Main {
    
    // Method to return a string formed by taking 'n' characters from the beginning and 'n' characters from the end
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Main m = new Main(); // Create an instance of the Main class

        String str1 = "Welcome"; // String
        int n1 = 3; // Integer 'n'
        
        // Display the given string, the given number, and the new string formed using nTwice method
        System.out.println("The given strings is: " + str1);
        System.out.println("The given numbers is: " + n1);
        System.out.println("The new string is: " + m.nTwice(str1, n1));
    }
}
