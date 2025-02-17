// Define a class named Main
public class Main {
    
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Define the initial string and character to remove
        String str1 = "abcdefabcdeabcdaaa";
        char g_char = 'a';
        
        // Remove the given character from the string
        String result = remove_Character(str1, g_char);
        
        // Print the original string
        System.out.println("\nOriginal string:");
        System.out.println(str1);
        
        // Print the modified string after removing the character
        System.out.println("\nSecond string:");
        System.out.println(result);
    }
    
    // Method to remove a specific character from a string
    public static String remove_Character(String str1, char g_char) {
        // Check for null or empty input string
        if (str1 == null || str1.isEmpty()) {
            return "";
        }
        
        // Use StringBuilder to efficiently manipulate strings
        StringBuilder sb = new StringBuilder();
        
        // Convert input string to a character array for iteration
        char[] chArray = str1.toCharArray();
        
        // Iterate through the characters in the array
        for (int i = 0; i < chArray.length; i++) {
            // Append characters other than the given character to the StringBuilder
            if (chArray[i] != g_char) {
                sb.append(chArray[i]);
            }
        }
        
        // Convert StringBuilder to String and return the modified string
        return sb.toString();
    }
}
