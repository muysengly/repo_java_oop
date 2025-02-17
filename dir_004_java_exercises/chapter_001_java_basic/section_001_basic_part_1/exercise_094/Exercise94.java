import java.util.*;

public class Exercise94 {
    public static void main(String[] args) {
        // Define an array of integers
        int[] array_nums = { 1, 7, 8, 5, 7, 13, 0, 2, 4, 9 };

        // Initialize an index variable to track even numbers
        int i = 0;

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        // Find the first odd number's index (i)
        while (i < array_nums.length && array_nums[i] % 2 == 0)
            i++;

        // Rearrange the array such that odd numbers come after even numbers
        for (int j = i + 1; j < array_nums.length; j++) {
            if (array_nums[j] % 2 != 0) {
                // Swap even and odd numbers
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i++;
            }
        }

        // Display the modified array
        System.out.println("New Array: " + Arrays.toString(array_nums));
    }
}
