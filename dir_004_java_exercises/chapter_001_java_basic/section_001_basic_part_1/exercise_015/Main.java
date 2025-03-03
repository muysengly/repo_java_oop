import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, tmp;

        a = 15;
        b = 27;

        System.out.println("Before swapping : x, y = " + a + ", " + b);

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("Swapped values are: " + a + " and " + b);
    }
}
