import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<string> colors = Arrays.asList("red", "green", "blue", "black", "pink");

        // Print the Original list of strings
        System.out.println("Original strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }

        // Sort the list of strings in alphabetical order using lambda expression
        colors.sort((str1, str2) -> str1.compareToIgnoreCase(str2));

        // Print the sorted list of strings
        System.out.println("\nSorted strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }
    }
}
</string>