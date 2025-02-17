import java.util.Scanner;
public class Main { 
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer(positive/negative):");
        int n = in.nextInt();
        System.out.print("Extract the first digit from the said integer:\n");
        System.out.print(test(n));
        }

public static int test(int n){
       int fact_num = 10;
       while(n / fact_num != 0){
        fact_num *= 10;
    }
    return Math.abs(n / (fact_num/10));
  }
}
