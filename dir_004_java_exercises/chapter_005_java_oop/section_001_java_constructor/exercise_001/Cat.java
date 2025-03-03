
// Define the Cat class
public class Cat {
    // Private instance variables
    private String name;
    private int age;

    // Default constructor
    public Cat() {
        // Initialize name to "Unknown"
        this.name = "Mew Mew";
        // Initialize age to 0
        this.age = 1;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();

        // Use the getter methods to access private variables
        System.out.println("Cat's Name: " + myCat.getName());

    }
}
