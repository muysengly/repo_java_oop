import java.util.*;

public class Main {
    static int calcAngle(double ha, double ma) {
        if (ha == 12)
            ha = 0;
        if (ma == 60)
            ma = 0;
        int hour_angle = (int) (0.5 * (ha * 60 + ma));
        int minute_angle = (int) (6 * ma);

        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }

    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input angles move by hour hand: ");
        int ha = scan.nextInt();
        System.out.print("Input angles move by minute hand: ");
        int ma = scan.nextInt();
        if (ha < 0 || ma < 0 || ha > 12 || ma > 60) {
            System.out.println("Wrong input..!");
        } else {
            System.out.println("Angle between hour and minute hands " + calcAngle(ha, ma) + " degree.");
        }
    }
}
