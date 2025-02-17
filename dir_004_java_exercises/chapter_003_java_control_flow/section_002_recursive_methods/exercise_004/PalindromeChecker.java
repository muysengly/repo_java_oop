public class PalindromeChecker {

  public static boolean isPalindrome(String str) {
    // Base case: an empty string or a string with one character is a palindrome
    if (str.length() <= 1) {
      return true;
    }

    // Recursive case: check if the first and last characters are equal,
    // and recursively check if the substring between them is a palindrome
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length() - 1);

    if (firstChar != lastChar) {
      return false;
    }

    String remainingSubstring = str.substring(1, str.length() - 1);
    return isPalindrome(remainingSubstring);
  }

  public static void main(String[] args) {
    String palindrome1 = "madam";
    boolean isPalindrome1 = isPalindrome(palindrome1);
    System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);

    String palindrome2 = "level";
    boolean isPalindrome2 = isPalindrome(palindrome2);
    System.out.println(palindrome2 + " is a palindrome: " + isPalindrome2);

    String notPalindrome = "java";
    boolean isPalindrome3 = isPalindrome(notPalindrome);
    System.out.println(notPalindrome + " is a palindrome: " + isPalindrome3);
  }
}
