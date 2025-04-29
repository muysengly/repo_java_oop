public class TestMain {
    public static void main(String[] args) {
        System.out.println(isXXX(1));
    }

    public static boolean isXXX(int num) {

        boolean boo = true;

        if (num <= 1) {
            boo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    boo = false;
                    break;
                }
            }
        }

        return boo;
    }
}