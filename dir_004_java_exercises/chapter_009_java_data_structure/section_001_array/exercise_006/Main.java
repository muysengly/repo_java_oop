import java.util.OptionalInt;

// Define a class named Main.
public class Main {
    // Define a method 'findIndex' that searches for an integer 't' in an integer
    // array 'my_array'.
    public static OptionalInt findIndex(int[] my_array, int t) {
        // Check if the array is null and return an empty OptionalInt if it is.
        if (my_array == null)
            return OptionalInt.empty();
        // Get the length of the array.
        int len = my_array.length;
        int i = 0;
        // Iterate through the elements in the array.
        while (i < len) {
            // Check if the current element is equal to 't' and return its index as an
            // OptionalInt if found.
            if (my_array[i] == t)
                return OptionalInt.of(i);
            else
                i = i + 1;
        }
        // If 't' is not found in the array, return an empty OptionalInt.
        return OptionalInt.empty();
    }

    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare an integer array 'my_array' and initialize it with values.
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        // Find and print the index position of value 25 in the array.
        findIndex(my_array, 25).ifPresent(index -> System.out.println("Index position of 25 is: " + index));
        // Find and print the index position of value 877 in the array.
        findIndex(my_array, 877).ifPresent(index -> System.out.println("Index position of 877 is: " + index));
        // Find and print the index position of value 29 in the array.
        findIndex(my_array, 29).ifPresent(index -> System.out.println("Index position of 29 is: " + index));
    }
}
