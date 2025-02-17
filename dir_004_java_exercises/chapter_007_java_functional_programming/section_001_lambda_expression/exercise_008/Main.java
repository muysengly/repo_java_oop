import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Define the factorial lambda expression
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // Calculate the factorial of a number using the lambda expression
        long n = 7;
        long factorial_result = factorial.applyAsLong(n);

        // Print the factorial result
        System.out.println("Factorial of " + n + " is: " + factorial_result);
    }
}
