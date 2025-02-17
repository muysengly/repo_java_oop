import java.util.concurrent.locks.StampedLock;

public class StampedLockExercise {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Start multiple reader threads
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                int value = sharedResource.getValue();
                System.out.println("Reader thread: " + Thread.currentThread().getName() + ", value: " + value);
            }).start();
        }

        // Start a writer thread
        new Thread(() -> {
            sharedResource.setValue(42);
            System.out.println("Writer thread: " + Thread.currentThread().getName() + " set value to 42");
        }).start();
    }

    static class SharedResource {
        private int value;
        private final StampedLock lock = new StampedLock();

        public int getValue() {
            long stamp = lock.tryOptimisticRead(); // Optimistically acquire a read lock

            int currentValue = value;

            if (!lock.validate(stamp)) { // Check for concurrent write
                stamp = lock.readLock(); // Upgrade to a read lock
                try {
                    currentValue = value;
                } finally {
                    lock.unlockRead(stamp); // Release the read lock
                }
            }

            return currentValue;
        }

        public void setValue(int value) {
            long stamp = lock.writeLock(); // Acquire a write lock

            try {
                this.value = value;
            } finally {
                lock.unlockWrite(stamp); // Release the write lock
            }
        }
    }
}
