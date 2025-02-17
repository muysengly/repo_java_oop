
// ExceptionTest.java
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class ExceptionTest {

    // Example class with a method that throws a specific exception
    public class ExampleClass {
        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return a / b;
        }
    }

    // JUnit test case to verify the specific exception
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        // Arrange
        ExampleClass example = new ExampleClass();

        // Act
        int result = example.divide(10, 0);

        // Assert (Exception is expected, so nothing to assert)
    }

    // Main function to run JUnit tests
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExceptionTest.class);

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
