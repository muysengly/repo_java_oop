import java.util.LinkedHashMap;

public class Main {
  // Method to find the longest substring with non-repeating characters
  static void longestSubstring(String inputString) {
    // Convert the inputString to a character array
    char[] arr1 = inputString.toCharArray();
    // Initialize variables to store the longest substring and its length
    String longestSubstring = "";
    int maxLength = 0;
    // Create a LinkedHashMap to store characters and their positions
    LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
    // Loop through the character array
    for (int i = 0; i < arr1.length; i++) {
      char ch = arr1[i];
      // Check if the character is not already present in the charPosMap
      if (!charPosMap.containsKey(ch)) {
        // If not present, add the character and its position to the map
        charPosMap.put(ch, i);
      } else {
        // If the character is present, update the start position of the substring
        // to the position after the repeated character
        i = charPosMap.get(ch);
        // Clear the map to start anew for the next non-repeating substring
        charPosMap.clear();
      }
      // Check if the current substring length is greater than the stored length
      if (charPosMap.size() > maxLength) {
        // If yes, update the longest substring and its length
        maxLength = charPosMap.size();
        // Extract the substring from the inputString using start and end indices
        longestSubstring = inputString.substring(i - maxLength + 1, i + 1);
      }
    }
    // Print the original inputString, the longest substring found, and its length
    System.out.println("Input String: " + inputString);
    System.out.println("The longest substring: " + longestSubstring);
    System.out.println("The longest Substring Length: " + maxLength);
  }

  // Main method to execute the program
  public static void main(String[] args) {
    // Call the longestSubstring method with different input strings
    longestSubstring("pickoutthelongestsubstring");
    longestSubstring("ppppppppppppp");
    longestSubstring("Microsoft");
  }
}
