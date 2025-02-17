import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store the heights of eight buildings
        int[] t = new int[8];

        // Prompting the user to input the heights of eight buildings
        System.out.println("Input the heights of eight buildings:");
        for (int i = 0; i < 8; i++) {
            t[i] = sc.nextInt();
        }

        // Sorting the array of building heights in ascending order
        Arrays.sort(t);

        // Displaying the heights of the top three buildings in descending order
        System.out.println("\nHeights of the top three buildings:");
        for (int i = 7; i >= 5; i--) {
            System.out.println(t[i]);
        }
    }
} 
