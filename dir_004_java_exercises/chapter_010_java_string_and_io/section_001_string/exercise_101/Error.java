// Define a class named Main
public class Main {
    
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Define two digit strings
        String digit_string1 = "131231231231231231231231231212312312";
        String digit_string2 = "13123123123Z1231231231231231212312312";

        // Display the first string
        System.out.println("First string:");
        System.out.println(digit_string1);
        // Check if the first string contains only digits
        boolean result1 = test_only_digits(digit_string1);
        System.out.println(result1);

        // Display the second string
        System.out.println("\nSecond string:");
        System.out.println(digit_string2);
        // Check if the second string contains only digits
        boolean result2 = test_only_digits(digit_string2);
        System.out.println(result2);
    }

    // Method to check if a string contains only digits
    public static boolean test_only_digits(String digit_string) {
        // Iterate through each character of the string
        for (int i = 0; i < digit_string.length(); i++) {
            // Check if the character is not a digit
            if (!Character.isDigit(digit_string.charAt(i))) {
                return false;
            }
        }
        // If all characters are digits, return true
        return true;
    }
}
