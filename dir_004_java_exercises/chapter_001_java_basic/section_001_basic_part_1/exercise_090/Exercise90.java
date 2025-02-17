import java.lang.*;

public class Exercise90 {
    public static void main(String[] args) {
        // Display the value of the specified environment variable "PATH"
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));

        // Display the value of the specified environment variable "TEMP"
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));

        // Display the value of the specified environment variable "USERNAME"
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
    }
}
