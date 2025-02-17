import java.util.function.Predicate;

public class Main {
  public static void main(String[] args) {
    // Define the perfect square check lambda expression
    Predicate < Integer > isPerfectSquare = n -> {
      int sqrt = (int) Math.sqrt(n);
      return sqrt * sqrt == n;
    };

    // Test the lambda expression with some numbers
    int N = 36;
    boolean result1 = isPerfectSquare.test(N);
    System.out.println(N + " is a perfect square? " + result1);

    N = 26;
    boolean result2 = isPerfectSquare.test(N);
    System.out.println(N + " is a perfect square? " + result2);

    N = 10000;
    boolean result3 = isPerfectSquare.test(N);
    System.out.println(N + " is a perfect square? " + result3);
  }
}
