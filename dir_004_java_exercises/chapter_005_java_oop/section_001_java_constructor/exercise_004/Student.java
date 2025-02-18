// Define the Student class
public class Student {
    // Private instance variables
    private int studentId;
    private String studentName;
    private String grade;

    // Default constructor
    public Student() {
        // Call the parameterized constructor with default values
        this(0, "Unknown", "None");
    }

    // Parameterized constructor
    public Student(int studentId, String studentName, String grade) {
        // Initialize studentId with the provided parameter
        this.studentId = studentId;
        // Initialize studentName with the provided parameter
        this.studentName = studentName;
        // Initialize grade with the provided parameter
        this.grade = grade;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentId);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 Grade: " + student1.grade);

        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", "A");
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.studentId);
        System.out.println("Student2 Name: " + student2.studentName);
        System.out.println("Student2 Grade: " + student2.grade);
    }
}
