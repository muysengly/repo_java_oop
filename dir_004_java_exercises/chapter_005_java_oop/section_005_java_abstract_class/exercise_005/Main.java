// Main.java
// Public class Main
public class Main {
  // Main method
  public static void main(String[] args) {
    // Creating an instance of Manager with name "Corona Cadogan", baseSalary 6000,
    // and bonus 1000
    Employee manager = new Manager("Corona Cadogan", 6000, 1000);
    // Creating an instance of Programmer with name "Antal Nuka", baseSalary 5000,
    // overtimeHours 20, and hourlyRate 25.0
    Employee programmer = new Programmer("Antal Nuka", 5000, 20, 25.0);

    // Calling displayInfo method on manager instance
    manager.displayInfo();
    // Printing a separator line
    System.out.println("---------------------");
    // Calling displayInfo method on programmer instance
    programmer.displayInfo();
  }
}

// Programmer.java
// Class Programmer extending the Employee class
class Programmer extends Employee {
  // Private variable to store overtime hours
  private int overtimeHours;
  // Private variable to store hourly rate
  private double hourlyRate;

  // Constructor to initialize name, baseSalary, overtimeHours, and hourlyRate
  public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
    // Calling the constructor of the superclass (Employee)
    super(name, baseSalary);
    // Setting the overtime hours
    this.overtimeHours = overtimeHours;
    // Setting the hourly rate
    this.hourlyRate = hourlyRate;
  }

  // Overriding the calculateSalary method
  @Override
  public double calculateSalary() {
    // Calculating the total salary by adding baseSalary and the product of
    // overtimeHours and hourlyRate
    return baseSalary + (overtimeHours * hourlyRate);
  }

  // Overriding the displayInfo method
  @Override
  public void displayInfo() {
    // Printing the programmer's name
    System.out.println("Programmer Name: " + name);
    // Printing the base salary
    System.out.println("Base Salary: $" + baseSalary);
    // Printing the overtime hours
    System.out.println("Overtime Hours: " + overtimeHours);
    // Printing the hourly rate
    System.out.println("Hourly Rate: $" + hourlyRate);
    // Printing the total salary
    System.out.println("Total Salary: $" + calculateSalary());
  }
}
// Manager.java
// Subclass Manager

// Define class Manager that extends Employee
class Manager extends Employee {
  // Declare private variable for bonus
  private double bonus;

  // Constructor to initialize name, base salary, and bonus
  public Manager(String name, double baseSalary, double bonus) {
    // Call superclass constructor to set name and base salary
    super(name, baseSalary);
    this.bonus = bonus; // Set the bonus
  }

  // Override the calculateSalary method from Employee
  @Override
  public double calculateSalary() {
    // Return the total salary (base salary + bonus)
    return baseSalary + bonus;
  }

  // Override the displayInfo method from Employee
  @Override
  public void displayInfo() {
    // Print the manager's name
    System.out.println("Manager Name: " + name);
    // Print the base salary
    System.out.println("Base Salary: $" + baseSalary);
    // Print the bonus
    System.out.println("Bonus: $" + bonus);
    // Print the total salary
    System.out.println("Total Salary: $" + calculateSalary());
  }
}
// Employee.java
// Abstract class Employee

// Define abstract class Employee
abstract class Employee {
  // Declare protected variables for name and base salary
  protected String name;
  protected double baseSalary;

  // Constructor to initialize name and base salary
  public Employee(String name, double baseSalary) {
    this.name = name; // Set the name
    this.baseSalary = baseSalary; // Set the base salary
  }

  // Declare abstract method to calculate salary
  public abstract double calculateSalary();

  // Declare abstract method to display employee information
  public abstract void displayInfo();
}
