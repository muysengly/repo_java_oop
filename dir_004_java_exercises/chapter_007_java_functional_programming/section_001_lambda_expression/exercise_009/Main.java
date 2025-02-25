import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Define the prime check lambda expression
        Predicate<Integer> is_Prime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        // Check if a number is prime using the lambda expression
        int n = 17;
        boolean isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        System.out.println(n + " is prime? " + isPrimeResult);
        // Check if a number is prime using the lambda expression
        n = 15;
        isPrimeResult = is_Prime.test(n);
        // Print the prime check result
        System.out.println("\n" + n + " is prime? " + isPrimeResult);
    }
}
