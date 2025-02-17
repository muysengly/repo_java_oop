import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(4, 2, 3, 6, 5, 1);
        System.out.println("Original array elements: " + nums);
        // Define the multiply and sum lambda expression
        int result = nums.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();

        // Print the result
        System.out.println("\nProduct of the list elements: " + result);

        // Calculate the sum of the list elements using lambda expression
        int sum = nums.stream()
                .reduce(0, (x, y) -> x + y)
                .intValue();

        // Print the sum
        System.out.println("\nSum of the list elements: " + sum);
    }
}
