// Define a public class named Exercise13.
public class Exercise13 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize three string variables.
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        // Check if columnist1 is equal to columnist2.
        boolean equals1 = columnist1.equals(columnist2);

        // Check if columnist1 is equal to columnist3.
        boolean equals2 = columnist1.equals(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
                columnist3 + "\"? " + equals2);
    }
}
