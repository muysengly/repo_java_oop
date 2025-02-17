import java.util.*;

public class Main {

    public static void main(String[] args) {

        String text = "Python is an interpreted high-level general-purpose programming language. " +
                "Its design philosophy emphasizes code readability with its use of significant indentation. " +
                "Its language constructs as well as its object-oriented approach aim to help programmers write" +
                "clear, logical code for small and large-scale projects.";
        System.out.println("Original string:");
        System.out.println(text);
        System.out.println("\nAfter replacing Python to Java and code to coding in the said string:");
        System.out.println(validate(text));
    }

    public static String validate(String text) {
        return String.format(text.replace("Python", "Java").replace("code", "coding"));
    }
}
