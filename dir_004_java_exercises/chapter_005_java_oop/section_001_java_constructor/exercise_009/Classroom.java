// Define the Classroom class
public class Classroom {
    // Private instance variables
    private String className;
    private String[] students;

    // Parameterized constructor that initializes className and students
    public Classroom(String className, String[] students) {
        // Initialize instance variables with provided parameters
        this.className = className;
        this.students = students;
    }

    // Method to print the values of className and students
    public void printClassroom() {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

    // Main method to test the Classroom class
    public static void main(String[] args) {
        // Create an array of student names
        String[] studentArray = { "Andrine", "Ruslan", "Martin" };
        // Create a Classroom object using the parameterized constructor
        Classroom classroom = new Classroom("Science 101", studentArray);
        // Print the values of the instance variables
        classroom.printClassroom();
    }
}
