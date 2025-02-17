
// Define the Customer class
// Import necessary classes
import java.util.ArrayList;
import java.util.List;

class Customer {
  // Attributes for the customer's name, email, and purchase history
  private String name;
  private String email;
  private List<Double> purchaseHistory;

  // Constructor to initialize the customer's name and email
  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
    this.purchaseHistory = new ArrayList<>(); // Initialize purchase history as an empty list
  }

  // Method to add a purchase to the purchase history
  public void addPurchase(double amount) {
    purchaseHistory.add(amount);
  }

  // Method to calculate the total expenditure
  public double calculateTotalExpenditure() {
    double total = 0;
    // Loop through each purchase and sum up the amounts
    for (double purchase : purchaseHistory) {
      total += purchase;
    }
    return total;
  }

  // Getters for the name and email attributes
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  // Getter for the purchase history
  public List<Double> getPurchaseHistory() {
    return purchaseHistory;
  }
}

// Define the LoyalCustomer subclass that extends the Customer class
// Import necessary classes
// import java.util.ArrayList;
// import java.util.List;
class LoyalCustomer extends Customer {
  // Attribute for the discount rate
  private double discountRate;

  // Constructor to initialize the LoyalCustomer with name, email, and discount
  // rate
  public LoyalCustomer(String name, String email, double discountRate) {
    super(name, email); // Call the superclass constructor
    this.discountRate = discountRate;
  }

  // Method to apply the discount to a given amount
  public double applyDiscount(double amount) {
    return amount - (amount * discountRate / 100);
  }

  // Override the addPurchase method to apply the discount before adding the
  // purchase
  @Override
  public void addPurchase(double amount) {
    double discountedAmount = applyDiscount(amount);
    super.addPurchase(discountedAmount); // Call the superclass method to add the discounted amount
  }

  // Getter for the discount rate
  public double getDiscountRate() {
    return discountRate;
  }

  // Setter for the discount rate
  public void setDiscountRate(double discountRate) {
    this.discountRate = discountRate;
  }
}

// Main class to test the Customer and LoyalCustomer classes
// Import necessary classes
// import java.util.ArrayList;
// import java.util.List;
public class Main {
  public static void main(String[] args) {
    // Create a regular customer
    Customer customer1 = new Customer("Talisha Dion", "talisha@example.com");
    customer1.addPurchase(200);
    customer1.addPurchase(300);
    System.out
        .println("Total expenditure for " + customer1.getName() + ": " + customer1.calculateTotalExpenditure());

    // Create a loyal customer with a discount rate
    LoyalCustomer loyalCustomer = new LoyalCustomer("Fulchard Sofya", "fulchard@example.com", 10); // 10% discount
    loyalCustomer.addPurchase(200);
    loyalCustomer.addPurchase(300);
    System.out.println("Total expenditure for " + loyalCustomer.getName() + " after discount: "
        + loyalCustomer.calculateTotalExpenditure());
  }
}
