import java.util.*;

public class Main {
    public static boolean is_Amstrong(int n) {
        int remainder, sum = 0, temp = 0;
        temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum = sum + (remainder * remainder * remainder);
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        System.out.println("Is Armstrong number? " + is_Amstrong(number));
    }
}
