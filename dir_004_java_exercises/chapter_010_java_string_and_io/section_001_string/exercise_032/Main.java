
// Import the necessary Java utilities.
import java.util.*;

// Define a public class named Main.
public class Main {

  // Define a method to print the substring given start and end indices.
  static void printSubStr(String str1, int l, int h) {
    System.out.println(str1.substring(l, h + 1));
  }

  // Define a method to find the longest palindromic substring.
  static int longPalSubstr(String str1) {
    int n = str1.length();
    boolean table[][] = new boolean[n][n];
    int mLength = 1;

    // Fill the diagonal elements as true.
    for (int i = 0; i < n; ++i)
      table[i][i] = true;

    int strt = 0;

    // Check for palindromes of length 2.
    for (int i = 0; i < n - 1; ++i) {
      if (str1.charAt(i) == str1.charAt(i + 1)) {
        table[i][i + 1] = true;
        strt = i;
        mLength = 2;
      }
    }

    // Check for palindromes of length greater than 2.
    for (int k = 3; k <= n; ++k) {
      for (int i = 0; i < n - k + 1; ++i) {
        int j = i + k - 1;
        if (table[i + 1][j - 1] && str1.charAt(i) == str1.charAt(j)) {
          table[i][j] = true;

          if (k > mLength) {
            strt = i;
            mLength = k;
          }
        }
      }
    }

    // Print the longest palindromic substring.
    System.out.print("The longest palindrome substring in the given string is: ");
    printSubStr(str1, strt, strt + mLength - 1);
    return mLength;
  }

  // The main method to execute the code.
  public static void main(String[] args) {
    // Define the input string.
    String str1 = "thequickbrownfoxxofnworbquickthe";

    // Print the given string.
    System.out.println("The given string is: " + str1);

    // Find and print the length of the longest palindromic substring.
    System.out.println("The length of the palindromic substring is: " + longPalSubstr(str1));
  }
}
