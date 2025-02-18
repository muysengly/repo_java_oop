// Define the MathUtility class
public class MathUtility {
    // Static method add that takes two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // Main method to demonstrate the usage of the static method
    public static void main(String[] args) {
        // Call the static method add without creating an instance of MathUtility
        int sum = MathUtility.add(10, 9);
        // Print the result
        System.out.println("The sum of 10 and 9 is: " + sum);
    }
}
