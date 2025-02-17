public class Main {
  public static void main(String[] args) {
    String text = "C++";
    System.out.println("Original string: " + text);
    System.out.println("Add a dash before and after every vowel in the said string: " + validate(text));
    text = "Java";
    System.out.println("\nOriginal string: " + text);
    System.out.println("Add a dash before and after every vowel in the said string: " + validate(text));
    text = "MID-CENTRALIZED";
    System.out.println("\nOriginal string: " + text);
    System.out.println("Add a dash before and after every vowel in the said string: " + validate(text));
    text = "LOWERED";
    System.out.println("\nOriginal string: " + text);
    System.out.println("Add a dash before and after every vowel in the said string: " + validate(text));
  }

  public static String validate(String text) {
    return text.replaceAll("(?i)([AEIOU])", "-$1-");
  }
}
