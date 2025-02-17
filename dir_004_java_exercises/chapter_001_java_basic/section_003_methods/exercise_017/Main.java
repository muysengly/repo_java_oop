import java.util.Scanner;
public class Main {
 public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Input a number: ");
       int n = in.nextInt();
       if (n>0)
       {
       System.out.println(test(n));
       }
   }
 public static int test(int num)
   {
    int ctr = 0;
    int n = num;
    do{
      if (n % 10 == 2){
          ctr ++;
      }
      n /= 10;
     }while(n > 0);
      return ctr;
   }
}
