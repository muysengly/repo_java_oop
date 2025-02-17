
// Import necessary Java classes.
import java.util.Arrays;

// Define a class named 'solution'.
public class Solution {
  // A method to merge two sorted arrays.
  public static void merge_sorted_arrays(int[] A, int p, int[] B, int q) {
    // Loop through the first array.
    for (int i = 0; i < p; i++) {
      if (A[i] > B[0]) {
        // Swap elements if the current element in A is greater than the first element
        // in B.
        int temp = A[i];
        A[i] = B[0];
        B[0] = temp;

        // Store the first element from B.
        int first_arr = B[0];
        int k;

        // Move elements in B to the right to insert first_arr in the correct position.
        for (k = 1; k < q && B[k] < first_arr; k++) {
          B[k - 1] = B[k];
        }

        // Insert first_arr in the correct position in B.
        B[k - 1] = first_arr;
      }
    }
  }

  public static void main(String[] args) {
    int[] A = { 1, 5, 6, 7, 8, 10 };
    int[] B = { 2, 4, 9 };
    int p = A.length;
    int q = B.length;

    // Print the original arrays.
    System.out.println("Original Arrays:");
    System.out.println("A: " + Arrays.toString(A));
    System.out.println("B: " + Arrays.toString(B));

    // Merge the sorted arrays A and B.
    merge_sorted_arrays(A, p, B, q);

    // Print the sorted arrays A and B after merging.
    System.out.println("\nSorted Arrays:");
    System.out.println("A: " + Arrays.toString(A));
    System.out.println("B: " + Arrays.toString(B));
  }
}
