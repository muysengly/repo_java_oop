import java.util.Scanner;
// នាំចូលថ្នាក់ Scanner ពីកញ្ចប់ java.util ដើម្បីអានទិន្នន័យពីអ្នកប្រើ
// Import the Scanner class from the java.util package to read user input

public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declare a public class named Main
    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, which is the entry point of the program

        // បង្កើតអង្គភាព Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើ
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលលេខទីមួយ
        // Prompt the user to enter the first number
        System.out.print("Input the 1st number: ");

        // អាននិងរក្សាទុកលេខទីមួយ
        // Read and store the first number
        int num1 = input.nextInt();

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលលេខទីពីរ
        // Prompt the user to enter the second number
        System.out.print("Input the 2nd number: ");

        // អាននិងរក្សាទុកលេខទីពីរ
        // Read and store the second number
        int num2 = input.nextInt();

        // គណនាផលបូកនៃលេខទាំងពីរ
        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // បង្ហាញបន្ទាត់ទទេមួយសម្រាប់ការបំបែក
        // Print an empty line for separation
        System.out.println();

        // បង្ហាញផលបូកនៃលេខទាំងពីរ
        // Display the sum of the two numbers
        System.out.println("                 Sum: " + sum);
    }
    // បិទ method main
    // Close the main method
}
// បិទថ្នាក់ Main
// Close the Main class
