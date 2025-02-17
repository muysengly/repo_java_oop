import java.util.*;

public class Main {
    public static int power(int b, int e) {
        if (e == 0)
            return 1;

        int result = b;
        int temp = b;
        int i, j;

        for (i = 1; i < e; i++) {
            for (j = 1; j < b; j++) {
                result += temp;
            }
            temp = result;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the base: ");
        int b = scan.nextInt();
        System.out.print("Input the exponent: ");
        int e = scan.nextInt();
        scan.close();
        if (b > 0 && e > 0)
            System.out.println("Power of the number: " + power(b, e));
    }
}
