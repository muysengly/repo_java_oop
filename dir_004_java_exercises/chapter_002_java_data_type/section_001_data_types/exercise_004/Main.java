import java.util.Scanner; // Import the Scanner class from the java.util package to read input from the user

public class Main { // Define a public class named Main

    public static void main(String[] Strings) { // Main method to execute the program

        double minutesInYear = 60 * 24 * 365; // Calculate the number of minutes in a year (60 minutes/hour * 24
                                              // hours/day * 365 days/year)

        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Input the number of minutes: "); // Prompt the user to input the number of minutes

        double min = input.nextDouble(); // Read the user's input as a double and store it in the variable min

        long years = (long) (min / minutesInYear); // Calculate the number of years by dividing the input minutes by the
                                                   // number of minutes in a year and cast the result to long
        int days = (int) (min / 60 / 24) % 365; // Calculate the number of days by dividing the input minutes by 60
                                                // (minutes/hour) and 24 (hours/day), then take the remainder when
                                                // divided by 365

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days"); // Print
                                                                                                               // the
                                                                                                               // result
                                                                                                               // of the
                                                                                                               // conversion
    }
}
