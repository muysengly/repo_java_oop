// Define a public class named Exercise20.
public class Exercise20 {
  // Define the main method.
  public static void main(String[] args) {
    // Create three strings in three different ways.
    String str1 = "Java Exercises"; // Creating a string using string literal
    String str2 = new StringBuffer("Java").append(" Exercises").toString(); // Creating a string using StringBuffer and
                                                                            // converting it to string
    String str3 = str2.intern(); // Creating a string by interning str2

    // Determine which strings are equivalent using the ==
    // operator (as compared to calling equals(), which is
    // a more expensive operation.
    System.out.println("str1 == str2? " + (str1 == str2)); // Checking if str1 and str2 reference the same object
    System.out.println("str1 == str3? " + (str1 == str3)); // Checking if str1 and str3 reference the same object
  }
}
