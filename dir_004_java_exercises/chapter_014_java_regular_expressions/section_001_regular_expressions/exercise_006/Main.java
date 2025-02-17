import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java Exercises."));
        System.out.println(validate("Do humans eat gizzards?"));
        System.out.println(validate("gizzards?"));
    }

    public static String validate(String text) {
        Pattern pattern = Pattern.compile("\\w*g.\\w*");
        Matcher m = pattern.matcher(text);

        if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
    }
}
