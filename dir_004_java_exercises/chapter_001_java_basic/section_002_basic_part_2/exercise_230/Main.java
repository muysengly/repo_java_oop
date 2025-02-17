
// Importing necessary classes for input/output operations
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Main class named "Main"
public class Main {

    // Main method to execute the program
    public static void main(String[] args) throws IOException {
        // Creating BufferedReader object to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompting the user to input a string
        System.out.println("Input the string:");

        // Reading the input string
        String str1 = br.readLine();

        // Replacing occurrences of "java" with "py_thon"
        str1 = str1.replaceAll("java", "py_thon");

        // Replacing occurrences of "python" with "java"
        str1 = str1.replaceAll("python", "java");

        // Replacing occurrences of "py_thon" with "python"
        str1 = str1.replaceAll("py_thon", "python");

        // Outputting the new string
        System.out.println("New string:");
        System.out.println(str1);
    }
}
