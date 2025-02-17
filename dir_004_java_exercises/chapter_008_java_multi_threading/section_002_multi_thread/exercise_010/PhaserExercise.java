import java.util.concurrent.Phaser;

public class PhaserExercise {

    public static void main(String[] args) {
        // Create a Phaser with 4 registered parties
        Phaser phaser = new Phaser(4);

        // Create and start three worker threads
        Thread thread1 = new Thread(new Worker(phaser, "Thread 1"));
        Thread thread2 = new Thread(new Worker(phaser, "Thread 2"));
        Thread thread3 = new Thread(new Worker(phaser, "Thread 3"));
        Thread thread4 = new Thread(new Worker(phaser, "Thread 4"));
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to complete
        phaser.awaitAdvance(phaser.getPhase());

        System.out.println("All threads have completed their tasks.");
    }

    static class Worker implements Runnable {
        private final Phaser phaser;
        private final String name;

        public Worker(Phaser phaser, String name) {
            this.phaser = phaser;
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " starting phase 1");
            phaser.arriveAndAwaitAdvance(); // Wait for all threads to reach this point

            // Perform phase 1 tasks
            System.out.println(name + " performing phase 1 tasks");

            // Wait for all threads to complete phase 1
            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " starting phase 2");
            phaser.arriveAndAwaitAdvance(); // Wait for all threads to reach this point

            // Perform phase 2 tasks
            System.out.println(name + " performing phase 2 tasks");

            // Wait for all threads to complete phase 2
            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " completed all phases");
            phaser.arriveAndDeregister(); // Deregister from the Phaser
        }
    }
}
