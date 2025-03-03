public class Exercise13 {

    public static void main(String[] strings) {

        final double width = 5.6;

        final double height = 8.5;

        double perimeter = 2 * (height + width);

        double area = width * height;

        System.out.printf("Perimeter is 2*(%.5f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

        // show 100000 as 100,000 using printf
        System.out.printf("%,d\n", 1000000000);

        // show 10 as 00010 using printf
        System.out.printf("%05d", 123);

    }
}
