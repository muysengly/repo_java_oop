
// Importing the Scanner class for user input
import java.util.*;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initializing variables to count occurrences
        int count_1 = 0, count_2 = 0;

        // Prompting the user to input two adjoined sides and the diagonal of a
        // parallelogram (comma separated)
        System.out.println("Input two adjoined sides and the diagonal of a parallelogram (comma separated):");

        // Reading the input line and splitting it using commas
        String[] s = sc.nextLine().split(",");

        // Parsing the string values to integers
        int len1 = Integer.parseInt(s[0]);
        int len2 = Integer.parseInt(s[1]);
        int len3 = Integer.parseInt(s[2]);

        // Checking if the parallelogram is a rectangle based on the Pythagorean theorem
        if (len3 * len3 == len1 * len1 + len2 * len2)
            count_1++;

        // Checking if the parallelogram is a rhombus based on equal sides
        if (len1 == len2)
            count_2++;

        // Outputting the result based on the counts
        if (count_1 > 0)
            System.out.println("This is a rectangle.");
        if (count_2 > 0)
            System.out.println("This is a rhombus.");
    }
}
