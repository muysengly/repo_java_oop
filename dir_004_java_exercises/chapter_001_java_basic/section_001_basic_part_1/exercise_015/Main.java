import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x, y, tmp;
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        x = in.nextInt();

        System.out.println("Input the 2nd number: ");
        y = in.nextInt();

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("Swapped values are: " + x + " and " + y);
    }
}
