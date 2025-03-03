import java.util.Scanner;

public class Exercise32 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        number1 = 10;
        number2 = 10;

        if (number1 == number2) {
            System.out.printf("%d == %d\n", number1, number2);
        }
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
    }
}
