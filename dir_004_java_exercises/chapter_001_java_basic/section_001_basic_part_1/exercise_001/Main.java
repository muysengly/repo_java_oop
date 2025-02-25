import java.util.Scanner;
// នាំចូលថ្នាក់ Scanner
// Import the Scanner class

public class Main {
    // ប្រកាសថ្នាក់ Main
    // Declare the class Main

    public static void main(String[] args) {
        // ប្រកាស method main
        // Declare the main method

        // បង្កើតអង្គភាព Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // បង្កើតអង្គភាព Scanner
        // Create a Scanner object

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលឈ្មោះដំបូងរបស់ពួកគេ
        // Prompt the user to enter their first name
        System.out.print("Input your first name: ");
        String fname = input.next();
        // អានទិន្នន័យដែលអ្នកប្រើបញ្ចូល
        // Read the user's input

        // ស្នើសុំឱ្យអ្នកប្រើបញ្ចូលនាមត្រកូលរបស់ពួកគេ
        // Prompt the user to enter their last name
        System.out.print("Input your last name: ");
        String lname = input.next();
        // អានទិន្នន័យដែលអ្នកប្រើបញ្ចូល
        // Read the user's input

        // បង្ហាញសារស្វាគមន៍ជាមួយឈ្មោះពេញរបស់អ្នកប្រើ
        // Display a welcome message with the user's full name
        System.out.println();
        // បង្ហាញបន្ទាត់ថ្មី
        // Print a new line
        System.out.println("Hello \n" + fname + " " + lname);
        // បង្ហាញសារស្វាគមន៍
        // Print the welcome message

        // បិទអង្គភាព Scanner
        // Close the Scanner object
        input.close();
        // បិទ Scanner
        // Close the Scanner
    }
    // បិទ method main
    // Close the main method
}
// បិទថ្នាក់ Main
// Close the class Main
