// Import the necessary Java utilities package.
import java.util.Arrays;
 
// Define a class named Exercise16.
public class Exercise16 {
   // Define a method to find and print unique elements in an array.
   static void unique_array(int[] my_array) {
        System.out.println("Original Array : ");
         
        // Iterate through the original array and print its contents.
        for (int i = 0; i < my_array.length; i++) {
            System.out.print(my_array[i] + "\t");
        }
         
        // Assuming all elements in the input array are unique.
        int no_unique_elements = my_array.length;
         
        // Comparing each element with all other elements to find duplicates.
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i + 1; j < no_unique_elements; j++) {
                // If any two elements are found equal (a duplicate is found).
                if (my_array[i] == my_array[j]) {
                    // Replace the duplicate element with the last unique element.
                    my_array[j] = my_array[no_unique_elements - 1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
         
        // Copying only unique elements of my_array into array1.
        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);
         
        // Printing the array with unique values.
        System.out.println();
        System.out.println("Array with unique values : ");
         
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
         
        System.out.println();
        System.out.println("---------------------------");
    }
     
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Call the unique_array method with two different sets of input arrays.
        unique_array(new int[] {0, 3, -2, 4, 3, 2});
        unique_array(new int[] {10, 22, 10, 20, 11, 22});
    }
}
