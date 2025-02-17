public class Main {
  // Main method to test the Product class
  public static void main(String[] args) {
    // Create a new Product object
    Product product = new Product();

    // Set the product name, code, and initial price
    product.setProductName("Laptop");
    product.setProductCode("LT01233");
    product.setPrice(1100.00);

    // Apply a 8% discount to the product
    product.applyDiscount(8);

    // Print the details of the product
    System.out.println("Product Name: " + product.getProductName());
    System.out.println("Product Code: " + product.getProductCode());
    System.out.println("Price after discount: $" + product.getPrice());
  }
}

// Define the Product class
class Product {
  // Private instance variables
  private String productName;
  private String productCode;
  private double price;

  // Public getter for the productName variable
  public String getProductName() {
    return productName;
  }

  // Public setter for the productName variable
  public void setProductName(String productName) {
    this.productName = productName;
  }

  // Public getter for the productCode variable
  public String getProductCode() {
    return productCode;
  }

  // Public setter for the productCode variable
  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  // Public getter for the price variable
  public double getPrice() {
    return price;
  }

  // Public setter for the price variable
  public void setPrice(double price) {
    this.price = price;
  }

  // Method to apply a discount percentage to the price
  public void applyDiscount(double percentage) {
    if (percentage > 0 && percentage <= 100) {
      this.price -= this.price * (percentage / 100);
    }
  }
}
