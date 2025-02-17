
public class Main {
    public static void main(String[] args) {
        double value = 12.56;
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.print("\nOriginal value: " + value);
        System.out.print("\nIntegral part: " + integral_part);
        System.out.print("\nFractional part: " + fractional_part);
        System.out.println();
    }
}
