// Importing necessary Java utilities
import java.util.ArrayList;
import java.util.Arrays;

// Defining a class named Solution
public class Solution {
  
  // The main method of the program
  public static void main(String[] args) {
    // Initializing arrays for main and query data
    int[] main_arra = {1, 2, 3, 4, 5, 6, 7, 8};
    int[] query_arra = {1, 4, 8};
    
    // Getting the result by counting smaller numbers from the main array for query elements
    ArrayList<Integer> result = count_smaller_number(main_arra, query_arra);
    
    // Displaying the result
    for (int i = 0; i < result.size(); i++) {
      System.out.println(result.get(i));
    }
  }
  
  // Method to count smaller numbers in the main array for query elements
  public static ArrayList<Integer> count_smaller_number(int[] main_arra, int[] query_arra) {
    // Initializing an ArrayList to store the result
    ArrayList<Integer> result = new ArrayList<>();
    
    // Sorting the main array in ascending order
    Arrays.sort(main_arra);
    
    // Looping through the query array elements
    for (int i = 0; i < query_arra.length; i++) {
      // Adding the count of smaller numbers for each query element to the result ArrayList
      result.add(temp(main_arra, query_arra[i]));
    }
    
    return result; // Returning the result ArrayList
  }
  
  // Helper method to count smaller numbers in the main array
  private static int temp(int[] main_arra, int num) {
    int ctr = 0; // Counter to track the number of smaller elements
    
    // Looping through the main array
    for (int i = 0; i < main_arra.length; i++) {
      // Checking if the current element in the main array is smaller than the given number
      if (main_arra[i] < num) {
        ctr++; // Incrementing the counter for smaller numbers
      } else {
        break; // Exiting the loop if the current element is greater than or equal to the given number
      }
    }
    
    return ctr; // Returning the count of smaller numbers
  }
} 
