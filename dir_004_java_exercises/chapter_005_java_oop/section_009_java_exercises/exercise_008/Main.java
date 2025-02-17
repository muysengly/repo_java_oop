//TrafficLight.java
// Define the TrafficLight class
class TrafficLight {

    // Declare a private variable to store the color of the traffic light
    private String color;

    // Declare a private variable to store the duration of the traffic light in
    // seconds
    private int duration;

    // Constructor for the TrafficLight class
    public TrafficLight(String color, int duration) {
        // Initialize the color of the traffic light
        this.color = color;

        // Initialize the duration of the traffic light
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        // Update the color variable to the new color
        color = newColor;
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        // Return true if the color is red, otherwise return false
        return color.equals("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        // Return true if the color is green, otherwise return false
        return color.equals("green");
    }

    // Method to get the duration of the traffic light
    public int getDuration() {
        // Return the duration value
        return duration;
    }

    // Method to set the duration of the traffic light
    public void setDuration(int duration) {
        // Update the duration variable to the new value
        this.duration = duration;
    }
}

// Main.java
// Define the Main class
public class Main {

    // Main method, the entry point of the Java application
    public static void main(String[] args) {

        // Create a new TrafficLight object with initial color "red" and duration 30
        // seconds
        TrafficLight light = new TrafficLight("red", 30);

        // Print whether the traffic light is red
        System.out.println("The light is red: " + light.isRed());

        // Print whether the traffic light is green
        System.out.println("The light is green: " + light.isGreen());

        // Change the color of the traffic light to "green"
        light.changeColor("green");

        // Print whether the traffic light is now green
        System.out.println("The light is now green: " + light.isGreen());

        // Print the duration of the traffic light
        System.out.println("The light duration is: " + light.getDuration());

        // Set a new duration for the traffic light to 20 seconds
        light.setDuration(20);

        // Print the updated duration of the traffic light
        System.out.println("The light duration is now: " + light.getDuration());
    }
}
