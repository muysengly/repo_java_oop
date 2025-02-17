import java.lang.*;

public class Exercise73 {
    public static void main(String[] args) {
        // Define two input strings
        String str1 = "Python";
        String str2 = "";

        // Get the length of the second string
        int length2 = str2.length();

        // Initialize a result string
        String result = "";

        // Check the length of the first string and append the first character (if available) or '#'
        result += (str1.length() >= 1) ? str1.charAt(0) : '#';

        // Check the length of the second string and append the last character (if available) or '#'
        result += (length2 >= 1) ? str2.charAt(length2 - 1) : '#';

        // Print the resulting string
        System.out.println(result);
    }
}
