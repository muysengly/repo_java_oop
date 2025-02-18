import java.util.Scanner; // Import the Scanner class from the java.util package to read input from the user

public class Main { // Define a public class named Main

    public static void main(String[] Strings) { // Main method to execute the program

        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Input a value for inch: "); // Prompt the user to input a value for inches

        double inch = input.nextDouble(); // Read the user's input as a double and store it in the variable inch

        double meters = inch * 0.0254; // Convert the inch value to meters using the conversion factor 0.0254

        System.out.println(inch + " inch is " + meters + " meters"); // Print the result of the conversion
    }
}