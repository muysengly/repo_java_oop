// Define a public class named Exercise25.
public class Exercise25 {

  // Define the main method.
  public static void main(String[] args) {
    // Declare and initialize a string variable.
    String str = "The quick brown fox jumps over the lazy dog.";

    // Replace all occurrences of 'fox' with 'cat'.
    String new_str = str.replaceAll("fox", "cat");

    // Display the original and modified strings for comparison.
    System.out.println("Original string: " + str);
    System.out.println("New String: " + new_str);
  }
}
