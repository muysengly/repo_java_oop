public class FactorialCalculator {

  public static int calculateFactorial(int n) {
    // Base case: factorial of 0 is 1
    if (n == 0) {
      return 1;
    }

    // Recursive case: multiply n with factorial of (n-1)
    return n * calculateFactorial(n - 1);
  }

  public static void main(String[] args) {
    int number = 7;
    int factorial = calculateFactorial(number);
    System.out.println("Factorial of " + number + " is: " + factorial);
    number = 12;
    factorial = calculateFactorial(number);
    System.out.println("\nFactorial of " + number + " is: " + factorial);
  }
}
