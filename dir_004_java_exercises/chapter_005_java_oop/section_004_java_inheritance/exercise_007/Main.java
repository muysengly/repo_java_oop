// Main.java
// Main class

// Declare the Main class
public class Main {

    // Main method to execute the program
    public static void main(String[] args) {

        // Create an Employee object named employee1 with first name, last name,
        // employee ID, and job title
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");

        // Print the first name, last name with job title, and employee ID of employee1
        System.out
                .println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId()
                        + ")");

        // Create an Employee object named employee2 with first name, last name,
        // employee ID, and job title
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");

        // Print the first name, last name with job title, and employee ID of employee2
        System.out
                .println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId()
                        + ")");
    }
}
// Employee.java
// Child class Employee

// Declare the Employee class which extends the Person class
class Employee extends Person {

    // Private instance variable for employee ID
    private int employeeId;

    // Private instance variable for job title
    private String jobTitle;

    // Constructor for Employee class, taking first name, last name, employee ID,
    // and job title as parameters
    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        // Call the constructor of the superclass (Person) with first name and last name
        super(firstName, lastName);
        // Initialize the employeeId instance variable
        this.employeeId = employeeId;
        // Initialize the jobTitle instance variable
        this.jobTitle = jobTitle;
    }

    // Public method to get the employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Override the getLastName method from the superclass (Person)
    @Override
    public String getLastName() {
        // Return the last name from the superclass combined with the job title
        return super.getLastName() + ", " + jobTitle;
    }
}
// Person.java
// Parent class Person

// Define the Person class
class Person {
    // Private fields for first name and last name
    private String firstName;
    private String lastName;

    // Constructor to initialize first name and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to get the first name
    public String getFirstName() {
        return firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return lastName;
    }
}
