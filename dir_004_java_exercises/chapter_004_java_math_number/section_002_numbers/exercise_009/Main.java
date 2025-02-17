import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("First 10 Happy numbers:");
        for (long num = 1, count = 0; count < 8; num++) {
            if (happy_num(num)) {
                System.out.println(num);
                count++;
            }
        }
    }

    public static boolean happy_num(long num) {
        long m = 0;
        int digit = 0;
        HashSet<Long> cycle = new HashSet<Long>();
        while (num != 1 && cycle.add(num)) {
            m = 0;
            while (num > 0) {
                digit = (int) (num % 10);
                m += digit * digit;
                num /= 10;
            }
            num = m;
        }
        return num == 1;
    }
}
