import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int n1 = n + 1;

        int power = 0;
        int ans = 0;
        for (int i = 0;; i++) {
            power = (int) Math.pow(2, i);
            if (power > n1) {
                break;
            } else if (power == n1) {
                System.out.println(n + " is a Mersenne number.");
                ans = 1;
            }
        }
        if (ans == 0) {
            System.out.println(n + " is not a Mersenne number.");
        }
    }
}
