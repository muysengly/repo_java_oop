// Import the necessary Java utility class for working with arrays.
import java.util.Arrays;

// Define the Main class.
public class Main {
	
    public static void main(String[] args)
    {
        // Create an array of integers.
        int nums[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        int result[];
        
        // Print the original array.
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));

        // Call the separate_odd_even method to separate odd and even numbers.
        result = separate_odd_even(nums);
 
        // Print the array after separation.
        System.out.print("Array after separation ");
        System.out.println(Arrays.toString(result));
    }
	
    // A method to separate odd and even numbers in an array.
    static int[] separate_odd_even(int arr[])
    {
        // Initialize left and right pointers.
        int left_side = 0, right_side = arr.length - 1;
        
        // Continue until the left pointer is less than the right pointer.
        while (left_side < right_side)
        {
            // Move the left pointer to the right until it points to an odd number.
            while (arr[left_side] % 2 == 0 && left_side < right_side)
                left_side++;
 
            // Move the right pointer to the left until it points to an even number.
            while (arr[right_side] % 2 == 1 && left_side < right_side)
                right_side--;
 
            // If the left pointer is still less than the right pointer, swap the elements.
            if (left_side < right_side)
            {
                int temp = arr[left_side];
                arr[left_side] = arr[right_side];
                arr[right_side] = temp;
                left_side++;
                right_side--;
            }
        }
        
        // Return the modified array.
        return arr;
    }
}
