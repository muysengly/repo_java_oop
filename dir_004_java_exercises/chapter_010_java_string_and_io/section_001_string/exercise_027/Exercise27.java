// Define a public class named Exercise27.
public class Exercise27 {

  // Define the main method.
  public static void main(String[] args) {
    // Declare and initialize a string variable.
    String str = "The quick brown fox jumps over the lazy dog.";

    // Get a substring of the above string starting from
    // index 10 and ending at index 26.
    String new_str = str.substring(10, 26);

    // Display the original and the extracted substring for comparison.
    System.out.println("old = " + str);
    System.out.println("new = " + new_str);
  }
}
