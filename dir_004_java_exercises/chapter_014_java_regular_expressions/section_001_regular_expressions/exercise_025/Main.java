public class Main {

  public static void main(String[] args) {
    String text = "Java";
    int n = 2;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    text = "JavaScript";
    n = 2;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    n = 3;
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    text = "SQLite";
    n = 2;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    text = "The quick brown fox jumps over the lazy dog.";
    n = 2;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    n = 3;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
    n = 15;
    System.out.println("Original String: " + text);
    System.out.println("Last " + n + " vowels of a given string: " + validate(text, n));
  }

  public static String validate(String text, int n) {
    String s = text.replaceAll("(?i)[^aeiou]", "");
    int l = s.length();
    return (n > s.length()) ? "Number of vowels mismatch!!!" : s.substring(s.length() - n);
  }
}
