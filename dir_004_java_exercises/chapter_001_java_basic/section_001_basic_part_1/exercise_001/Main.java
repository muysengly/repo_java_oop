import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to input their first name
        System.out.print("Input your first name: ");
        String fname = input.next();

        // Prompt the user to input their last name
        System.out.print("Input your last name: ");
        String lname = input.next();

        // Output a greeting message with the user's full name
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);
    }
}
