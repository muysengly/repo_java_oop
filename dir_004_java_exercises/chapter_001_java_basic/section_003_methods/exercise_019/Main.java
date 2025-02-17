import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("Check whether the three said numbers has a midpoint!\n");
        System.out.print(test(x, y, z));
    }

    public static boolean test(int x, int y, int z) {
        boolean midpoint_x = (y + z == 2 * x);
        boolean midpoint_y = (x + z == 2 * y);
        boolean midpoint_z = (x + y == 2 * z);
        return midpoint_x || midpoint_y || midpoint_z;
    }
}
