import java.util.Scanner;
public class Exercise14 {
 
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides: ");
        int n = input.nextInt();
        System.out.print("Input the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " + pentagon_area(n, side));
    }

    public static double pentagon_area(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
}
