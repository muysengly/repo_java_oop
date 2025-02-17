import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer number: ");
        int x = in.nextInt();
        System.out.print("Input the second integer number: ");
        int y = in.nextInt();
        System.out.print("The result is: " + calculate(x, y));
        System.out.printf("\n");
    }

    public static boolean calculate(int p, int q) {
        if (p == 15 || q == 15)
            return true;
        return ((p + q) == 15 || Math.abs(p - q) == 15);
    }
}
