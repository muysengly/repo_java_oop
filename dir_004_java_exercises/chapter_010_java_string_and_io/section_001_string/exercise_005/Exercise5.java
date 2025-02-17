// Define a public class named Exercise5.
public class Exercise5 {
    // Define the main method.
    public static void main(String[] args) {
        // Declare and initialize two string variables.
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        // Print the first string.
        System.out.println("String 1: " + str1);
        // Print the second string.
        System.out.println("String 2: " + str2);

        // Compare the two strings and get the comparison result.
        int result = str1.compareTo(str2);

        // Display the results of the comparison.
        if (result < 0) {
            // If the result is less than 0, print that the first string is less than the
            // second.
            System.out.println("\"" + str1 + "\"" +
                    " is less than " +
                    "\"" + str2 + "\"");
        } else if (result == 0) {
            // If the result is 0, print that the first string is equal to the second.
            System.out.println("\"" + str1 + "\"" +
                    " is equal to " +
                    "\"" + str2 + "\"");
        } else { // if (result > 0)
            // If the result is greater than 0, print that the first string is greater than
            // the second.
            System.out.println("\"" + str1 + "\"" +
                    " is greater than " +
                    "\"" + str2 + "\"");
        }
    }
}
