// CalculatorTest.java

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(3, 5);

        // Assert
        assertEquals(8, result); // The expected value is 8
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTest.class);

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
