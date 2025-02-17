import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of doubles
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
		// Print the list elements
        System.out.println("Original values: " + nums);

        // Calculate the average of the list using lambda expression
        double average = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        // Print the average
        System.out.println("\nAverage of the original values: " + average);
    }
}
