//Main.java
// Define the Main class
public class Main {
    // The main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of Athlete as a Person
        Person athlete = new Athlete();
        // Create an instance of LazyPerson as a Person
        Person lazyPerson = new LazyPerson();

        // Call the eat method on the athlete object
        athlete.eat();
        // Call the exercise method on the athlete object
        athlete.exercise();

        // Call the eat method on the lazyPerson object
        lazyPerson.eat();
        // Call the exercise method on the lazyPerson object
        lazyPerson.exercise();
    }
}

// LazyPerson.java
// Define a class named LazyPerson that extends the Person class
class LazyPerson extends Person {
    // Override the eat method from the Person class
    @Override
    public void eat() {
        // Print a message about the lazy person's eating habits
        System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
    }

    // Override the exercise method from the Person class
    @Override
    public void exercise() {
        // Print a message about the lazy person's exercise habits
        System.out.println("Couch Potato: Rarely exercising or being physically active.");
    }
}

// Athlete.java
// Define a class named Athlete that extends the Person class
class Athlete extends Person {
    // Override the eat method from the Person class
    @Override
    public void eat() {
        // Print a message about the athlete's diet
        System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
    }

    // Override the exercise method from the Person class
    @Override
    public void exercise() {
        // Print a message about the athlete's training
        System.out.println(
                "Athlete: Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
    }
}

// Person.java
// Define an abstract class named Person
abstract class Person {
    // Declare an abstract method eat
    public abstract void eat();

    // Declare an abstract method exercise
    public abstract void exercise();
}
