// CustomAssertionTest.java

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class CustomAssertionTest {

    @Test
    public void testAddition() {
        int result = add(2, 3);
        assertWithMessage("Addition failed: ", result == 5);
    }

    @Test
    public void testMultiplication() {
        int result = multiply(2, 3);
        assertWithMessage("Multiplication failed: ", result == 6);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private static void assertWithMessage(String message, boolean condition) {
        assert condition : message;
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CustomAssertionTest.class);

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
