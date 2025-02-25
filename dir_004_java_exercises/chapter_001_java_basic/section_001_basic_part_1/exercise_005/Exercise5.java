import java.util.Scanner;
// នាំចូលថ្នាក់ Scanner
// Import the Scanner class

public class Exercise5 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise5
    // Declare a public class named Exercise5

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្កើតអង្គភាព Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើ
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលលេខទីមួយ
        // Prompt the user to enter the first number
        System.out.print("Input first number: ");

        // អាននិងរក្សាទុកលេខទីមួយ
        // Read and store the first number
        int num1 = in.nextInt();

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលលេខទីពីរ
        // Prompt the user to enter the second number
        System.out.print("Input second number: ");

        // អាននិងរក្សាទុកលេខទីពីរ
        // Read and store the second number
        int num2 = in.nextInt();

        // គណនាផលគុណនៃលេខទាំងពីរ និងបង្ហាញលទ្ធផល
        // Calculate the product of the two numbers and display the result
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
    // បិទ method main
    // Close the main method
}
// បិទថ្នាក់ Exercise5
// Close the Exercise5 class