// Outer class MathUtil
public class MathUtil {

  // Static nested class Calculator
  public static class Calculator {

    // Static method add that returns the sum of two integers
    public static int add(int a, int b) {
      return a + b;
    }
  }

  // Main method to demonstrate the usage of the static nested class and its
  // method
  public static void main(String[] args) {
    // Calling the static method add of the static nested class Calculator
    int sum = MathUtil.Calculator.add(12, 14);

    // Printing the result
    System.out.println("Sum: " + sum);
  }
}
