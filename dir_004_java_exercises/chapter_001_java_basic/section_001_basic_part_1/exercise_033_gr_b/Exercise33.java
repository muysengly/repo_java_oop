import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        long n = 25;
        System.out.println("The number is: " + n);

        System.out.println("The sum of the digits is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
