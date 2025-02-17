import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to input the first and second strings
        System.out.println("Input the first string: ");
        String text = myObj.nextLine(); // Read the first string
        System.out.println("Input the second string: ");
        String word = myObj.nextLine(); // Read the second string

        // Check if the first string contains all letters from the second string
        System.out.println("Check first string contains letters from the second string:\n" + test(text, word));
    }

    // Method to check if the first string contains all letters from the second
    // string
    public static boolean test(String first_string, String second_string) {
        for (int n = 0; n < second_string.length(); n++) // Loop through each character of the second string
            if (first_string.replaceFirst(second_string.substring(n, n + 1), "").equals(first_string)) // If the
                                                                                                       // character
                                                                                                       // from the
                                                                                                       // second
                                                                                                       // string is not
                                                                                                       // found
                                                                                                       // in the first
                                                                                                       // string
                return false; // Return false
            else
                first_string = first_string.replaceFirst(second_string.substring(n, n + 1), ""); // Remove the character
                                                                                                 // from
                                                                                                 // the first string
        return true; // Return true if all characters from the second string are found in the first
                     // string
    }
}
