import java.util.Date;
import java.util.ArrayList;
import java.util.List;

// Define the Event class
class Event {
    String eventName;
    Date date;
    String location;

    public Event(String eventName, Date date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

    public boolean isConflict(Event otherEvent) {
        return this.date.equals(otherEvent.date) && this.location.equals(otherEvent.location);
    }
}

// Define the Seminar class that extends Event
class Seminar extends Event {
    int numberOfSpeakers;

    public Seminar(String eventName, Date date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

// Define the MusicalPerformance class that extends Event
@SuppressWarnings("rawtypes")
class MusicalPerformance extends Event {
    List performers;

    public MusicalPerformance(String eventName, Date date, String location, List performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}

// Main class to test the Event, Seminar, and MusicalPerformance classes
@SuppressWarnings("rawtypes")
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // Create different dates to avoid conflict
        // Create a date for testing
        Date date = new Date();

        // Create an instance of Seminar
        Seminar seminar = new Seminar("Space Conference", date, "Convention Center", 5);

        // Create an instance of MusicalPerformance
        List performers = new ArrayList<>();
        performers.add("Band A");
        performers.add("Band B");
        MusicalPerformance concert = new MusicalPerformance("Winter Fest", date, "Convention Center", performers);

        // Display details of the seminar
        System.out.println("Seminar Details:");
        seminar.displayDetails();

        // Display details of the musical performance
        System.out.println("\nMusical Performance Details:");
        concert.displayDetails();

        // Check for scheduling conflict
        if (seminar.isConflict(concert)) {
            System.out.println("\nConflict detected: Both events are scheduled at the same time and location.");
        } else {
            System.out.println("\nNo conflict: Events are scheduled at different times or locations.");
        }
    }
}
