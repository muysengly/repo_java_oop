import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(12, 15, 0, 8, 7, 9, -6);
        System.out.println("Original values of the said array: "+nums); 
        // Find the maximum value using lambda expression
        Optional<Integer> max = nums.stream()
                .max((x, y) -> x.compareTo(y));

        // Find the minimum value using lambda expression
        Optional<Integer> min = nums.stream()
                .min((x, y) -> x.compareTo(y));

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
