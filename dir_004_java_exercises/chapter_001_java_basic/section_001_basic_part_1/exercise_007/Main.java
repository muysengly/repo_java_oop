import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

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
        System.out.println("Input the Number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខមួយ
        // Displays a message on the console asking the user to input a number

        // អាននិងរក្សាទុកលេខដែលបានបញ្ចូល
        // Read and store the input number
        int n = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ n
        // Reads an integer from the console and stores it in the variable n

        // ប្រើរង្វិលដើម្បីបង្កើតនិងបង្ហាញតារាងគុណសម្រាប់លេខដែលបានបញ្ចូល
        // Use a loop to generate and print the multiplication table for the input
        // number
        for (int i = 1; i <= 10; i++) {
            // គណនានិងបង្ហាញលទ្ធផលនៃ n គុណនឹង i
            // Calculate and print the result of n multiplied by i
            System.out.println(n + "*" + i + " = " + (n * i));
            // បង្ហាញលទ្ធផលនៃ n គុណនឹង i ទៅកាន់ console
            // Displays the result of n multiplied by i to the console
        }
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class