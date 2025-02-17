import java.util.*;
public class Exercise59 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        
        // Read a string from the user
        String line = in.nextLine();
        
        // Convert the string to lowercase
        line = line.toLowerCase();
        
        // Print the lowercase version of the input string
        System.out.println(line);
    }
}
