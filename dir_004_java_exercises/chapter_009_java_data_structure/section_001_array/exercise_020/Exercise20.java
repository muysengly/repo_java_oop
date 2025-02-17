
// Import the ArrayList and Arrays classes from the Java utility library.
import java.util.ArrayList;
import java.util.Arrays;

// Define a class named Exercise20.
public class Exercise20 {
  public static void main(String[] args) {
    // Create an array of strings.
    String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };

    // Create an ArrayList of strings and initialize it with the contents of the
    // array.
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));

    // Print the ArrayList to the console.
    System.out.println(list);
  }
}
// </string></string>