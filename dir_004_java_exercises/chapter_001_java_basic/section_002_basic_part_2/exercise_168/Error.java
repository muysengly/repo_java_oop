// Importing the required Java utilities package
import java.util.*;

// Defining a class named Solution
public class Solution {
  
  // Method to multiply two integers without using the multiplication operator
  public static int multiply(int n1, int n2) {
    int result = 0; // Initializing the variable to store the result of multiplication
    boolean negative_num = (n1 < 0 && n2 >= 0) || (n2 < 0 && n1 >= 0); // Checking if the result will be negative
    boolean positive_num = !negative_num; // Determining if the result will be positive
    
    n1 = Math.abs(n1); // Converting n1 to its absolute value to simplify multiplication
    
    // Loop to perform multiplication without using the * operator
    for (int i = 0; i < n1; i++) {
      // Handling the addition or subtraction based on the signs of the numbers
      if (negative_num && n2 > 0 || positive_num && n2 < 0)
        result -= n2; // Subtracting n2 from the result
      else
        result += n2; // Adding n2 to the result
    }

    return result; // Returning the final result of multiplication
 }

  // The main method of the program
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); // Creating a Scanner object to read input from the user
    
    // Asking the user to input the first number
    System.out.print("Input the first number: ");
    int n1 = in.nextInt(); // Reading the first integer input from the user
    
    // Asking the user to input the second number
    System.out.print("Input the second number: ");
    int n2 = in.nextInt(); // Reading the second integer input from the user
    
    // Displaying the result of the multiplication by calling the multiply method
    System.out.println("\nResult: " + multiply(n1, n2));
  }
} 
