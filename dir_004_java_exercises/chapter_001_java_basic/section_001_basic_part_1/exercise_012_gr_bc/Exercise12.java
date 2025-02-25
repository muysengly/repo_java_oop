import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Exercise12 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise12
    // Declares a public class named Exercise12

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ថ្មី សម្រាប់អានទិន្នន័យពី console
        // Creates a new Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Prompt the user to input the first number
        System.out.print("Input first number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Displays a message on the console asking the user to input the first number

        // អាននិងរក្សាទុកលេខទីមួយ
        // Read and store the first number
        int num1 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num1
        // Reads an integer from the console and stores it in the variable num1

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Prompt the user to input the second number
        System.out.print("Input second number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Displays a message on the console asking the user to input the second number

        // អាននិងរក្សាទុកលេខទីពីរ
        // Read and store the second number
        int num2 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num2
        // Reads an integer from the console and stores it in the variable num2

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីបី
        // Prompt the user to input the third number
        System.out.print("Input third number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីបី
        // Displays a message on the console asking the user to input the third number

        // អាននិងរក្សាទុកលេខទីបី
        // Read and store the third number
        int num3 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num3
        // Reads an integer from the console and stores it in the variable num3

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីបួន
        // Prompt the user to input the fourth number
        System.out.print("Input fourth number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីបួន
        // Displays a message on the console asking the user to input the fourth number

        // អាននិងរក្សាទុកលេខទីបួន
        // Read and store the fourth number
        int num4 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num4
        // Reads an integer from the console and stores it in the variable num4

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីប្រាំ
        // Prompt the user to input the fifth number
        System.out.print("Enter fifth number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីប្រាំ
        // Displays a message on the console asking the user to input the fifth number

        // អាននិងរក្សាទុកលេខទីប្រាំ
        // Read and store the fifth number
        int num5 = in.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ num5
        // Reads an integer from the console and stores it in the variable num5

        // គណនានិងបង្ហាញមធ្យមនៃលេខទាំងប្រាំ
        // Calculate and print the average of the five numbers
        System.out.println("Average of five numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5);
        // បង្ហាញមធ្យមនៃលេខទាំងប្រាំទៅកាន់ console
        // Prints the average of the five numbers to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise12
// Closes the Exercise12 class