// Outer class School
public class School {
    // Static nested class Student
    static class Student {
        // Instance variables for student's name and grade
        String name;
        String grade;

        // Constructor for Student class
        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        // Non-static method to display student information
        void displayStudentInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    // Main method to demonstrate creating an instance of the static nested class
    public static void main(String[] args) {
        // Creating an instance of the static nested class Student
        School.Student student = new School.Student("Julius Helga", "A");

        // Calling the displayStudentInfo method to print student details
        student.displayStudentInfo();
    }
}
