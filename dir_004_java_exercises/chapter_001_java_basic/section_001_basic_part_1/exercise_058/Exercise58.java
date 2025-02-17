import java.util.*;

public class Exercise58 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        
        // Read a sentence from the user
        String line = in.nextLine();
        
        // Initialize an empty string to store the result in uppercase
        String upper_case_line = "";
        
        // Create a Scanner to process individual words in the sentence
        Scanner lineScan = new Scanner(line);
        
        // Iterate through the words in the sentence
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            
            // Capitalize the first letter of each word and append it to the result
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        
        // Remove trailing space and print the result in uppercase
        System.out.println(upper_case_line.trim());
    }
}
