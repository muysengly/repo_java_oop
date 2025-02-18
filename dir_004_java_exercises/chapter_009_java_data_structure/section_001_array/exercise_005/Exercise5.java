// Define a class named Exercise5.
public class Exercise5 {
    // Define a method 'contains' that checks if an integer array 'arr' contains a
    // given 'item'.
    public static boolean contains(int[] arr, int item) {
        // Iterate through each element 'n' in the array 'arr'.
        for (int n : arr) {
            // Check if 'item' is equal to the current element 'n'.
            if (item == n) {
                // If a match is found, return 'true'.
                return true;
            }
        }
        // If no match is found, return 'false'.
        return false;
    }

    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare an integer array 'my_array1' and initialize it with values.
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

        // Check if the integer array 'my_array1' contains the item 2013 and print the
        // result.
        System.out.println(contains(my_array1, 2013));

        // Check if the integer array 'my_array1' contains the item 2015 and print the
        // result.
        System.out.println(contains(my_array1, 2015));
    }
}
