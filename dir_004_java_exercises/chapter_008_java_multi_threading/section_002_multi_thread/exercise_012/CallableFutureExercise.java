import java.util.concurrent.*;

public class CallableFutureExercise {

    public static void main(String[] args) {
        // Create a thread pool with a single worker thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a Callable task to the executor
        Future<String> future = executor.submit(new Task());

        // Perform other operations while the task is executing

        try {
            // Wait for the task to complete and get the result
            String result = future.get();

            System.out.println("Task result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }

    static class Task implements Callable<String> {
        @Override
        public String call() throws Exception {
            // Perform the task and return the result
            Thread.sleep(2000); // Simulate some time-consuming operation
            return "Task completed!";
        }
    }
}
