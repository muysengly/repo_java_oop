import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Main {
    // កំណត់ class Main
    // Defines the Main class

    public static void main(String[] args) {
        // កំណត់ method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Defines the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ថ្មី សម្រាប់អានទិន្នន័យពី console
        // Creates a new Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Prompt the user to input the first number
        System.out.print("Input the first number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Displays a message on the console asking the user to input the first number

        // អាននិងរក្សាទុកលេខទីមួយ
        // Read and store the first number
        int a = input.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ a
        // Reads an integer from the console and stores it in the variable a

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Prompt the user to input the second number
        System.out.print("Input the second number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Displays a message on the console asking the user to input the second number

        // អាននិងរក្សាទុកលេខទីពីរ
        // Read and store the second number
        int b = input.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ b
        // Reads an integer from the console and stores it in the variable b

        // គណនាការចែក a និង b
        // Calculate the division of a and b
        int d = (a / b);
        // គណនា a ចែកនឹង b ហើយរក្សាទុកលទ្ធផលក្នុងអថេរ d
        // Calculates a divided by b and stores the result in the variable d

        // បង្ហាញបន្ទាត់ទទេមួយសម្រាប់បំបែក
        // Display a blank line for separation
        System.out.println();
        // បង្ហាញបន្ទាត់ទទេមួយនៅលើ console
        // Displays a blank line on the console

        // បង្ហាញលទ្ធផលនៃការចែក
        // Display the result of the division
        System.out.println("The division of a and b is: " + d);
        // បង្ហាញលទ្ធផលនៃការចែកនៅលើ console
        // Displays the result of the division on the console
    }
}