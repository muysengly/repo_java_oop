// Define the Pet class
class Pet {
  // Attributes for the Pet class
  String name;
  String species;
  int age;

  // Constructor for the Pet class
  public Pet(String name, String species, int age) {
    this.name = name;
    this.species = species;
    this.age = age;
  }

  // Method to display pet details
  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Species: " + species);
    System.out.println("Age: " + age + " years");
  }

  // Method to calculate pet's age in human years
  public int calculateHumanAge() {
    if (species.equals("Dog")) {
      return age * 7;
    } else {
      // Assuming bird's age in human years is the same as actual age
      return age;
    }
  }
}

// Define the Dog class that extends Pet
class Dog extends Pet {
  // Additional attribute for Dog
  String favoriteToy;

  // Constructor for the Dog class
  public Dog(String name, int age, String favoriteToy) {
    super(name, "Dog", age); // Call the constructor of the superclass
    this.favoriteToy = favoriteToy;
  }

  // Override the displayDetails method to include favorite toy
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Favorite Toy: " + favoriteToy);
  }
}

// Define the Bird class that extends Pet
class Bird extends Pet {
  // Additional attribute for Bird
  double wingSpan;

  // Constructor for the Bird class
  public Bird(String name, int age, double wingSpan) {
    super(name, "Bird", age); // Call the constructor of the superclass
    this.wingSpan = wingSpan;
  }

  // Override the displayDetails method to include wing span
  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Wing Span: " + wingSpan + " meters");
  }
}

// Main class to test the Pet, Dog, and Bird classes
public class Main {
  public static void main(String[] args) {
    // Create an instance of Dog
    Dog dog = new Dog("Cooper", 3, "Ball");

    // Create an instance of Bird
    Bird bird = new Bird("Pelican", 2, 0.5);

    // Display details of the dog
    System.out.println("Dog Details:");
    dog.displayDetails();
    System.out.println("Dog's age in human years: " + dog.calculateHumanAge());

    // Display details of the bird
    System.out.println("\nBird Details:");
    bird.displayDetails();
    System.out.println("Bird's age in human years: " + bird.calculateHumanAge());
  }
}
