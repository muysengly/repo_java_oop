import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        int n, a = 1, b = 0, c;
        System.out.println("First 20 Pell numbers: ");
        for (n = 1; n <= 20; n++) {
            c = a + 2 * b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
