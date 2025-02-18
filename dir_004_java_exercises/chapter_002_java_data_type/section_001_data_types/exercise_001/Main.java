import java.util.Scanner; // Import the Scanner class from the java.util package to read input from the user

public class Main { // Define a public class named Main

    public static void main(String[] Strings) { // Main method to execute the program

        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Input a degree in Fahrenheit: "); // Prompt the user to input a degree in Fahrenheit
        double fahrenheit = input.nextDouble(); // Read the user's input as a double and store it in the variable
                                                // fahrenheit

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0); // Convert the Fahrenheit value to Celsius using the formula
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius"); // Print the
                                                                                                      // result of the
                                                                                                      // conversion
    }
}
