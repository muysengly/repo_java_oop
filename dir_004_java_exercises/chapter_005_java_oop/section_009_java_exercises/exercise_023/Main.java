// Define the Course class
class Course {
  // Attributes for the course name, instructor, and credits
  private String courseName;
  private String instructor;
  private int credits;

  // Constructor to initialize the Course object
  public Course(String courseName, String instructor, int credits) {
    this.courseName = courseName;
    this.instructor = instructor;
    this.credits = credits;
  }

  // Method to display course details
  public void displayCourseDetails() {
    System.out.println("Course Name: " + courseName);
    System.out.println("Instructor: " + instructor);
    System.out.println("Credits: " + credits);
  }

  // Getter for course name
  public String getCourseName() {
    return courseName;
  }

  // Getter for instructor
  public String getInstructor() {
    return instructor;
  }

  // Getter for credits
  public int getCredits() {
    return credits;
  }
}

// Define the OnlineCourse subclass that extends the Course class
class OnlineCourse extends Course {
  // Additional attributes for the platform and duration
  private String platform;
  private int duration; // duration in hours

  // Constructor to initialize the OnlineCourse object
  public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
    super(courseName, instructor, credits); // Call the superclass constructor
    this.platform = platform;
    this.duration = duration;
  }

  // Method to display course details, including platform and duration
  @Override
  public void displayCourseDetails() {
    super.displayCourseDetails(); // Call the superclass method to display common details
    System.out.println("Platform: " + platform);
    System.out.println("Duration: " + duration + " hours");
  }

  // Method to check if the course is eligible for a certificate based on duration
  public boolean isEligibleForCertificate() {
    // Assume that a course is eligible for a certificate if its duration is at
    // least 10 hours
    return duration >= 10;
  }

  // Getter for platform
  public String getPlatform() {
    return platform;
  }

  // Getter for duration
  public int getDuration() {
    return duration;
  }
}

// Main class to test the Course and OnlineCourse classes
public class Main {
  public static void main(String[] args) {
    // Create a Course object
    Course course = new Course("Java Programming", "Dr. Timaios Pliny", 4);
    course.displayCourseDetails();
    System.out.println();

    // Create an OnlineCourse object
    OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", "Prof. Isacco Lyuba", 4, "Google", 10);
    onlineCourse.displayCourseDetails();
    System.out.println("Eligible for Certificate: " + onlineCourse.isEligibleForCertificate());
  }
}
