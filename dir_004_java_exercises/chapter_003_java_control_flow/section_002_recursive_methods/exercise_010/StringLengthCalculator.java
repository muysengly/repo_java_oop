public class StringLengthCalculator {

  public static int calculateStringLength(String str) {
    // Base case: if the string is empty, the length is 0
    if (str.isEmpty()) {
      return 0;
    }

    // Recursive case: remove the first character of the 
    // string and recursively call the method
    // with the remaining substring, and add 1 to the length
    return 1 + calculateStringLength(str.substring(1));
  }

  public static void main(String[] args) {
    String input = "Java Exercises!";
    int length = calculateStringLength(input);
    System.out.println("The length of the string \"" + input + "\" is: " + length);
  }
}
