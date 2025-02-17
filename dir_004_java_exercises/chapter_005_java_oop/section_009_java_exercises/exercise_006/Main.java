//Employee.java
// Define the Employee class
class Employee {
    // Declare a private variable to store the name of the employee
    private String name;
    // Declare a private variable to store the job title of the employee
    private String jobTitle;
    // Declare a private variable to store the salary of the employee
    private double salary;

    // Constructor for the Employee class that initializes the name, job title, and
    // salary variables
    public Employee(String name, String jobTitle, double salary) {
        // Set the name variable to the provided name parameter
        this.name = name;
        // Set the jobTitle variable to the provided jobTitle parameter
        this.jobTitle = jobTitle;
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to retrieve the name of the employee
    public String getName() {
        // Return the value of the name variable
        return name;
    }

    // Method to set the name of the employee
    public void setName(String name) {
        // Set the name variable to the provided name parameter
        this.name = name;
    }

    // Method to retrieve the job title of the employee
    public String getJobTitle() {
        // Return the value of the jobTitle variable
        return jobTitle;
    }

    // Method to set the job title of the employee
    public void setJobTitle(String jobTitle) {
        // Set the jobTitle variable to the provided jobTitle parameter
        this.jobTitle = jobTitle;
    }

    // Method to retrieve the salary of the employee
    public double getSalary() {
        // Return the value of the salary variable
        return salary;
    }

    // Method to set the salary of the employee
    public void setSalary(double salary) {
        // Set the salary variable to the provided salary parameter
        this.salary = salary;
    }

    // Method to raise the salary of the employee by a given percentage
    public void raiseSalary(double percentage) {
        // Calculate the new salary by increasing the current salary by the given
        // percentage
        salary = salary + salary * percentage / 100;
    }

    // Method to print the details of the employee
    public void printEmployeeDetails() {
        // Print the name of the employee
        System.out.println("Name: " + name);
        // Print the job title of the employee
        System.out.println("Job Title: " + jobTitle);
        // Print the salary of the employee
        System.out.println("Salary: " + salary);
    }
}

// Main.java
// Define the Main class
public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {

        // Create an instance of the Employee class with the name "Franziska Waltraud",
        // job title "HR Manager", and salary 40000
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        // Create another instance of the Employee class with the name "Hubertus
        // Andrea", job title "Software Engineer", and salary 60000
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        // Print a heading for the employee details section
        System.out.println("\nEmployee Details:");
        // Print the details of employee1
        employee1.printEmployeeDetails();
        // Print the details of employee2
        employee2.printEmployeeDetails();

        // Raise the salary of employee1 by 8%
        employee1.raiseSalary(8);
        // Raise the salary of employee2 by 12%
        employee2.raiseSalary(12);

        // Print a heading indicating that the salaries have been raised
        System.out.println("\nAfter raising salary:");
        // Print a heading for the salary raise details of employee1
        System.out.println("\n8% for 'Franziska Waltraud':");
        // Print the updated details of employee1
        employee1.printEmployeeDetails();
        // Print a heading for the salary raise details of employee2
        System.out.println("\n12% for 'Hubertus Andrea':");
        // Print the updated details of employee2
        employee2.printEmployeeDetails();
    }
}
