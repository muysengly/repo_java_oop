public class Exercise15 {

    public static void main(String[] args) {

        int a, b;
        a = 15;
        b = 27;

        System.out.println("Before swapping : a, b = " + a + ", " + b);

        a = a + b; // a = 42
        b = a - b; // b = 15
        a = a - b; // a = 42 - 15 = 27

        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
