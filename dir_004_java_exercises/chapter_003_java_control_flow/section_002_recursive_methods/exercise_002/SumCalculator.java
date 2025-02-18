public class SumCalculator { // Define a public class named SumCalculator

    public static int calculateSum(int n) { // Define a public static method to calculate the sum of integers from 1 to
                                            // n
        // Base case: sum of 0 is 0
        if (n == 0) { // Check if n is 0
            return 0; // Return 0 if n is 0
        }

        // Recursive case: add n with the sum of (n-1)
        return n + calculateSum(n - 1); // Recursively call calculateSum with (n-1) and add the result to n
    }

    public static void main(String[] args) { // Main method to execute the program
        int number = 7; // Initialize an integer variable number with value 7
        int sum = calculateSum(number); // Call calculateSum method with number and store the result in sum
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum); // Print the sum of numbers from 1 to
                                                                                  // number
    }
}
