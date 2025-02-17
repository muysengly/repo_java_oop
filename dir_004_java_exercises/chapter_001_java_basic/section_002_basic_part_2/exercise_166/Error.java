// Importing the required Java utilities package
import java.util.*;

// Defining a class named Solution
public class Solution {
  
  // Method to convert an integer to a string
  public static String transform_int_to_string(int n) {
    boolean is_negative = false; // Initializing a boolean variable to determine if the number is negative
    StringBuilder tsb = new StringBuilder(); // Creating a StringBuilder object to store the transformed string
    
    // Checking if the number is zero
    if (n == 0) {
      return "0"; // Returning "0" as the string representation if the number is zero
    } else if (n < 0) {
      is_negative = true; // Setting the flag to true if the number is negative
    }
    
    n = Math.abs(n); // Converting the number to its absolute value
    
    // Converting the integer to its string representation digit by digit
    while (n > 0) {
      tsb.append(n % 10); // Appending the least significant digit to the StringBuilder
      n /= 10; // Removing the least significant digit from the number
    }
    
    // Appending a negative sign if the original number was negative
    if (is_negative) {
      tsb.append("-");
    }
    
    // Reversing the StringBuilder and converting it to a string before returning
    return tsb.reverse().toString();
  }
  
  // The main method of the program
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Creating a Scanner object to read input from the user
    
    // Asking the user to input an integer
    System.out.print("Input an integer: ");
    int n = in.nextInt(); // Reading the integer input from the user
    
    // Displaying the string format of the input integer by calling the transformation method
    System.out.println("String format of the said integer: " + transform_int_to_string(n));
  }
} 
