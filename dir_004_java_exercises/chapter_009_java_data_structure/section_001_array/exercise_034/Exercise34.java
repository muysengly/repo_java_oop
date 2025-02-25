// Import the HashSet class from the java.util package.
import java.util.HashSet;

// Define a class named Exercise34.
public class Exercise34 {    
    // The main method for executing the program.
    public static void main(String[] args) {
        // Declare an array of integers.
        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};  

        // Print the original array length.
        System.out.println("Original array length: " + nums.length);

        // Print the elements of the array.
        System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // Calculate the new length of the array using the longest_sequence method and print it.
        System.out.println("\nThe new length of the array is: " + longest_sequence(nums));   
    }
    
    // Define a method named longest_sequence that takes an array of integers as input.
    public static int longest_sequence(int[] nums) {
        // Create a HashSet to store unique values from the input array.
        final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) {
            h_set.add(i);
        }

        // Initialize a variable to store the length of the longest sequence.
        int longest_sequence_len = 0;

        // Iterate through the elements of the input array.
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            // Update the longest sequence length if a longer sequence is found.
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }

        // Return the length of the longest sequence.
        return longest_sequence_len;
    }
}
</integer></integer>