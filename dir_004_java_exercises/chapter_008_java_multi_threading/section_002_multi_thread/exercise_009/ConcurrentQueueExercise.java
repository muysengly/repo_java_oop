import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExercise {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Create and start the producer threads
        Thread producerThread1 = new Thread(new Producer(queue, "Producer-1"));
        Thread producerThread2 = new Thread(new Producer(queue, "Producer-2"));
        producerThread1.start();
        producerThread2.start();

        // Create and start the consumer threads
        Thread consumerThread1 = new Thread(new Consumer(queue, "Consumer-1"));
        Thread consumerThread2 = new Thread(new Consumer(queue, "Consumer-2"));
        consumerThread1.start();
        consumerThread2.start();
    }

    static class Producer implements Runnable {
        private ConcurrentLinkedQueue<String> queue;
        private String producerName;
        private int counter;

        public Producer(ConcurrentLinkedQueue<String> queue, String producerName) {
            this.queue = queue;
            this.producerName = producerName;
            this.counter = 0;
        }

        public void run() {
            while (true) {
                String item = producerName + "-Item-" + counter++;
                queue.offer(item);
                System.out.println("Produced: " + item);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        private ConcurrentLinkedQueue<String> queue;
        private String consumerName;

        public Consumer(ConcurrentLinkedQueue<String> queue, String consumerName) {
            this.queue = queue;
            this.consumerName = consumerName;
        }

        public void run() {
            while (true) {
                String item = queue.poll();
                if (item != null) {
                    System.out.println(consumerName + " consumed: " + item);
                }

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
