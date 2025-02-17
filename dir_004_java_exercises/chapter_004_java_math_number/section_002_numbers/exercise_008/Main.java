import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        int[] t = new int[num + 2];
        t[1] = 1;
        System.out.printf("\nList 10 Catalan numbers:-\n");
        for (int i = 1; i <= num; i++) {

            for (int j = i; j > 1; j--)
                t[j] = t[j] + t[j - 1];

            t[i + 1] = t[i];

            for (int j = i + 1; j > 1; j--)
                t[j] = t[j] + t[j - 1];
            System.out.printf("\n%d ", t[i + 1] - t[i]);
        }
        System.out.printf("\n");
    }
}
