import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int x = in.nextInt();
        System.out.printf("The absolute value of %d is: %d", x, convert(x));
        System.out.printf("\n");
    }

    public static int convert(int n) {
        int absvalue = (n <= 0) ? n : -n;
        return absvalue;
    }
}
