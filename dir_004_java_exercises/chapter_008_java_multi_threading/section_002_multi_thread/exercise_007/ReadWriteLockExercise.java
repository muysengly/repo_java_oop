import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExercise {
    private static final int NUM_READERS = 3;
    private static final int NUM_WRITERS = 2;

    public static void main(String[] args) {
        ReadWriteLock lock = new ReentrantReadWriteLock();
        SharedResource sharedResource = new SharedResource();

        // Create and start the reader threads
        for (int i = 0; i < NUM_READERS; i++) {
            Thread readerThread = new Thread(new Reader(lock, sharedResource));
            readerThread.start();
        }

        // Create and start the writer threads
        for (int i = 0; i < NUM_WRITERS; i++) {
            Thread writerThread = new Thread(new Writer(lock, sharedResource));
            writerThread.start();
        }
    }

    static class Reader implements Runnable {
        private ReadWriteLock lock;
        private SharedResource sharedResource;

        public Reader(ReadWriteLock lock, SharedResource sharedResource) {
            this.lock = lock;
            this.sharedResource = sharedResource;
        }

        public void run() {
            while (true) {
                lock.readLock().lock();

                // Read from the shared resource
                System.out.println("Reader " + Thread.currentThread().getName() + " reads: " + sharedResource.read());

                lock.readLock().unlock();

                // Delay between consecutive reads
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Writer implements Runnable {
        private ReadWriteLock lock;
        private SharedResource sharedResource;
        private int counter = 0;

        public Writer(ReadWriteLock lock, SharedResource sharedResource) {
            this.lock = lock;
            this.sharedResource = sharedResource;
        }

        public void run() {
            while (true) {
                lock.writeLock().lock();

                // Write to the shared resource
                sharedResource.write("Writer " + Thread.currentThread().getName() + " writes: " + counter++);

                lock.writeLock().unlock();

                // Delay between consecutive writes
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class SharedResource {
        private String data;

        public String read() {
            return data;
        }

        public void write(String data) {
            this.data = data;
        }
    }
}
