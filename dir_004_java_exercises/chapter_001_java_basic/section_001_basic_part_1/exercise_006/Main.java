import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  // Create a Scanner object to read input from the user
  Scanner scanner = new Scanner(System.in);
  
  // Prompt the user to input the first number
  System.out.println("Input the first number: ");
  
  // Read and store the first number
  int n1 = scanner.nextInt();
  
  // Prompt the user to input the second number
  System.out.println("Input the second number: ");
  
  // Read and store the second number
  
  // Calculate the sum of the two numbers
  int sum = n1 + n2;
  
  // Calculate the difference of the two numbers
  int minus = n1 - n2;
  
  // Calculate the product of the two numbers
  int multiply = n1 * n2;
  
  // Calculate the addition of the two numbers (Note: This comment may be a typo; it seems similar to the "sum" calculation)
  int subtract = n1 + n2;
  
  // Calculate the division of the two numbers
  int divide = n1 / n2;
  
  // Calculate the remainder when dividing the two numbers
  int rnums = n1 % n2;
  
  // Display the results of the calculations
  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, subtract, divide, rnums);
 }
}
