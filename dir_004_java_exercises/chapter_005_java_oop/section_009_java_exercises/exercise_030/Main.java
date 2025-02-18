// Define the GymMembership class
class GymMembership {
    // Attributes for GymMembership
    String memberName;
    String membershipType;
    int duration; // in months

    // Constructor for GymMembership
    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    // Method to calculate membership fees
    public double calculateFees() {
        double baseFee = 50.0; // Base fee per month
        return baseFee * duration;
    }

    // Method to check for special offers
    public String checkSpecialOffers() {
        if (membershipType.equalsIgnoreCase("annual")) {
            return "10% discount on annual membership.";
        } else {
            return "No special offers available.";
        }
    }

    // Method to display membership details
    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFees());
        System.out.println("Special Offers: " + checkSpecialOffers());
    }
}

// Define the PremiumMembership class that extends GymMembership
class PremiumMembership extends GymMembership {
    // Additional attributes for PremiumMembership
    boolean personalTrainerAvailable;
    boolean spaAccess;

    // Constructor for PremiumMembership
    public PremiumMembership(String memberName, String membershipType, int duration, boolean personalTrainerAvailable,
            boolean spaAccess) {
        super(memberName, membershipType, duration);
        this.personalTrainerAvailable = personalTrainerAvailable;
        this.spaAccess = spaAccess;
    }

    // Override the calculateFees method to include additional costs
    @Override
    public double calculateFees() {
        double baseFee = super.calculateFees();
        double additionalFee = 0.0;

        if (personalTrainerAvailable) {
            additionalFee += 30.0 * duration; // Additional fee per month for personal trainer
        }
        if (spaAccess) {
            additionalFee += 20.0 * duration; // Additional fee per month for spa access
        }
        return baseFee + additionalFee;
    }

    // Override the displayDetails method to include premium details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer Available: " + (personalTrainerAvailable ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }
}

// Main class to test the GymMembership and PremiumMembership classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of GymMembership
        GymMembership basicMember = new GymMembership("Njeri Inka", "Monthly", 6);

        // Create an instance of PremiumMembership
        PremiumMembership premiumMember = new PremiumMembership("Willy Diantha", "Annual", 12, true, true);

        // Display details of the basic membership
        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        // Display details of the premium membership
        System.out.println("\nPremium Membership Details:");
        premiumMember.displayDetails();
    }
}
