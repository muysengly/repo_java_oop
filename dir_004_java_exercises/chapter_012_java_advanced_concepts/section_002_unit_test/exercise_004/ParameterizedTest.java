// ParameterizedTest.java

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

public class ParameterizedTest {

    // Example class with the method to be tested
    public static class ExampleClass {
        public int multiply(int a, int b) {
            return a * b;
        }
    }

    // Parameterized test case
    @RunWith(Parameterized.class)
    public static class MultiplyTest {
        private int input1;
        private int input2;
        private int expectedResult;

        // Constructor with parameters
        public MultiplyTest(int input1, int input2, int expectedResult) {
            this.input1 = input1;
            this.input2 = input2;
            this.expectedResult = expectedResult;
        }

        // Parameters for the test cases
        @Parameters
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
                    { 2, 3, 6 },
                    { 5, 5, 25 },
                    { -1, 4, -4 },
                    { 0, 8, 0 }
            });
        }

        // JUnit test using parameters
        @Test
        public void testMultiply() {
            ExampleClass example = new ExampleClass();
            int result = example.multiply(input1, input2);
            assertEquals(expectedResult, result);
        }
    }

    // Main function to run JUnit tests
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MultiplyTest.class);

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