public class GCDCalculator {

  public static int calculateGCD(int num1, int num2) {
    // Base case: if the second number is 0, the GCD is the first number
    if (num2 == 0) {
      return num1;
    }

    // Recursive case: calculate the GCD by recursively calling the method with num2 as the new num1 and the remainder as num2
    int remainder = num1 % num2;
    return calculateGCD(num2, remainder);
  }

  public static void main(String[] args) {
    int number1 = 16;
    int number2 = 18;
    int gcd = calculateGCD(number1, number2);
    System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
  }
}
