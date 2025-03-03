public class Main {
    public static void main(String[] args) {

        // demo varargs
        System.out.println(sum(1, 2, 3, 4, 5)); // 15

    }

    public static int sum(int... numbers) { // Variable number of arguments
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
}