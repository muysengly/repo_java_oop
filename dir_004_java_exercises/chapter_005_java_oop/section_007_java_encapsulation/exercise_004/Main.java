// Main.java
// Main Class

public class Main {
  public static void main(String[] args) {
    // Create an instance of Employee
    Employee employee = new Employee();

    // Set values using setter methods
    employee.setEmployeeId(15);
    employee.setEmployeeName("Caelius Dathan");
    employee.setEmployeeSalary(4900.0);

    // Get values using getter methods
    int employeeId = employee.getEmployeeId();
    String employeeName = employee.getEmployeeName();
    String formattedSalary = employee.getFormattedSalary();

    // Print the values
    System.out.println("Employee Details:");
    System.out.println("ID: " + employeeId);
    System.out.println("Name: " + employeeName);
    System.out.println("Salary: " + formattedSalary);
  }
}
// Employee.java

// Employee Class
class Employee {
  // Declare a private int variable for employee_id
  private int employee_id;
  // Declare a private String variable for employee_name
  private String employee_name;
  // Declare a private double variable for employee_salary
  private double employee_salary;

  // Getter method for employee_id
  public int getEmployeeId() {
    return employee_id;
  }

  // Setter method for employee_id
  public void setEmployeeId(int employeeId) {
    this.employee_id = employeeId;
  }

  // Getter method for employee_name
  public String getEmployeeName() {
    return employee_name;
  }

  // Setter method for employee_name
  public void setEmployeeName(String employeeName) {
    this.employee_name = employeeName;
  }

  // Getter method for employee_salary
  public double getEmployeeSalary() {
    return employee_salary;
  }

  // Setter method for employee_salary
  public void setEmployeeSalary(double employeeSalary) {
    this.employee_salary = employeeSalary;
  }

  // Method to get formatted salary as a String
  public String getFormattedSalary() {
    return String.format("$%.2f", employee_salary);
  }
}
