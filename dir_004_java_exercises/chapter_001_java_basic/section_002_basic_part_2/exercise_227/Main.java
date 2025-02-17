
// Importing the Scanner class for user input
import java.util.Scanner;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Reading a line of text and splitting it into an array of strings
        String strs[] = sc.nextLine().split(" ");

        // Variables to track the maximum length and frequency
        int max_Length = 0;
        int indexL = 0;
        int max_Frequency = 0;
        int indexF = 0;

        // Prompting the user to input a text in a line
        System.out.println("Input a text in a line:");

        // Loop to iterate through the array of strings
        for (int i = 0; i < strs.length; i++) {
            // Checking and updating the maximum length
            if (max_Length < strs[i].length()) {
                indexL = i;
                max_Length = strs[i].length();
            }

            // Counting the frequency of the current string
            int ctr = 0;
            for (int j = i; j < strs.length; j++) {
                if (strs[i].equals(strs[j])) {
                    ctr++;
                }
            }

            // Checking and updating the maximum frequency
            if (max_Frequency < ctr) {
                indexF = i;
                max_Frequency = ctr;
            }
        }

        // Prompting the user with the most frequent text and the word with the maximum
        // number of letters
        System.out.println("Most frequent text and the word which has the maximum number of letters:");
        System.out.println(strs[indexF] + " " + strs[indexL]);
    }
}
