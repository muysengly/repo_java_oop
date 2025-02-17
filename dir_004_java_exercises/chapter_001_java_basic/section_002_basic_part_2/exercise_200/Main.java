// Import Scanner class from java.util package for user input
import java.util.*;
// Main class for the solution
public class Main {
    // Main method to execute the solution
    public static void main(String[] args) {
        // Sample input string for testing duplicate letter removal
        String str = "zxywooxz";
        // Display the original string
        System.out.print("Original string: " + str);
        // Display the result after removing duplicate characters and arranging in lexicographical order
        System.out.print("\nAfter removing duplicate characters and arranging in lexicographical order: " + removeDuplicateLetters(str));
    }
    // Function to remove duplicate letters from the given string and arrange in lexicographical order
    public static String removeDuplicateLetters(String s) {
        // Array to track whether a letter is already in the result
        boolean[] inResult = new boolean[26];
        // Array to count the occurrences of each lowercase letter
        int[] count = new int[26];
        // Stack to store the characters
        Stack<Character> stack = new Stack<>();
        // Count the occurrences of each letter in the input string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        // Iterate through the characters in the input string
        for (char c : s.toCharArray()) {
            // Decrement the count of the current character in the occurrences array
            count[c - 'a']--;
            // If the character is already in the result, skip
            if (inResult[c - 'a']) continue;
            // Pop characters from the stack while conditions are met
            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                inResult[stack.pop() - 'a'] = false;
            }
            // Push the current character onto the stack
            stack.push(c);
            inResult[c - 'a'] = true;
        }
        // Sort the characters in the stack
        Collections.sort(stack);
        // Build the result string from the characters in the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }
} 
