import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // ប្រកាសអថេរទាំងស្រុងសម្រាប់រក្សាទុកទិន្នន័យពីអ្នកប្រើប្រាស់និងការប្តូរ
        // Declare integer variables for storing user input and swapping
        int x, y, z;
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Prompt the user to input the first number
        System.out.println("Input the 1st number: ");
        // អាននិងរក្សាទុកលេខទីមួយក្នុងអថេរ x
        // Read and store the first number in the variable x
        x = in.nextInt();

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Prompt the user to input the second number
        System.out.println("Input the 2nd number: ");
        // អាននិងរក្សាទុកលេខទីពីរនៅក្នុងអថេរ y
        // Read and store the second number in the variable y
        y = in.nextInt();

        // ប្តូរតម្លៃដោយប្រើអថេរបណ្តោះអាសន្ន 'z'
        // Perform the swap using a temporary variable 'z'
        // ប្តូរតម្លៃរវាង x និង y
        // Swap the values of x and y
        z = x;
        // រក្សាទុកតម្លៃនៃ y ទៅក្នុង x
        // Store the value of y in x
        x = y;
        // រក្សាទុកតម្លៃនៃ z ទៅក្នុង y
        // Store the value of z in y
        y = z;

        // បង្ហាញតម្លៃបន្ទាប់ពីប្តូរ
        // Display the swapped values
        System.out.println("Swapped values are: " + x + " and " + y);
        // បង្ហាញតម្លៃដែលបានប្តូរទៅកាន់ console
        // Display the swapped values to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class