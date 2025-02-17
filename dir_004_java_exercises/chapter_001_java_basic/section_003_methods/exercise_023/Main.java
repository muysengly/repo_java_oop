import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a string: ");
    String str = sc.nextLine();
    System.out.print("Check all the characters of the said string are vowels or not!\n");
    System.out.print(test(str));
  }

  public static boolean test(String input) {
    String str_vowels = "aeiou";
    String phrase = input.toLowerCase();
    for (int i = 0; i < phrase.length(); i++) {
      if (str_vowels.indexOf(phrase.charAt(i)) == -1)
        return false;
    }
    return true;
  }
}
