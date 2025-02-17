import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to input a string and a word to remove
        System.out.println("Input a string: ");
        String text = myObj.nextLine(); // Read the input string
        System.out.println("Input a word to remove: ");
        String word = myObj.nextLine(); // Read the word to remove

        // Display the new string after removing the specified word
        System.out.println("New string, after removing the said word:\n" + test(text, word));
    }

    // Method to remove a specified word from a given string
    public static String test(String text, String word) {
        String result_str = text.replace(word, ""); // Replace occurrences of the word with an empty string
        result_str = result_str.replaceAll("\\s+", " "); // Remove extra spaces in the resultant string
        return result_str; // Return the modified string
    }
}
