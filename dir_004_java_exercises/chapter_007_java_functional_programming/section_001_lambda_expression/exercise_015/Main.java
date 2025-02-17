import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Create a list of integers
    List < Integer > nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("Original list elements: " + nums);
    // Calculate the sum of squares of odd numbers using lambda expression
    int sum_squares_odd = nums.stream()
      .filter(n -> n % 2 != 0)
      .mapToInt(n -> n * n)
      .sum();

    // Calculate the sum of squares of even numbers using lambda expression
    int sum_squares_even = nums.stream()
      .filter(n -> n % 2 == 0)
      .mapToInt(n -> n * n)
      .sum();

    // Print the results
    System.out.println("\nSum of squares of odd numbers: " + sum_squares_odd);
    System.out.println("\nSum of squares of even numbers: " + sum_squares_even);
  }
}
