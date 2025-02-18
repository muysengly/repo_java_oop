// Define a class named Exercise33.
public class Exercise33 {
    // The main method for executing the program.
    public static void main(String[] args) {
        // Declare an array of integers.
        int nums[] = { 20, 20, 30, 40, 50, 50, 50 };

        // Print the original array length.
        System.out.println("Original array length: " + nums.length);

        // Print the elements of the array.
        System.out.print("Array elements are: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        // Calculate the new length of the array using the array_sort method and print
        // it.
        System.out.println("\nThe new length of the array is: " + array_sort(nums));
    }

    // Define a method named array_sort that takes an array of integers as input.
    public static int array_sort(int[] nums) {
        // Initialize an index variable to 1.
        int index = 1;

        // Iterate through the array, starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is different from the previous element.
            if (nums[i] != nums[index - 1])
                // If different, update the element at the current index.
                nums[index++] = nums[i];
        }
        // Return the new length of the array.
        return index;
    }
}
