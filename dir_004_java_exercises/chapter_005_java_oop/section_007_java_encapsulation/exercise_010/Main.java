public class Main {
    // Main method to test the Desktop class
    public static void main(String[] args) {
        // Create a new Desktop object
        Desktop desktop = new Desktop();

        // Set the brand, processor, and initial RAM size of the desktop
        desktop.setBrand("ComputeMaster");
        desktop.setProcessor("Intel Core i7");
        desktop.setRamSize(32);

        // Upgrade the RAM size by 32 GB
        desktop.upgradeRam(32);

        // Print the details of the desktop
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM Size: " + desktop.getRamSize() + "GB");
    }
}

// Define the Desktop class
class Desktop {
    // Private instance variables
    private String brand;
    private String processor;
    private int ramSize;

    // Public getter for the brand variable
    public String getBrand() {
        return brand;
    }

    // Public setter for the brand variable
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Public getter for the processor variable
    public String getProcessor() {
        return processor;
    }

    // Public setter for the processor variable
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // Public getter for the ramSize variable
    public int getRamSize() {
        return ramSize;
    }

    // Public setter for the ramSize variable
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    // Method to upgrade the RAM size by a given value
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            this.ramSize += additionalRam;
        }
    }
}
