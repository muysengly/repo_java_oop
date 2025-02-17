
// Importing the Scanner class from java.util package
import java.util.Scanner;

// Main class named "test"
public class test {

    // 2D array to represent the map
    public static boolean[][] map;

    // Array representing possible moves: down, right, up, left
    public static int[][] move = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    // Recursive method to perform depth-first search (DFS) on the map
    public static void fds(int i, int j) {
        // Marking the current cell as visited
        map[i][j] = false;

        // Checking neighbors in all four directions
        for (int k = 0; k < 4; k++) {
            int i2 = i + move[k][0];
            int j2 = j + move[k][1];

            // Recursively applying DFS to unvisited neighbors within the map boundaries
            if (0 <= i2 && i2 < 10 && 0 <= j2 && j2 < 10 && map[i2][j2]) {
                fds(i2, j2);
            }
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Prompting the user to input 10 rows of 10 numbers representing the map
        System.out.println(
                "Input 10 rows of 10 numbers representing green squares (island) as 1 and blue squares (sea) as zeros");

        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Initializing the map array
        map = new boolean[10][10];

        // Reading input to populate the map
        for (int i = 0; i < 10; i++) {
            char[] s = sc.next().toCharArray();
            for (int j = 0; j < 10; j++) {
                // Converting characters to boolean values (1 as true, 0 as false)
                map[i][j] = s[j] == '1';
            }
        }

        // Variable to store the number of islands
        int x = 0;

        // Iterating through each cell on the map
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // If the cell represents an island and is not visited, perform DFS
                if (map[i][j]) {
                    fds(i, j);
                    // Incrementing the island count
                    x++;
                }
            }
        }

        // Displaying the number of islands
        System.out.println("Number of islands:");
        System.out.println(x);
    }
}
