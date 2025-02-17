import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExercise {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Create and start the writer threads
        Thread writerThread1 = new Thread(new Writer(map, "Thread-1", 1));
        Thread writerThread2 = new Thread(new Writer(map, "Thread-2", 2));
        writerThread1.start();
        writerThread2.start();

        // Create and start the reader threads
        Thread readerThread1 = new Thread(new Reader(map, "Thread-1"));
        Thread readerThread2 = new Thread(new Reader(map, "Thread-2"));
        readerThread1.start();
        readerThread2.start();
    }

    static class Writer implements Runnable {
        private ConcurrentHashMap<String, Integer> map;
        private String threadName;
        private int value;

        public Writer(ConcurrentHashMap<String, Integer> map, String threadName, int value) {
            this.map = map;
            this.threadName = threadName;
            this.value = value;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                map.put(threadName, value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Reader implements Runnable {
        private ConcurrentHashMap<String, Integer> map;
        private String threadName;

        public Reader(ConcurrentHashMap<String, Integer> map, String threadName) {
            this.map = map;
            this.threadName = threadName;
        }

        public void run() {
            for (int i = 0; i < 5; i++) {
                Integer value = map.get(threadName);
                System.out.println("Thread " + threadName + " read value: " + value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
