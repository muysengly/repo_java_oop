// Main.java
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Lambda expression to check if a given string is empty
        Predicate<string> isEmptyString = str -> str.isEmpty();

        // Test cases
        String str1 = ""; // empty string
        String str2 = "Java lambda expression!"; // non-empty string

        // Check if the strings are empty using the lambda expression
		System.out.println("String 1:" + str1);
        System.out.println("String 1 is empty: " + isEmptyString.test(str1));
        System.out.println("\nString 2:" + str2);
		System.out.println("String 2 is empty: " + isEmptyString.test(str2));
    }
}
</string>