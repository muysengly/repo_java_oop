// Main.java
public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x, y) -> x + y;
        int result = sumCalculator.sum(7, 6);
        System.out.println("Sum 7,6): " + result);
        result = sumCalculator.sum(15, -35);
        System.out.println("Sum 15, -35): " + result);
    }
}
