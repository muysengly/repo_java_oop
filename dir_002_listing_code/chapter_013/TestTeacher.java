import java.util.Date;

public class TestTeacher {
  public static void main(String[] args) {
    new TestTeacher();
  }

  public TestTeacher() {
    record Teacher(String name, Date birthDate, double weight) {};
    Teacher teacher1 = new Teacher("Ashley", new java.util.Date(), 7.5);
    Teacher teacher2 = new Teacher("Gabriel", new java.util.Date(), 8.5);
    System.out.println(teacher1.name()); // Display teacher1's name
    System.out.println(teacher1.birthDate());
    System.out.println(teacher1.weight());
    System.out.println(teacher1);
    System.out.println(teacher1.equals(teacher2));
  }
}