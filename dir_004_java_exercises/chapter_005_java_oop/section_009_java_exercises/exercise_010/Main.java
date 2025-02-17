
// Student.java
// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Student class
class Student {

  // Declare a private variable to store the name of the student
  private String name;

  // Declare a private variable to store the grade of the student
  private int grade;

  // Declare a private ArrayList to store the courses of the student
  private ArrayList courses;

  // Constructor for the Student class
  public Student(String name, int grade) {
    // Initialize the name of the student
    this.name = name;

    // Initialize the grade of the student
    this.grade = grade;

    // Initialize the courses ArrayList
    this.courses = new ArrayList();
  }

  // Method to get the name of the student
  public String getName() {
    // Return the name of the student
    return name;
  }

  // Method to get the grade of the student
  public int getGrade() {
    // Return the grade of the student
    return grade;
  }

  // Method to get the courses of the student
  public ArrayList getCourses() {
    // Return the courses ArrayList
    return courses;
  }

  // Method to add a course to the student's course list
  public void addCourse(String course) {
    // Add the given course to the courses ArrayList
    courses.add(course);
  }

  // Method to remove a course from the student's course list
  public void removeCourse(String course) {
    // Remove the given course from the courses ArrayList
    courses.remove(course);
  }

  // Method to print the details of the student
  public void printStudentDetails() {
    // Print the name of the student
    System.out.println("Name: " + name);

    // Print the grade of the student
    System.out.println("Grade: " + grade);
  }
}
// Main.java

// Define the Main class
public class Main {

  // Main method, the entry point of the Java application
  public static void main(String[] args) {

    // Create a new Student object named student1 with name "Carolus Vitali" and
    // grade 11
    Student student1 = new Student("Carolus Vitali", 11);

    // Create a new Student object named student2 with name "Nakeisha Uhuru" and
    // grade 10
    Student student2 = new Student("Nakeisha Uhuru", 10);

    // Create a new Student object named student3 with name "Gabriella Cherice" and
    // grade 10
    Student student3 = new Student("Gabriella Cherice", 10);

    // Print a header for student details
    System.out.println("Student Details:");

    // Print the details of student1
    student1.printStudentDetails();

    // Print the details of student2
    student2.printStudentDetails();

    // Print the details of student3
    student3.printStudentDetails();

    // Print a message indicating courses are being added for student1
    System.out.println("Adding courses for " + student1.getName());

    // Add the course "Math" to student1's courses
    student1.addCourse("Math");

    // Add the course "Science" to student1's courses
    student1.addCourse("Science");

    // Add the course "English" to student1's courses
    student1.addCourse("English");

    // Print student1's name and their list of courses
    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

    // Print a message indicating courses are being added for student2
    System.out.println("\nAdding courses for " + student2.getName());

    // Add the course "History" to student2's courses
    student2.addCourse("History");

    // Add the course "Geography" to student2's courses
    student2.addCourse("Geography");

    // Add the course "English" to student2's courses
    student2.addCourse("English");

    // Print student2's name and their list of courses
    System.out.println(student2.getName() + "'s courses: " + student2.getCourses());

    // Print a message indicating the course "Science" is being removed for student1
    System.out.println("\nRemoving 'Science' course for " + student1.getName());

    // Remove the course "Science" from student1's courses
    student1.removeCourse("Science");

    // Print student1's name and their updated list of courses
    System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
  }
}
