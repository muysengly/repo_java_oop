import java.util.*;

public class Main {
    public static boolean isLucky(int n) {
        // Create an array of size 10 to initialize all elements as
        // false to check if a digit is already seen or not.
        boolean temp[] = new boolean[10];
        for (int i = 0; i < 10; i++)
            temp[i] = false;
        while (n > 0) {
            // Find the last digit
            int digit = n % 10;
            // Return false if digit is already seen,
            if (temp[digit])
                return false;
            temp[digit] = true;
            n = n / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println("Is Lucky number? " + isLucky(number));
    }
}
