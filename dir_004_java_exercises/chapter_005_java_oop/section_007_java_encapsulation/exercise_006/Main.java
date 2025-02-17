// Main.java
// Main Class

public class Main {
  public static void main(String[] args) {
    // Create an instance of Car
    Car car = new Car();

    // Set the values using the setter methods
    car.setCompany_name("Chevrolet");
    car.setModel_name("Cruze");
    car.setYear(2009);
    // mileage is not set using the setter method

    // Get the values using the getter methods
    String company_name = car.getCompany_name();
    String model_name = car.getModel_name();
    int year = car.getYear();
    double mileage = car.getMileage();

    // Print the values
    System.out.println("Company Name: " + company_name);
    System.out.println("Model Name: " + model_name);
    System.out.println("Year: " + year);
    System.out.println("Mileage: " + mileage);
  }
}
// Car.java

// Car Class
class Car {
  // Declare a private String variable for the company name
  private String company_name;

  // Declare a private String variable for the model name
  private String model_name;

  // Declare a private int variable for the year
  private int year;

  // Declare a private double variable for the mileage
  private double mileage;

  // Getter method for company_name
  public String getCompany_name() {
    return company_name;
  }

  // Setter method for company_name
  public void setCompany_name(String company_name) {
    this.company_name = company_name;
  }

  // Getter method for model_name
  public String getModel_name() {
    return model_name;
  }

  // Setter method for model_name
  public void setModel_name(String model_name) {
    this.model_name = model_name;
  }

  // Getter method for year
  public int getYear() {
    return year;
  }

  // Setter method for year
  public void setYear(int year) {
    this.year = year;
  }

  // Getter method for mileage
  public double getMileage() {
    return mileage;
  }
}
