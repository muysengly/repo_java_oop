package dir_004_java_exercises.chapter_001_java_basic.section_001_basic_part_1.exercise_012_gr_bc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize variables for sum and counting
        double num = 0;
        double x = 1;

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input the number (n) for which to calculate the average
        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();

        // Use a loop to collect n numbers and calculate their sum
        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            num += sc.nextInt();
            x += 1;
        }

        // Calculate the average of the collected numbers
        double avgn = (num / n);

        // Display the calculated average
        System.out.println("Average: " + avgn);
    }
}
