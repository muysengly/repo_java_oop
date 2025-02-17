// Define a class named Main.
public class Main {
  // The main method where the program execution starts.
  public static void main(String[] args) {
    // Declare a two-dimensional integer array 'a' with dimensions 10x10.
    int[][] a = new int[10][10];

    // Use nested loops to iterate over each row and column of the array.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        // Print each element of the array, ensuring a minimum width of 2 characters.
        System.out.printf("%2d ", a[i][j]);
      }
      // Move to the next line to represent a new row in the output.
      System.out.println();
    }
  }
}
