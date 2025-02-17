
// ProducerConsumer.java
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private static final int BUFFER_SIZE = 5;
    private static final Queue<Integer> buffer = new LinkedList<>();

    public static void main(String[] args) {
        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        // Start producer and consumer threads
        producerThread.start();
        consumerThread.start();
    }

    // Producer thread class
    static class Producer implements Runnable {
        public void run() {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    // Wait if the buffer is full
                    while (buffer.size() == BUFFER_SIZE) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Produce item and add to the buffer
                    System.out.println("Producer produced: " + value);
                    buffer.add(value++);
                    // Notify all consumers that an item is produced
                    buffer.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Consumer thread class
    static class Consumer implements Runnable {
        public void run() {
            while (true) {
                synchronized (buffer) {
                    // Wait if the buffer is empty
                    while (buffer.isEmpty()) {
                        try {
                            buffer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Consume item from the buffer
                    int value = buffer.poll();
                    System.out.println("Consumer consumed: " + value);
                    // Notify all producers that an item is consumed
                    buffer.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
