// TimeoutTest.java

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TimeoutTest {

    // Rule to set a timeout for all test methods in this class
    @Rule
    public Timeout globalTimeout = new Timeout(2); // Set the timeout in seconds

    // Example class with the method to be tested
    public static class ExampleClass {
        public void longRunningMethod() {
            // Simulate a long-running operation
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // JUnit test case with a timeout for the specific method
    @Test(timeout = 2000) // Set the timeout in milliseconds
    public void testLongRunningMethod() {
        ExampleClass example = new ExampleClass();
        example.longRunningMethod();
    }

    // Main function to run JUnit tests
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TimeoutTest.class);

        // Check if there are any failures
        if (result.getFailureCount() > 0) {
            System.out.println("Test failed:");

            // Print details of failures
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        } else {
            System.out.println("All tests passed successfully.");
        }
    }
}
