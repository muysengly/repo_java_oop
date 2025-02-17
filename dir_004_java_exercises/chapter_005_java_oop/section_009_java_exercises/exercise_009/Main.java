
// Employee.java
// Import the LocalDate class from the java.time package
import java.time.LocalDate;

// Import the Period class from the java.time package
import java.time.Period;

// Define the Employee class
class Employee {

  // Declare a private variable to store the name of the employee
  private String name;

  // Declare a private variable to store the salary of the employee
  private double salary;

  // Declare a private variable to store the hire date of the employee
  private LocalDate hireDate;

  // Constructor for the Employee class
  public Employee(String name, double salary, LocalDate hireDate) {
    // Initialize the name of the employee
    this.name = name;

    // Initialize the salary of the employee
    this.salary = salary;

    // Initialize the hire date of the employee
    this.hireDate = hireDate;
  }

  // Method to get the name of the employee
  public String getName() {
    // Return the name of the employee
    return name;
  }

  // Method to set the name of the employee
  public void setName(String name) {
    // Update the name variable to the new value
    this.name = name;
  }

  // Method to get the salary of the employee
  public double getSalary() {
    // Return the salary of the employee
    return salary;
  }

  // Method to set the salary of the employee
  public void setSalary(double salary) {
    // Update the salary variable to the new value
    this.salary = salary;
  }

  // Method to get the hire date of the employee
  public LocalDate getHireDate() {
    // Return the hire date of the employee
    return hireDate;
  }

  // Method to set the hire date of the employee
  public void setHireDate(LocalDate hireDate) {
    // Update the hire date variable to the new value
    this.hireDate = hireDate;
  }

  // Method to calculate the years of service of the employee
  public int getYearsOfService() {
    // Calculate the period between the hire date and the current date, and return
    // the number of years
    return Period.between(hireDate, LocalDate.now()).getYears();
  }

  // Method to print the details of the employee
  public void printEmployeeDetails() {
    // Print the name of the employee
    System.out.println("\nName: " + name);

    // Print the salary of the employee
    System.out.println("Salary: " + salary);

    // Print the hire date of the employee
    System.out.println("Hire Date: " + hireDate);
  }
}
// Main.java
// Import the LocalDate class from the java.time package
// import java.time.LocalDate;

// Define the Main class
public class Main {

  // Main method, the entry point of the Java application
  public static void main(String[] args) {

    // Create a new Employee object named employee1 with name "Roberta Petrus",
    // salary 50000, and hire date "2021-04-01"
    Employee employee1 = new Employee("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));

    // Create a new Employee object named employee2 with name "Loyd Blair", salary
    // 70000, and hire date "2015-04-01"
    Employee employee2 = new Employee("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));

    // Create a new Employee object named employee3 with name "Magdalena Artemon",
    // salary 50000, and hire date "2011-01-15"
    Employee employee3 = new Employee("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));

    // Print the details of employee1
    employee1.printEmployeeDetails();

    // Print the years of service of employee1
    System.out.println("Years of Service: " + employee1.getYearsOfService());

    // Print the details of employee2
    employee2.printEmployeeDetails();

    // Print the years of service of employee2
    System.out.println("Years of Service: " + employee2.getYearsOfService());

    // Print the details of employee3
    employee3.printEmployeeDetails();

    // Print the years of service of employee3
    System.out.println("Years of Service: " + employee3.getYearsOfService());
  }
}
