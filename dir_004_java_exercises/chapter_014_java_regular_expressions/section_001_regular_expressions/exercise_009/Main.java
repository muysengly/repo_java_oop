import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(validate("5-2345861"));
        System.out.println(validate("6-2345861"));
        System.out.println(validate("6-5555861"));
    }

    public static String validate(String text) {
        Pattern pattern = Pattern.compile("^5.*$");
        Matcher m = pattern.matcher(text);

        if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
    }
}
