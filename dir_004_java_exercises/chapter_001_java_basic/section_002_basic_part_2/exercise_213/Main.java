import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    // Creating a Scanner object for user input
    Scanner sc = new Scanner(System.in);

    // Method to execute the main functionality
    public void run() {
        // Prompting the user to input three integers (sides of a triangle)
        System.out.println("Input three integers(sides of a triangle)");

        // Reading three integers and storing them in an array
        int[] int_num = new int[]{
            sc.nextInt(), sc.nextInt(), sc.nextInt()
        };

        // Sorting the array of integers in ascending order
        Arrays.sort(int_num);

        // Checking if the given sides form a right triangle
        System.out.println("If the given sides form a right triangle?");
        ln((int_num[2] * int_num[2] == int_num[0] * int_num[0] + int_num[1] * int_num[1]) ? "Yes" : "No");
    }

    // Main method to create an instance of the class and run the program
    public static void main(String[] args) {
        new Main().run();
    }

    // Method for printing without a newline
    public static void pr(Object o) {
        System.out.print(o);
    }

    // Method for printing with a newline
    public static void ln(Object o) {
        System.out.println(o);
    }

    // Method for printing an empty line
    public static void ln() {
        System.out.println();
    }
} 
