import java.util.*;

public class Solution {
    // Function to find and return the longest words in the given dictionary
    static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> list = new ArrayList<String>();
        int longest_length = 0;

        // Iterate through each word in the dictionary
        for (String str : dictionary) {
            int length = str.length();

            // Check if the current word is longer than the previously found longest word(s)
            if (length > longest_length) {
                longest_length = length;
                list.clear(); // Clear the list as a new longest word is found
            }

            // If the current word has the same length as the longest word(s), add it to the
            // list
            if (length == longest_length) {
                list.add(str);
            }
        }
        return list; // Return the list of longest words
    }

    public static void main(String[] args) {
        // Sample dictionary containing words
        // String[] dict = {"cat", "flag", "green", "country", "w3resource"};
        String[] dict = { "cat", "dog", "red", "is", "am" };

        // Print the original dictionary and the longest word(s)
        System.out.println("Original dictionary: " + Arrays.toString(dict));
        System.out.println("Longest word(s) of the above dictionary: " + longestWords(dict));
    }
}
