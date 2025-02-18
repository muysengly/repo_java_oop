// Define the Building class
class Building {
    // Attributes for the Building class
    String address;
    int numberOfFloors;
    double totalArea;

    // Constructor for the Building class
    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    // Method to display basic information about the building
    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq meters");
    }
}

// Define the ResidentialBuilding class that extends Building
class ResidentialBuilding extends Building {
    // Additional attribute for ResidentialBuilding
    int numberOfApartments;
    double rentPerApartment;

    // Constructor for the ResidentialBuilding class
    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments,
            double rentPerApartment) {
        super(address, numberOfFloors, totalArea); // Call the constructor of the superclass
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    // Method to calculate total rent for ResidentialBuilding
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    // Override the displayInfo method to include additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

// Define the CommercialBuilding class that extends Building
class CommercialBuilding extends Building {
    // Additional attribute for CommercialBuilding
    double officeSpace; // in square meters
    double rentPerSquareMeter;

    // Constructor for the CommercialBuilding class
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpace,
            double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea); // Call the constructor of the superclass
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    // Method to calculate total rent for CommercialBuilding
    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }

    // Override the displayInfo method to include additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Space: " + officeSpace + " sq meters");
        System.out.println("Rent per Square Meter: $" + rentPerSquareMeter);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

// Main class to test the Building, ResidentialBuilding, and CommercialBuilding
// classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of ResidentialBuilding
        ResidentialBuilding residentialBuilding = new ResidentialBuilding("99 ABC Street.", 10, 2500.0, 20, 1000.0);

        // Create an instance of CommercialBuilding
        CommercialBuilding commercialBuilding = new CommercialBuilding("100 PQR Business Avenue.", 15, 4500.0, 3000.0,
                20.0);

        // Display information about the residential building
        System.out.println("Residential Building Info:");
        residentialBuilding.displayInfo();

        // Display information about the commercial building
        System.out.println("\nCommercial Building Info:");
        commercialBuilding.displayInfo();
    }
}
