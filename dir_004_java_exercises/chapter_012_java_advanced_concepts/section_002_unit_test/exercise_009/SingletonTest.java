// SingletonTest.java

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void testSingletonInstance() throws InterruptedException {
        // Create multiple threads to access the singleton instance concurrently
        Thread thread1 = new Thread(() -> {
            Singleton instance1 = Singleton.getInstance();
            try {
                Thread.sleep(100); // Simulate some work in the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton instance2 = Singleton.getInstance();

            // Assert that both instances obtained in the same thread are the same
            assertEquals(instance1, instance2);
        });

        Thread thread2 = new Thread(() -> {
            Singleton instance3 = Singleton.getInstance();
            try {
                Thread.sleep(100); // Simulate some work in the thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Singleton instance4 = Singleton.getInstance();

            // Assert that both instances obtained in the same thread are the same
            assertEquals(instance3, instance4);
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        thread1.join();
        thread2.join();
    }

    public static void main(String[] args) {
        // Run the JUnit test
        org.junit.runner.JUnitCore.main("SingletonTest");
    }
}
