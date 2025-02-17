
// Restaurant.java
import java.util.ArrayList;

// Define the Restaurant class
class Restaurant {
  private ArrayList<String> menuItems;
  private ArrayList<Double> prices;
  private ArrayList<Integer> ratings;
  private ArrayList<Integer> itemCounts;

  public Restaurant() {
    this.menuItems = new ArrayList<>();
    this.prices = new ArrayList<>();
    this.ratings = new ArrayList<>();
    this.itemCounts = new ArrayList<>();
  }

  public void addItem(String item, double price) {
    if (item == null || item.isEmpty() || price < 0) {
      System.out.println("Invalid item or price.");
      return;
    }
    this.menuItems.add(item);
    this.prices.add(price);
    this.ratings.add(0);
    this.itemCounts.add(0);
  }

  public void removeItem(String item) {
    int index = this.menuItems.indexOf(item);
    if (index >= 0) {
      this.menuItems.remove(index);
      this.prices.remove(index);
      this.ratings.remove(index);
      this.itemCounts.remove(index);
    } else {
      System.out.println("Item not found: " + item);
    }
  }

  public void addRating(String item, int rating) {
    if (rating < 1 || rating > 5) {
      System.out.println("Rating must be between 1 and 5.");
      return;
    }
    int index = this.menuItems.indexOf(item);
    if (index >= 0) {
      this.ratings.set(index, this.ratings.get(index) + rating);
      this.itemCounts.set(index, this.itemCounts.get(index) + 1);
    } else {
      System.out.println("Item not found: " + item);
    }
  }

  public double getAverageRating(String item) {
    int index = this.menuItems.indexOf(item);
    if (index >= 0 && this.itemCounts.get(index) > 0) {
      return (double) this.ratings.get(index) / this.itemCounts.get(index);
    }
    return 0.0;
  }

  public void displayMenu() {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(menuItems.get(i) + ": $" + prices.get(i) +
          " (Avg. Rating: " + getAverageRating(menuItems.get(i)) + ")");
    }
  }

  public double calculateAverageRating() {
    double totalRating = 0;
    int totalRatings = 0;
    for (int i = 0; i < ratings.size(); i++) {
      totalRating += ratings.get(i);
      totalRatings += itemCounts.get(i);
    }
    return totalRatings > 0 ? totalRating / totalRatings : 0.0;
  }
}

// Main.java
public class Main {
  public static void main(String[] args) {
    Restaurant restaurant = new Restaurant();
    restaurant.addItem("Burger", 8.99);
    restaurant.addItem("Pizza", 10.99);
    restaurant.addItem("Salad", 6.00);

    System.out.println("Menu: Item & Price");
    restaurant.displayMenu();

    restaurant.addRating("Burger", 4);
    restaurant.addRating("Burger", 5);
    restaurant.addRating("Pizza", 3);
    restaurant.addRating("Pizza", 4);
    restaurant.addRating("Salad", 2);

    System.out.println("\nAverage rating for Burger: " + restaurant.getAverageRating("Burger"));
    System.out.println("Average rating for Pizza: " + restaurant.getAverageRating("Pizza"));
    System.out.println("Average rating for Salad: " + restaurant.getAverageRating("Salad"));
    System.out.println("Overall average rating: " + restaurant.calculateAverageRating());

    System.out.println("\nRemove 'Pizza' from the above menu.");
    restaurant.removeItem("Pizza");
    System.out.println("\nUpdated menu:");
    restaurant.displayMenu();
  }
}
