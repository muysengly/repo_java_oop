import java.lang.*;

public class Exercise70 {
    public static void main(String[] args) {
        // Define two strings
        String str1 = "Python";
        String str2 = "Tutorial";

        // Check the lengths of the strings
        if (str1.length() >= str2.length()) {
            // Concatenate the strings in the order: str2 + str1 + str2
            System.out.println(str2 + str1 + str2);
        } else {
            // Concatenate the strings in the order: str1 + str2 + str1
            System.out.println(str1 + str2 + str1);
        }
    }
}
