import java.util.*;

public class Exercise53 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input the first number
        System.out.print("Input the first number: ");
        int x = in.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = in.nextInt();

        // Prompt the user to input the third number
        System.out.print("Input the third number: ");
        int z = in.nextInt();

        // Prompt the user to input a boolean value (true or false)
        System.out.print("Input a boolean value (true/false): ");
        boolean xyz = in.nextBoolean();

        // Calculate the result using the test function and display it
        System.out.print("The result is: " + test(x, y, z, xyz));

        // Print a new line for better formatting
        System.out.print("\n");
    }
    
    // Function to test conditions based on boolean input
    public static boolean test(int p, int q, int r, boolean xyz) {
        if (xyz)
            return (r > q);
        return (q > p && r > q);
    }
}
