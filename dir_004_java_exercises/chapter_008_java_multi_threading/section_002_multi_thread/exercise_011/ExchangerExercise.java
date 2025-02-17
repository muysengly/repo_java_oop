import java.util.concurrent.Exchanger;

public class ExchangerExercise {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        // Create and start two worker threads
        Thread thread1 = new Thread(new Worker(exchanger, "Data from Thread 1"));
        Thread thread2 = new Thread(new Worker(exchanger, "Data from Thread 2"));
        thread1.start();
        thread2.start();
    }

    static class Worker implements Runnable {
        private final Exchanger<String> exchanger;
        private final String data;

        public Worker(Exchanger<String> exchanger, String data) {
            this.exchanger = exchanger;
            this.data = data;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " sending data: " + data);
                String receivedData = exchanger.exchange(data); // Exchange data with the other thread

                System.out.println(Thread.currentThread().getName() + " received data: " + receivedData);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
