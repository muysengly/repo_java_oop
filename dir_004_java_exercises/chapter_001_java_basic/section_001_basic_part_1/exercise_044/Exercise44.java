import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {
        int n;
        char s1, s2, s3;
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a number.
        System.out.print("Input number: ");
        n = in.nextInt();
        
        // Display the number in a specific pattern.
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    }
}
