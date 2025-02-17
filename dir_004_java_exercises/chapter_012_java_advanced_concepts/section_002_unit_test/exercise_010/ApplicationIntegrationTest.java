// ApplicationIntegrationTest.java

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

// Component 1: UserService
class UserService {
    public String getUserFullName(int userId) {
        // Simulate fetching user data from a database
        // In a real application, this would involve interacting with a database or
        // another service
        return "Carl Mays"; // Assume a static user for simplicity
    }
}

// Component 2: OrderService
class OrderService {
    private UserService userService;

    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public String getOrderDetails(int orderId) {
        // Simulate fetching order details from a database
        // In a real application, this would involve interacting with a database or
        // another service
        int userId = 1; // Assume a static user for simplicity
        String userName = userService.getUserFullName(userId);
        return "Order #123 for User: " + userName;
    }
}

// JUnit Test Class
public class ApplicationIntegrationTest {

    private UserService userService;
    private OrderService orderService;

    @Before
    public void setUp() {
        userService = new UserService();
        orderService = new OrderService(userService);
    }

    @Test
    public void testGetOrderDetails() {
        // Test the interaction between UserService and OrderService
        String orderDetails = orderService.getOrderDetails(123);

        // Verify the result
        assertEquals("Order #123 for User: Carl Mays", orderDetails);
    }

    public static void main(String[] args) {
        // Run the JUnit test
        Result result = JUnitCore.runClasses(ApplicationIntegrationTest.class);

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
