import java.util.*;

public class Exercise62 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input the first number
        System.out.print("Input the first number : ");
        int x = in.nextInt();  // Read and store the first number
        
        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        int y = in.nextInt();  // Read and store the second number
        
        // Prompt the user to input the third number
        System.out.print("Input the third number : ");
        int z = in.nextInt();  // Read and store the third number
        
        // Calculate and print the result of the condition
        // The condition checks if the absolute difference between the numbers is greater than or equal to 20
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}
