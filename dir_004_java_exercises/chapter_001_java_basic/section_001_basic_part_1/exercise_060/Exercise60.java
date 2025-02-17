import java.util.*;

public class Exercise60 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        
        // Read a sentence from the user
        String line = in.nextLine();
        
        // Split the sentence into words using one or more spaces as the delimiter
        String[] words = line.split("[ ]+");
        
        // Print the penultimate word from the array
        System.out.println("Penultimate word: " + words[words.length - 2]);
    }
}
