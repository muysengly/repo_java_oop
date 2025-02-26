import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        double x = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();

        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            sum += sc.nextInt();
            x += 1;
        }

        double avgn = (sum / n);

        System.out.println("Average: " + avgn);
    }
}
