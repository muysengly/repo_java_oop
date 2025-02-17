import java.util.*;

public class Exercise116 {
    public static void main(String[] args) {
        // Iterate from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // Check if the number is divisible by both 3 and 5 (fizz buzz)
                System.out.printf("\n%d: fizz buzz", i);
            } else if (i % 5 == 0) {
                // Check if the number is divisible by 5 (buzz)
                System.out.printf("\n%d: buzz", i);
            } else if (i % 3 == 0) {
                // Check if the number is divisible by 3 (fizz)
                System.out.printf("\n%d: fizz", i);
            }
        }
        System.out.printf("\n");
    }
}
