
public class Timmer {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                // Pause for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}