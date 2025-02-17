import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args) {
    String text = "Add a dash before and after every vowel in the said string:";
    System.out.println("Original string: " + text);
    System.out.println("Reverse the words of length higher than 3 in the said string:\n" + validate(text));
    text = "The quick brown fox jumps over the lazy dog.";
    System.out.println("\nOriginal string: " + text);
    System.out.println("Reverse the words of length higher than 3 in the said string:\n" + validate(text));
  }

  public static String validate(String text) {
    String[] words = text.split(" ");
    StringBuilder result_str = new StringBuilder();
    for (String word : words) {
      if (word.length() >= 4) {
        result_str.append(new StringBuilder(word).reverse());
      } else {
        result_str.append(word);
      }
      result_str.append(" ");
    }
    return result_str.toString().trim();
  }
}
