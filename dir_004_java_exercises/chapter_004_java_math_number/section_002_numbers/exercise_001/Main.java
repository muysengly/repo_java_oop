import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.print("Input a correct number.");
        }
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x == 0)
            System.out.print("It is an ugly number.");
        System.out.print("\n");
    }
}
