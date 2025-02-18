public class FactorialCalculator { // Define a public class named FactorialCalculator

    public static int calculateFactorial(int n) { // Define a public static method to calculate factorial of an integer
                                                  // n
        // Base case: factorial of 0 is 1
        if (n == 0) { // Check if n is 0
            return 1; // Return 1 if n is 0
        }

        // Recursive case: multiply n with factorial of (n-1)
        return n * calculateFactorial(n - 1); // Recursively call calculateFactorial with (n-1) and multiply the result
                                              // with n
    }

    public static void main(String[] args) { // Main method to execute the program
        int number = 7; // Initialize an integer variable number with value 7
        int factorial = calculateFactorial(number); // Call calculateFactorial method with number and store the result
                                                    // in factorial
        System.out.println("Factorial of " + number + " is: " + factorial); // Print the factorial of number

        number = 12; // Reassign number with value 12
        factorial = calculateFactorial(number); // Call calculateFactorial method with new number and store the result
                                                // in factorial
        System.out.println("\nFactorial of " + number + " is: " + factorial); // Print the factorial of new number
    }
}
