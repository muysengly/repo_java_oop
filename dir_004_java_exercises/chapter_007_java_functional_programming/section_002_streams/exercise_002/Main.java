import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List < String > colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
    System.out.println("List of strings: " + colors);
    // Convert strings to uppercase using streams
    List < String > uppercaseStrings = colors.stream()
      .map(String::toUpperCase)
      .collect(Collectors.toList());

    System.out.println("\nUppercase Strings: " + uppercaseStrings);

    // Convert strings to lowercase using streams
    List < String > lowercaseStrings = colors.stream()
      .map(String::toLowerCase)
      .collect(Collectors.toList());

    System.out.println("Lowercase Strings: " + lowercaseStrings);
  }
}
