public class Exercise15 {
    public static void main(String[] args) {
        // Declare and initialize integer variables a and b
        int a, b;
        a = 15;
        b = 27;

        // Print the values before swapping
        System.out.println("Before swapping : a, b = " + a + ", " + b);

        // Perform the swap without using a temporary variable
        a = a + b; // Add a and b and store the result in a
        b = a - b; // Subtract the original b from the new a and store the result in b
        a = a - b; // Subtract the new b from the updated a and store the result in a

        // Print the values after swapping
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
