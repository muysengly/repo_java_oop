
// Importing necessary Java libraries for input and exception handling
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// Main class named "Main"
public class Main {
    // Main method to execute the program
    public static void main(String[] args) throws IOException {
        // Creating a BufferedReader object for efficient reading of input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompting the user to input six integers
        System.out.println("Input six integers:");

        // Reading the input line and splitting it into an array of strings
        String[] input = br.readLine().split(" ", 6);

        // Declaring an array to store the six integers
        int[] data = new int[6];

        // Parsing each string in the input array and storing it as an integer in the
        // data array
        for (int i = 0; i < 6; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        // Sorting the integers in descending order using the Bubble Sort algorithm
        for (int j = 0; j < 5; j++) {
            for (int i = 5; i > j; i--) {
                if (data[i - 1] < data[i]) {
                    // Swapping elements if they are in the wrong order
                    int swp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = swp;
                }
            }
        }

        // Creating a StringBuilder to build the output string efficiently
        StringBuilder sb = new StringBuilder();

        // Appending each sorted integer followed by a space to the StringBuilder
        for (int i : data) {
            sb.append(i);
            sb.append(" ");
        }

        // Displaying the result after sorting the integers
        System.out.println("After sorting the said integers:");

        // Printing the final output string after removing the trailing space
        System.out.println(sb.substring(0, sb.length() - 1));
    }
}
