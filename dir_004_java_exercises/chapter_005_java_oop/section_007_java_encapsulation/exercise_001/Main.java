// Main.java
// Main Class
public class Main {
  public static void main(String[] args) {
    // Create an instance of Person
    Person person = new Person();

    // Set values using setter methods
    person.setName("Arthfael Viktorija");
    person.setAge(25);
    person.setCountry("USA");

    // Get values using getter methods
    String name = person.getName();
    int age = person.getAge();
    String country = person.getCountry();

    // Print the values
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Country: " + country);
  }
}
// Person.java

// Person Class
class Person {
  // Private field to store the name of the person
  private String name;
  // Private field to store the age of the person
  private int age;
  // Private field to store the country of the person
  private String country;

  // Public method to get the name of the person
  public String getName() {
    return name;
  }

  // Public method to set the name of the person
  public void setName(String name) {
    this.name = name;
  }

  // Public method to get the age of the person
  public int getAge() {
    return age;
  }

  // Public method to set the age of the person
  public void setAge(int age) {
    this.age = age;
  }

  // Public method to get the country of the person
  public String getCountry() {
    return country;
  }

  // Public method to set the country of the person
  public void setCountry(String country) {
    this.country = country;
  }
}
