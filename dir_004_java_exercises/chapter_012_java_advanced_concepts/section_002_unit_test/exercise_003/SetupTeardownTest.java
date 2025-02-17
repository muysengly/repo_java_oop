// ExceptionTest.java

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class SetupTeardownTest {

    // Example class with setup and teardown operations
    public class ExampleClass {
        private String resource;

        // Setup method - runs before each test
        @Before
        public void setUp() {
            System.out.println("Setting up resources...");
            resource = "Initialized Resource";
        }

        // Teardown method - runs after each test
        @After
        public void tearDown() {
            System.out.println("Cleaning up resources...");
            resource = null;
        }

        // Method to be tested
        public String getResource() {
            return resource;
        }
    }

    // JUnit test case with setup and teardown
    @Test
    public void testResourceInitialization() {
        // Arrange
        ExampleClass example = new ExampleClass();

        // Act
        String result = example.getResource();

        // Assert
        assertEquals("Initialized Resource", result);
    }

    // JUnit test case with setup and teardown
    @Test
    public void testResourceCleanup() {
        // Arrange
        ExampleClass example = new ExampleClass();

        // Act
        example.getResource(); // Invoke the method to trigger setup and teardown

        // Assert
        assertNull(example.getResource());
    }

    // Main function to run JUnit tests
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SetupTeardownTest.class);

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
