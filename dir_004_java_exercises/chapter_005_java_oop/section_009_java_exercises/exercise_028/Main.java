
// Import necessary classes for date handling
import java.time.LocalDate;

// Define the Reservation class
class Reservation {
  // Attributes for reservation ID, customer name, and date
  private String reservationId;
  private String customerName;
  private LocalDate date;

  // Constructor to initialize the Reservation object
  public Reservation(String reservationId, String customerName, LocalDate date) {
    this.reservationId = reservationId;
    this.customerName = customerName;
    this.date = date;
  }

  // Method to check reservation status
  public void checkReservationStatus() {
    System.out.println("Reservation ID: " + reservationId);
    System.out.println("Customer Name: " + customerName);
    System.out.println("Date: " + date);
    System.out.println("Status: Confirmed");
  }

  // Method to modify reservation details
  public void modifyReservation(String newCustomerName, LocalDate newDate) {
    this.customerName = newCustomerName;
    this.date = newDate;
    System.out.println("Reservation modified successfully.");
  }

  // Getters for the attributes
  public String getReservationId() {
    return reservationId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public LocalDate getDate() {
    return date;
  }
}

// Import necessary classes for date handling
// Define the ResortReservation subclass that extends Reservation
class ResortReservation extends Reservation {
  // Additional attribute for the room number
  private int roomNumber;

  // Constructor to initialize the ResortReservation object
  public ResortReservation(String reservationId, String customerName, LocalDate date, int roomNumber) {
    super(reservationId, customerName, date); // Call the superclass constructor
    this.roomNumber = roomNumber;
  }

  // Method to check reservation status including room number
  @Override
  public void checkReservationStatus() {
    super.checkReservationStatus(); // Call the superclass method
    System.out.println("Room Number: " + roomNumber);
  }

  // Method to modify reservation details including room number
  public void modifyReservation(String newCustomerName, LocalDate newDate, int newRoomNumber) {
    super.modifyReservation(newCustomerName, newDate); // Call the superclass method
    this.roomNumber = newRoomNumber;
    System.out.println("Room Number updated successfully.");
  }

  // Getter for the room number
  public int getRoomNumber() {
    return roomNumber;
  }
}

// Import necessary classes for date handling
// Define the RailwayReservation subclass that extends Reservation
class RailwayReservation extends Reservation {
  // Additional attribute for the seat number
  private int seatNumber;

  // Constructor to initialize the RailwayReservation object
  public RailwayReservation(String reservationId, String customerName, LocalDate date, int seatNumber) {
    super(reservationId, customerName, date); // Call the superclass constructor
    this.seatNumber = seatNumber;
  }

  // Method to check reservation status including seat number
  @Override
  public void checkReservationStatus() {
    super.checkReservationStatus(); // Call the superclass method
    System.out.println("Seat Number: " + seatNumber);
  }

  // Method to modify reservation details including seat number
  public void modifyReservation(String newCustomerName, LocalDate newDate, int newSeatNumber) {
    super.modifyReservation(newCustomerName, newDate); // Call the superclass method
    this.seatNumber = newSeatNumber;
    System.out.println("Seat Number updated successfully.");
  }

  // Getter for the seat number
  public int getSeatNumber() {
    return seatNumber;
  }
}
// Import necessary classes for date handling

public class Main {
  public static void main(String[] args) {
    // Create a ResortReservation object
    ResortReservation resortReservation = new ResortReservation("RSV001", "Celestino Aspasia", LocalDate.now(),
        101);
    // Display the resort reservation details and status
    resortReservation.checkReservationStatus();
    System.out.println();

    // Modify the resort reservation details
    resortReservation.modifyReservation("Celestino Aspasia", LocalDate.of(2024, 6, 15), 102);
    resortReservation.checkReservationStatus();
    System.out.println();

    // Create a RailwayReservation object
    RailwayReservation railwayReservation = new RailwayReservation("RSV002", "John Paul Pythios", LocalDate.now(),
        22);
    // Display the railway reservation details and status
    railwayReservation.checkReservationStatus();
    System.out.println();

    // Modify the railway reservation details
    railwayReservation.modifyReservation("Bob Smith", LocalDate.of(2024, 6, 20), 23);
    railwayReservation.checkReservationStatus();
  }
}
