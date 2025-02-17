// Import necessary classes from java.util package
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;
// Main class to demonstrate max sliding window
public class Main {
    // Main method to execute the sliding window algorithm
    public static void main(String[] args) {
        // Sample array and value of k for testing
        int[] main_array = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        // Display the original array and the value of k
        System.out.println("\nOriginal array: " + Arrays.toString(main_array));
        System.out.println("\nValue of k: " + k);
        System.out.println("\nResult: ");
        // Call the method to find maximums in the sliding window
        ArrayList result = max_slide_window(main_array, k);
        // Display the result
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    // Method to find maximums in a sliding window
    public static ArrayList max_slide_window(int[] main_array, int k) {
        // Initialize an ArrayList to store the result
        ArrayList rst_arra = new ArrayList();
        // Checking for invalid inputs
        if (main_array == null || main_array.length == 0 || k < 0) {
            return rst_arra;
        }
        // Using a Deque to store indexes of elements
        Deque<Integer> deque_num = new LinkedList<>();
        // Processing the first k elements separately
        for (int i = 0; i < k; i++) {
            // Removing smaller elements from the Deque
            while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
                deque_num.pollLast();
            }
            deque_num.offerLast(i); // Adding the current index to the Deque
        }
        // Processing the rest of the elements
        for (int i = k; i < main_array.length; i++) {
            rst_arra.add(main_array[deque_num.peekFirst()]); // Adding the maximum from the window to result
            // Removing elements that are out of the window range
            if (!deque_num.isEmpty() && deque_num.peekFirst() <= i - k) {
                deque_num.pollFirst();
            }
            // Removing smaller elements from the Deque
            while (!deque_num.isEmpty() && main_array[deque_num.peekLast()] <= main_array[i]) {
                deque_num.pollLast();
            }
            deque_num.offerLast(i); // Adding the current index to the Deque
        }
        rst_arra.add(main_array[deque_num.peekFirst()]); // Adding the maximum of the last window
        return rst_arra; // Returning the result ArrayList containing maximums
    }
}
