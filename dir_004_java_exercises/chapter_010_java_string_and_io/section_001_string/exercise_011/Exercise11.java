// Define a public class named Exercise11.
public class Exercise11 {
    // Define the main method.
    public static void main(String[] args) {
        // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containing the contents of arr_num
        // starting at index 1 for length 3.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str + " pages.\n");
    }
}
