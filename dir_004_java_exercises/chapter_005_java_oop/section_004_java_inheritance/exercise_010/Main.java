
// Public class declaration for Main
public class Main {
  // Main method
  public static void main(String[] args) {
    // Creating an instance of Manager
    Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
    // Creating an instance of Developer
    Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
    // Creating an instance of Programmer
    Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

    // Printing the manager's bonus
    System.out.println("Manager's Bonus: $" + manager.calculateBonus());
    // Printing the developer's bonus
    System.out.println("Developer's Bonus: $" + developer.calculateBonus());
    // Printing the programmer's bonus
    System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());

    // Printing the manager's performance report
    System.out.println(manager.generatePerformanceReport());
    // Printing the developer's performance report
    System.out.println(developer.generatePerformanceReport());
    // Printing the programmer's performance report
    System.out.println(programmer.generatePerformanceReport());

    // Manager managing a project
    manager.manageProject();
    // Developer writing code
    developer.writeCode();
    // Programmer debugging code
    programmer.debugCode();
  }
}

// Class declaration for Developer which extends Employee
class Developer extends Employee {
  // Private field for the programming language
  private String programmingLanguage;

  // Constructor for the Developer class
  public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
    // Calling the constructor of the superclass Employee
    super(name, address, salary, jobTitle);
    // Initializing the programmingLanguage field
    this.programmingLanguage = programmingLanguage;
  }

  // Getter method for the programmingLanguage field
  public String getProgrammingLanguage() {
    return programmingLanguage;
  }

  // Overridden method to calculate the bonus for the developer
  @Override
  public double calculateBonus() {
    // Custom implementation for bonus calculation for developers
    return getSalary() * 0.10;
  }

  // Overridden method to generate the performance report for the developer
  @Override
  public String generatePerformanceReport() {
    // Custom implementation for performance report for developers
    return "Performance report for Developer " + getName() + ": Good";
  }

  // Custom method for writing code
  public void writeCode() {
    // Printing a message indicating the developer is writing code
    System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
  }
}

// Class declaration for Employee
class Employee {
  // Private fields for the Employee class
  private String name;
  private String address;
  private double salary;
  private String jobTitle;

  // Constructor for the Employee class
  public Employee(String name, String address, double salary, String jobTitle) {
    // Initializing the name field
    this.name = name;
    // Initializing the address field
    this.address = address;
    // Initializing the salary field
    this.salary = salary;
    // Initializing the jobTitle field
    this.jobTitle = jobTitle;
  }

  // Getter method for the name field
  public String getName() {
    return name;
  }

  // Getter method for the address field
  public String getAddress() {
    return address;
  }

  // Getter method for the salary field
  public double getSalary() {
    return salary;
  }

  // Getter method for the jobTitle field
  public String getJobTitle() {
    return jobTitle;
  }

  // Method to calculate the bonus for the employee
  public double calculateBonus() {
    // Default implementation for bonus calculation
    return 0.0;
  }

  // Method to generate the performance report for the employee
  public String generatePerformanceReport() {
    // Default implementation for performance report
    return "No performance report available.";
  }
}

// Class declaration for Manager which extends Employee
class Manager extends Employee {
  // Private field for the number of subordinates
  private int numberOfSubordinates;

  // Constructor for the Manager class
  public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
    // Calling the constructor of the superclass Employee
    super(name, address, salary, jobTitle);
    // Initializing the numberOfSubordinates field
    this.numberOfSubordinates = numberOfSubordinates;
  }

  // Getter method for the numberOfSubordinates field
  public int getNumberOfSubordinates() {
    return numberOfSubordinates;
  }

  // Overridden method to calculate the bonus for the manager
  @Override
  public double calculateBonus() {
    // Custom implementation for bonus calculation for managers
    return getSalary() * 0.15;
  }

  // Overridden method to generate the performance report for the manager
  @Override
  public String generatePerformanceReport() {
    // Custom implementation for performance report for managers
    return "Performance report for Manager " + getName() + ": Excellent";
  }

  // Custom method for managing projects
  public void manageProject() {
    // Printing a message indicating the manager is managing a project
    System.out.println("Manager " + getName() + " is managing a project.");
  }
}

// Class declaration for Programmer which extends Developer
class Programmer extends Developer {
  // Constructor for the Programmer class
  public Programmer(String name, String address, double salary, String programmingLanguage) {
    // Calling the constructor of the superclass Developer
    super(name, address, salary, "Programmer", programmingLanguage);
  }

  // Overridden method to calculate the bonus for the programmer
  @Override
  public double calculateBonus() {
    // Custom implementation for bonus calculation for programmers
    return getSalary() * 0.12;
  }

  // Overridden method to generate the performance report for the programmer
  @Override
  public String generatePerformanceReport() {
    // Custom implementation for performance report for programmers
    return "Performance report for Programmer " + getName() + ": Excellent";
  }

  // Custom method for debugging code
  public void debugCode() {
    // Printing a message indicating the programmer is debugging code
    System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
  }
}
