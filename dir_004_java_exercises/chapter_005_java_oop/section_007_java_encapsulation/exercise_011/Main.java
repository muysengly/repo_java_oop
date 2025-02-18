public class Main {
    // Public setter for the numberOfRooms variable
    public static void main(String[] args) {
        // Create a new House object
        House house = new House();

        // Set the address, number of rooms, and area of the house
        house.setAddress("ABC Main Rd.");
        house.setNumberOfRooms(5);
        house.setArea(130.5);

        // Calculate the price of the house with a given price per square meter
        double price = house.calculatePrice(2000);

        // Print the details of the house and its calculated price
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Rooms: " + house.getNumberOfRooms());
        System.out.println("Area: " + house.getArea() + " sq meters");
        System.out.println("Price: $" + price);
    }
}

// Define the House class
class House {
    // Private instance variables
    private String address;
    private int numberOfRooms;
    private double area; // area in square meters

    // Public getter for the address variable
    public String getAddress() {
        return address;
    }

    // Public setter for the address variable
    public void setAddress(String address) {
        this.address = address;
    }

    // Public getter for the numberOfRooms variable
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Public setter for the numberOfRooms variable
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    // Public getter for the area variable
    public double getArea() {
        return area;
    }

    // Public setter for the area variable
    public void setArea(double area) {
        this.area = area;
    }

    // Method to calculate the price of the house based on area and price per square
    // meter
    public double calculatePrice(double pricePerSquareMeter) {
        return this.area * pricePerSquareMeter;
    }
}
