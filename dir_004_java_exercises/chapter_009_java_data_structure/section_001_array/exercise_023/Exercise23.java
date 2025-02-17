// Define a class named Exercise23.
public class Exercise23 {
    // Create a static method named equality_checking_two_arrays that takes two integer arrays.
    static void equality_checking_two_arrays(int[] my_array1, int[] my_array2) {
        // Initialize a boolean variable to indicate whether the arrays are equal.
        boolean equalOrNot = true;

        // Check if the lengths of the two arrays are equal.
        if (my_array1.length == my_array2.length) {
            // Iterate through elements of both arrays.
            for (int i = 0; i < my_array1.length; i++) {
                // Check if the elements at the same position in both arrays are not equal.
                if (my_array1[i] != my_array2[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            // If the lengths are not equal, set equalOrNot to false.
            equalOrNot = false;
        }

        // Check the value of equalOrNot and print whether the arrays are equal or not.
        if (equalOrNot) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two arrays are not equal.");
        }
    }

    // The main method for executing the program.
    public static void main(String[] args) {
        // Define three integer arrays for comparison.
        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 8, 11};
        int[] array3 = {2, 5, 7, 9, 11};

        // Call the equality_checking_two_arrays method to compare array1 and array2.
        equality_checking_two_arrays(array1, array2);

        // Call the equality_checking_two_arrays method to compare array1 and array3.
        equality_checking_two_arrays(array1, array3);
    }
}
