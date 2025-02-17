import java.nio.charset.Charset;

public class Exercise40 {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        
        // Iterate through the available character sets and print their names
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}
