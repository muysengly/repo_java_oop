import java.util.*;

// Define a class named Main
public class Main {

  // Method to calculate the sum of digits in the given string
  public int sumOfDigits(String stng) {
    int l = stng.length(); // Get the length of the given string
    int sum = 0; // Initialize the sum of digits

    // Loop through each character of the string
    for (int i = 0; i < l; i++) {
      // Check if the character at the current index is a digit
      if (Character.isDigit(stng.charAt(i))) {
        String tmp = stng.substring(i, i + 1); // Get the digit as a substring
        sum += Integer.parseInt(tmp); // Convert the digit to integer and add it to the sum
      }
    }
    return sum; // Return the total sum of digits in the string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "ab5c2d4ef12s"; // Given string
    // Display the given string and the sum of its digits
    System.out.println("The given string is: " + str1);
    System.out.println("The sum of the digits in the string is: " + m.sumOfDigits(str1));
  }
}
