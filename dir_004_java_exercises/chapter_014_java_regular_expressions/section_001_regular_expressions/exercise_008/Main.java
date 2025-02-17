import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java_Exercises_1"));
        System.out.println(validate("Java_Exercises_11.0"));
        System.out.println(validate("w3r"));
    }

    public static String validate(String text) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
        Matcher m = pattern.matcher(text);

        if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
    }
}
