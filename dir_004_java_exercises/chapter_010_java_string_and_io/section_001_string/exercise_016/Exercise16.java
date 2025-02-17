
// Import the Calendar class from the java.util package.
import java.util.Calendar;

// Define a public class named Exercise16.
public class Exercise16 {
  // Define the main method.
  public static void main(String[] args) {
    // Declare and initialize a string variable.
    String str = "This is a sample String.";

    // Copy the contents of the string to a byte array.
    byte[] byte_arr = str.getBytes();

    // Create a new string using the contents of the byte array.
    String new_str = new String(byte_arr);

    // Display the contents of the byte array.
    System.out.println("\nThe new String equals " +
        new_str + "\n");
  }
}
