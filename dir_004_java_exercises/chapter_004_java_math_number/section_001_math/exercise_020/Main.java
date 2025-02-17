import java.util.*;

public class Main {

    private static int[] generatePrimes(int num) {
        boolean[] temp = new boolean[num + 1];
        for (int i = 2; i * i <= num; i++) {
            if (!temp[i]) {
                for (int j = i; i * j <= num; j++) {
                    temp[i * j] = true;
                }
            }
        }
        int prime_nums = 0;
        for (int i = 2; i <= num; i++) {
            if (!temp[i])
                prime_nums++;
        }
        int[] all_primes = new int[prime_nums];
        int index = 0;
        for (int i = 2; i <= num; i++) {
            if (!temp[i])
                all_primes[index++] = i;
        }
        return all_primes;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        if (n > 0) {
            int[] result = generatePrimes(n);
            System.out.println("Prime numbers <= " + n + ": " + Arrays.toString(result));
        }
    }
}
