import java.util.*;

public class Main {
    public static int multiply_two_nums(int a, int b) {

        /* 0 multiplied with anything gives 0 */
        if (b == 0)
            return 0;

        if (b > 0)
            return (a + multiply_two_nums(a, b - 1));

        if (b < 0)
            return -multiply_two_nums(a, -b);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Input second integer: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println("Multiply of two integers: " + multiply_two_nums(num1, num2));
    }
}
