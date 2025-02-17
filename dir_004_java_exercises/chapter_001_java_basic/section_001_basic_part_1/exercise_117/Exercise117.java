import java.util.*;

public class Exercise117 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");
        int n = in.nextInt(); 

        // Print a message indicating the calculation about to take place
        System.out.printf("Square root of %d is: ", n);

        // Call the sqrt method to calculate the square root and print the result
        System.out.println(sqrt(n)); 
    }

    // Method to calculate the square root of a number
    private static int sqrt(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int a = 0;
        int b = num;

        // Perform a binary search to find the square root
        while (a <= b) {
            int mid = (a + b) >> 1;
            if (num / mid < mid) {
                b = mid - 1;
            } else {
                if (num / (mid + 1) <= mid) {
                    return mid;
                }
                a = mid + 1;
            }
        }
        return a;
    }
}
