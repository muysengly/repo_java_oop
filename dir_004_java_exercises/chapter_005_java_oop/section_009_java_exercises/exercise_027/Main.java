
// Import necessary classes for date handling
import java.time.LocalDate;

// Define the CustomerOrder class
class CustomerOrder {
    // Attributes for order ID, customer, and order date
    private String orderId;
    private String customer;
    private LocalDate orderDate;

    // Constructor to initialize the CustomerOrder object
    public CustomerOrder(String orderId, String customer, LocalDate orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    // Getter for order ID
    public String getOrderId() {
        return orderId;
    }

    // Getter for customer
    public String getCustomer() {
        return customer;
    }

    // Getter for order date
    public LocalDate getOrderDate() {
        return orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}
// Import necessary classes for date handling

// Define the OnlineOrder subclass that extends CustomerOrder
class OnlineOrder extends CustomerOrder {
    // Additional attributes for delivery address and tracking number
    private String deliveryAddress;
    private String trackingNumber;

    // Constructor to initialize the OnlineOrder object
    public OnlineOrder(String orderId, String customer, LocalDate orderDate, String deliveryAddress,
            String trackingNumber) {
        // Call the superclass constructor to initialize common attributes
        super(orderId, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }

    // Getter for delivery address
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    // Getter for tracking number
    public String getTrackingNumber() {
        return trackingNumber;
    }

    // Method to calculate delivery time based on the address (dummy logic for
    // demonstration)
    public int calculateDeliveryTime() {
        // Dummy logic: Assuming delivery time is based on the length of the address
        // string
        return deliveryAddress.length() % 10 + 1; // Just a placeholder logic
    }

    // Method to update the tracking status (dummy logic for demonstration)
    public void updateTrackingStatus(String newStatus) {
        // Dummy logic: Print the updated tracking status
        System.out.println("Tracking Number: " + trackingNumber + " - Status: " + newStatus);
    }

    // Override the displayOrderDetails method to include additional details
    @Override
    public void displayOrderDetails() {
        // Call the superclass method to display common details
        super.displayOrderDetails();
        // Display additional details for online order
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
// Import necessary classes for date handling

// Main class to test the CustomerOrder and OnlineOrder classes
public class Main {
    public static void main(String[] args) {
        // Create a CustomerOrder object
        CustomerOrder order = new CustomerOrder("ORD023", "Asih Wanjiku", LocalDate.now());
        // Display the order details
        order.displayOrderDetails();
        System.out.println();

        // Create an OnlineOrder object
        OnlineOrder onlineOrder = new OnlineOrder("ORD034", "Kai Biserka", LocalDate.now(),
                "123 ABC Street, Springfield", "STR455");
        // Display the online order details
        onlineOrder.displayOrderDetails();
        // Calculate and display the delivery time
        int deliveryTime = onlineOrder.calculateDeliveryTime();
        System.out.println("Estimated Delivery Time: " + deliveryTime + " days");
        // Update and display the tracking status
        onlineOrder.updateTrackingStatus("In Transit");
    }
}
