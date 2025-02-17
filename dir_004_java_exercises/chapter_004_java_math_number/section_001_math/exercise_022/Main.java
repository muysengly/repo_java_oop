import java.util.*;

public class Main {

    public static int nextPalindromeGenerate(int n) {
        int ans = 1, digit, rev_num = 0, num;
        // For single digit number, next smallest palindrome is n+1
        if (n < 10) {
            ans = 0;
            return n + 1;
        }

        num = n;
        while (ans != 0) {
            rev_num = 0;
            digit = 0;
            n = ++num;

            while (n > 0) // rev_numersing the number
            {
                digit = n % 10;
                rev_num = rev_num * 10 + digit;
                n = n / 10;
            }

            if (rev_num == num) {
                ans = 0;
                return num;
            }

            else
                ans = 1;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        if (n > 0) {
            System.out.println("Next smallest palindrome:" + nextPalindromeGenerate(n));
        }
    }
}
