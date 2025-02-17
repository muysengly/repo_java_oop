// Define a public class named Exercise23.
public class Exercise23 {

  // Define the main method.
  public static void main(String[] args) {

    // Define two string variables.
    String str1 = "Shanghai Houston Colorado Alexandria";
    String str2 = "Alexandria Colorado Houston Shanghai";

    // Determine whether characters 0 through 7 in str1
    // match characters 28 through 35 in str2.
    boolean match1 = str1.regionMatches(0, str2, 28, 8);

    // Determine whether characters 9 through 15 in str1
    // match characters 9 through 15 in str2.
    boolean match2 = str1.regionMatches(9, str2, 9, 8);

    // Display the results of the regionMatches method calls.
    System.out.println("str1[0 - 7] == str2[28 - 35]? " + match1);
    System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
  }
}
