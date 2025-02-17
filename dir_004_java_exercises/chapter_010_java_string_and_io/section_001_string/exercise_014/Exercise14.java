// Define a public class named Exercise14.
public class Exercise14 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize three string variables.
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";

        // Test if columnist1 is equal to columnist2 ignoring case.
        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);

        // Test if columnist1 is equal to columnist3 ignoring case.
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist3 + "\"? " + equals2);
    }
}
