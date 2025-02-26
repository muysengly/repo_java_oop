import java.util.Scanner;

public class Exercise19 {

    public static void main(String args[]) {

        int dec_num, tmp, i = 1, j;
        int bin_num[] = new int[100];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");

        dec_num = scanner.nextInt();

        tmp = dec_num;

        while (tmp != 0) {
            bin_num[i++] = tmp % 2;
            tmp = tmp / 2;
        }

        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
    }
}
