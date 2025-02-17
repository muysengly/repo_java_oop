import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        // Create a scanner to obtain input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.print("Input a string: ");
        
        // Read the input string and convert it to a character array
        char[] letters = scanner.nextLine().toCharArray();
        
        // Display a message before printing the reversed string
        System.out.print("Reverse string: ");
        
        // Iterate through the character array in reverse order and print each character
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
        
        // Print a newline character to end the output line
        System.out.print("\n");
    }
}
