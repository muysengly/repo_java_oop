import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Exercise7 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise7
    // Declares a public class named Exercise7

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ថ្មី សម្រាប់អានទិន្នន័យពី console
        // Creates a new Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខមួយ
        // Prompt the user to input a number
        System.out.print("Input a number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខមួយ
        // Displays a message on the console asking the user to input a number

        // អាននិងរក្សាទុកលេខដែលបានបញ្ចូល
        // Read and store the input number
        int num1 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num1
        // Reads an integer from the console and stores it in the variable num1

        // ប្រើរង្វិលដើម្បីគណនានិងបង្ហាញតារាងគុណសម្រាប់លេខដែលបានបញ្ចូល
        // Use a loop to calculate and print the multiplication table for the input
        // number
        for (int i = 0; i < 10; i++) {
            // គណនានិងបង្ហាញលទ្ធផលនៃ num1 គុណនឹង (i+1)
            // Calculate and print the result of num1 multiplied by (i+1)
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            // បង្ហាញលទ្ធផលនៃ num1 គុណនឹង (i+1) ទៅកាន់ console
            // Displays the result of num1 multiplied by (i+1) to the console
        }
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise7
// Closes the Exercise7 class