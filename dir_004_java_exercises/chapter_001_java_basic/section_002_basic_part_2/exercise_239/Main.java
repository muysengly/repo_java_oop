
// Importing the Scanner class from java.util package
import java.util.Scanner;

// Main class named "Main"
public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompting the user to input a sentence (max 1024 characters)
        System.out.println("Input a sentence (1024 characters max.)");

        // Reading the input sentence, removing commas and periods, and splitting into
        // words
        String[] str = ((sc.nextLine()).replace(",", "").replace(".", "")).split(" ");

        // Initializing a flag to control space between words in the output
        int flag = 0;

        // Prompting the user about the following output
        System.out.println("\n3 to 6 characters length of words:");

        // Iterating through each word in the array
        for (String s : str) {
            // Calculating the length of the current word
            int l = s.length();

            // Checking if the length is between 3 and 6 (inclusive)
            if (l >= 3 && l <= 6) {
                // Checking if a space should be printed before the current word
                if (flag == 1) {
                    System.out.print(" ");
                }
                // Printing the current word
                System.out.print(s);

                // Updating the flag to indicate that a word has been printed
                flag = 1;
            }
        }
    }
}
