import java.util.*;

// Define a class named Main
public class Main {
  
  // Method to calculate the sum of numbers present in a string
  public int sumOfTheNumbers(String stng) {
    int l = stng.length(); // Get the length of the given string
    int sum = 0; // Initialize a variable to store the sum
    String temp = ""; // Initialize an empty string to store temporary numeric values

    // Loop through the string to find and sum the numbers
    for (int i = 0; i < l; i++) {
      // Check if the character is a digit
      if (Character.isDigit(stng.charAt(i))) {
        // If the next character is also a digit, add the current digit to the temporary string
        if (i < l - 1 && Character.isDigit(stng.charAt(i + 1))) {
          temp += stng.charAt(i);
        } else {
          // If the next character is not a digit or it's the end of the string, add the last digit to the temporary string
          temp += stng.charAt(i);
          // Convert the temporary string to an integer and add it to the sum
          sum += Integer.parseInt(temp);
          temp = ""; // Reset the temporary string for the next number
        }
      }
    }
    return sum; // Return the total sum of the numbers found in the string
  }

  // Main method to execute the program
  public static void main(String[] args) {
    Main m = new Main(); // Create an instance of the Main class

    String str1 = "it 15 is25 a 20string"; // Given input string

    // Display the given string and the sum of the numbers present in it
    System.out.println("The given string is: " + str1);
    System.out.println("The sum of numbers in the string is: " + m.sumOfTheNumbers(str1));
  }
}
