
// Import the required classes from the java.util package.
import java.util.*;

// Define a class named Exercise35.
public class Exercise35 {
  // Define a method named two_sum_array_target that takes a List of integers and
  // an integer as input.
  public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
    // Create a HashMap to store the difference between the target value and array
    // elements.
    HashMap<Integer, Integer> my_map = new HashMap<Integer, Integer>();

    // Create an ArrayList to store the result indices.
    ArrayList<Integer> result = new ArrayList<Integer>();
    result.add(0); // Initialize the first index to 0.
    result.add(1); // Initialize the second index to 1.

    // Iterate through the elements of the input List.
    for (int i = 0; i < a.size(); i++) {
      if (my_map.containsKey(a.get(i))) {
        // If the current element's complement exists in the HashMap, update the result
        // indices and break the loop.
        int index = my_map.get(a.get(i));
        result.set(0, index);
        result.set(1, i);
        break;
      } else {
        // Otherwise, calculate the difference between the target value and the current
        // element and store it in the HashMap.
        my_map.put(b - a.get(i), i);
      }
    }

    // Return the result ArrayList containing the indices.
    return result;
  }

  // The main method for executing the program.
  public static void main(String[] args) {
    // Create an ArrayList of integers and add elements to it.
    ArrayList<Integer> my_array = new ArrayList<Integer>();
    my_array.add(1);
    my_array.add(2);
    my_array.add(4);
    my_array.add(5);
    my_array.add(6);
    int target = 6;

    // Call the two_sum_array_target method to find indices of elements that sum to
    // the target value.
    ArrayList<Integer> result = two_sum_array_target(my_array, target);

    // Print the indices found in the result.
    for (int i : result) {
      System.out.print("Index: " + i + " ");
    }
  }
}
