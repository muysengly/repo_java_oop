
// Import the Calendar class from the java.util package.
import java.util.Calendar;

// Define a public class named Exercise15.
public class Exercise15 {
    // Define the main method.
    public static void main(String[] args) {
        // Get an instance of the Calendar class representing the current date and time.
        Calendar c = Calendar.getInstance();

        // Print the message indicating current date and time.
        System.out.println("Current Date and Time :");

        // Print the formatted date (month day, year) using the specified format.
        System.out.format("%tB %te, %tY%n", c, c, c);

        // Print the formatted time (hour:minute am/pm) using the specified format.
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
