// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        // Print the original strings
        System.out.println("\nOriginal strings:");
        for (String str : stringList) {
            System.out.println(str);
        } 

        // Convert strings to lowercase using lambda expression
        stringList.replaceAll(str -> str.toLowerCase());

        // Print the list of lowercase strings
        System.out.println("\nLowercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
		
		// Convert strings to uppercase using lambda expression
        stringList.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
</String>