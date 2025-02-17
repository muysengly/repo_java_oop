// Define a public class named Exercise26.
public class Exercise26 {

  // Define the main method.
  public static void main(String[] args) {
    // Declare and initialize two string variables.
    String str1 = "Red is favorite color.";
    String str2 = "Orange is also my favorite color.";

    // The String to check the above two Strings to see
    // if they start with this value (Red).
    String startStr = "Red";

    // Check if the first two Strings start with startStr.
    boolean starts1 = str1.startsWith(startStr);
    boolean starts2 = str2.startsWith(startStr);

    // Display the results of the startsWith calls.
    System.out.println(str1 + " starts with " +
        startStr + "? " + starts1);
    System.out.println(str2 + " starts with " +
        startStr + "? " + starts2);
  }
}
