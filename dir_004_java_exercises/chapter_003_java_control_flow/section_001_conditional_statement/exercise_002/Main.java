import java.util.Scanner; // Import the Scanner class from the java.util package

public class Main { // Declare the Main class

    public static void main(String[] Strings) { // Declare the main method, the entry point of the program

        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the user

        System.out.print("Input a: "); // Prompt the user to input the value of 'a'
        double a = input.nextDouble(); // Read the input value as a double and assign it to variable 'a'
        System.out.print("Input b: "); // Prompt the user to input the value of 'b'
        double b = input.nextDouble(); // Read the input value as a double and assign it to variable 'b'
        System.out.print("Input c: "); // Prompt the user to input the value of 'c'
        double c = input.nextDouble(); // Read the input value as a double and assign it to variable 'c'

        double result = b * b - 4.0 * a * c; // Calculate the discriminant of the quadratic equation

        if (result > 0.0) { // Check if the discriminant is positive
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a); // Calculate the first root
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a); // Calculate the second root
            System.out.println("The roots are " + r1 + " and " + r2); // Print the two roots
        } else if (result == 0.0) { // Check if the discriminant is zero
            double r1 = -b / (2.0 * a); // Calculate the single root
            System.out.println("The root is " + r1); // Print the single root
        } else { // If the discriminant is negative
            System.out.println("The equation has no real roots."); // Print that there are no real roots
        }

    } // Close the main method
} // Close the Main class
