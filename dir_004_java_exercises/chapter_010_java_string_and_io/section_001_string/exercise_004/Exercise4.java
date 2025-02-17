// Define a public class named Exercise4.
public class Exercise4 {
    // Define the main method.
    public static void main(String[] args) {

        // Declare and initialize a string variable "str" with the value
        // "w3rsource.com".
        String str = "w3rsource.com";
        // Print the original string.
        System.out.println("Original String : " + str);

        // Count the number of Unicode code points from index 1 to index 10 in the
        // string.
        int ctr = str.codePointCount(1, 10);

        // Print the count of Unicode code points from index 1 to index 10 in the
        // string.
        System.out.println("Codepoint count = " + ctr);
    }
}
