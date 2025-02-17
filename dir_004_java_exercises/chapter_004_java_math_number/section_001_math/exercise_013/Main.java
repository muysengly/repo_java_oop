import java.util.*;

public class Main {
    public static void main(String[] args) {

        int dec_num, rem, quot, i = 1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }
        String binary_str = "";
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            binary_str = binary_str + bin_num[j];
        }
        System.out.print(binary_str);
        i = binary_str.length() - 1;
        while (binary_str.charAt(i) == '0') {
            i--;
        }
        int length = 0;
        int ctr = 0;
        for (; i >= 0; i--) {
            if (binary_str.charAt(i) == '1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        length = Math.max(length, ctr);
        System.out.println("\nLength of the longest sequence: " + length);
    }
}
