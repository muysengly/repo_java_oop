import java.util.Scanner; // Import the Scanner class from the java.util package to read input from the user

public class Main { // Define a public class named Main

    // Main method to execute the program
    public static void main(String[] Strings) {

        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the time zone offset to GMT
        System.out.print("Input the time zone offset to GMT: ");
        // Read the user's input as a long and store it in the variable timeZoneChange
        long timeZoneChange = input.nextInt();

        // Get the current time in milliseconds since January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Convert the total milliseconds to seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Calculate the current second by taking the remainder of total seconds divided
        // by 60
        long currentSecond = totalSeconds % 60;

        // Convert the total seconds to minutes
        long totalMinutes = totalSeconds / 60;

        // Calculate the current minute by taking the remainder of total minutes divided
        // by 60
        long currentMinute = totalMinutes % 60;

        // Convert the total minutes to hours
        long totalHours = totalMinutes / 60;

        // Calculate the current hour by adding the time zone offset and taking the
        // remainder of total hours divided by 24
        long currentHour = ((totalHours + timeZoneChange) % 24);

        // Print the current time in hours, minutes, and seconds
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
