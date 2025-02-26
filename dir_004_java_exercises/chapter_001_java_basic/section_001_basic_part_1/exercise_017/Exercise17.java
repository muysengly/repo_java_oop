import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {

        long binary1, binary2;

        int i = 0, remainder = 0;

        int[] result = new int[20];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");

        binary1 = scanner.nextLong();

        System.out.print("Input second binary number: ");
        binary2 = scanner.nextLong();

        System.out.println(binary1);
        System.out.println(binary2);

        while (binary1 != 0 || binary2 != 0) {

            result[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);

            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0) {
            result[i++] = remainder;
        }

        --i;

        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(result[i--]);
        }

        scanner.close();
    }
}
