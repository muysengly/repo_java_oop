import java.util.*;

public class Exercise61 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("\nInput a word: ");
        
        // Read a word from the user
        String word = in.nextLine();
        
        // Trim any leading or trailing whitespaces
        word = word.trim();
        
        // Initialize an empty string for the reversed word
        String result = ""; 
        
        // Convert the word to a character array
        char[] ch = word.toCharArray();  
        
        // Reverse the word by iterating through the characters
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        
        // Print the reversed word
        System.out.println("Reverse word: " + result.trim()); 
    }
}
