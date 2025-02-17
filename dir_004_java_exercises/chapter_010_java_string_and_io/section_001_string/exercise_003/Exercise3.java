// Define a public class named Exercise3.
public class Exercise3 {
    // Define the main method.
    public static void main(String[] args) {

        // Declare and initialize a string variable "str" with the value
        // "w3resource.com".
        String str = "w3resource.com";
        // Print the original string.
        System.out.println("Original String : " + str);

        // Retrieve the Unicode code point before the character at index 1 in the
        // string.
        int val1 = str.codePointBefore(1);

        // Retrieve the Unicode code point before the character at index 9 in the
        // string.
        int val2 = str.codePointBefore(9);

        // Print the Unicode code point representing the character before index 1 in the
        // string.
        System.out.println("Character(unicode point) = " + val1);
        // Print the Unicode code point representing the character before index 9 in the
        // string.
        System.out.println("Character(unicode point) = " + val2);
    }
}
