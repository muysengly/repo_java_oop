
// Importing the Scanner class to read input from the user
import java.util.Scanner;

// Defining the Student class to represent student information
class Student {
    // Instance variables to store student name, ID, and score
    String name;
    String stu_id;
    int score;

    // Default constructor with default values
    public Student() {
        this(" ", " ", 0);
    }

    // Parameterized constructor to initialize instance variables with given values
    public Student(String initName, String initId, int initScore) {
        name = initName;
        stu_id = initId;
        score = initScore;
    }
}

// Main class named "Main"
public class Main {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompting the user to input the number of students
        System.out.println("Input number of students:");

        // Reading the number of students from the user and trimming excess whitespaces
        int n = Integer.parseInt(in.nextLine().trim());

        // Prompting the user to input Student Name, ID, Score
        System.out.println("Input Student Name, ID, Score:");

        // Creating Student objects to store information about the students
        Student stu = new Student();
        Student max = new Student();
        Student min = new Student(" ", " ", 100);

        // Loop to read information about each student
        for (int i = 0; i < n; i++) {
            // Reading student name, ID, and score from the user
            stu.name = in.next();
            stu.stu_id = in.next();
            stu.score = in.nextInt();

            // Checking if the current student has the highest score
            if (max.score < stu.score) {
                max.name = stu.name;
                max.stu_id = stu.stu_id;
                max.score = stu.score;
            }

            // Checking if the current student has the lowest score
            if (min.score > stu.score) {
                min.name = stu.name;
                min.stu_id = stu.stu_id;
                min.score = stu.score;
            }
        }

        // Printing the name and ID of the highest score and the lowest score students
        System.out.println("name, ID of the highest score and the lowest score:");
        System.out.println(max.name + " " + max.stu_id);
        System.out.println(min.name + " " + min.stu_id);

        // Closing the Scanner to release system resources
        in.close();
    }
}
