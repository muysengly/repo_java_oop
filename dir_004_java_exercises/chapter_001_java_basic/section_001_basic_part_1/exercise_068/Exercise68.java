import java.lang.*;

public class Exercise68 {
    public static void main(String[] args) {
        // Define the main string
        String main_string = "Python 3.0";

        // Extract the last three characters from the main string
        String last_three_chars = main_string.substring(main_string.length() - 3);

        // Repeat the last three characters four times and print the result
        System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
    }
}
