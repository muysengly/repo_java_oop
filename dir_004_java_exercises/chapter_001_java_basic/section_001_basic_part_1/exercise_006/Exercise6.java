import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Exercise6 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise6
    // Declares a public class named Exercise6

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

        // គណនានិងបង្ហាញផលបូកនៃលេខទាំងពីរ
        // Calculate and print the sum of the two numbers
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        // បង្ហាញលទ្ធផលនៃការបូក num1 និង num2 ទៅកាន់ console
        // Prints the result of adding num1 and num2 to the console

        // គណនានិងបង្ហាញផលដកនៃលេខទាំងពីរ
        // Calculate and print the difference of the two numbers
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        // បង្ហាញលទ្ធផលនៃការដក num1 និង num2 ទៅកាន់ console
        // Prints the result of subtracting num2 from num1 to the console

        // គណនានិងបង្ហាញផលគុណនៃលេខទាំងពីរ
        // Calculate and print the product of the two numbers
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        // បង្ហាញលទ្ធផលនៃការគុណ num1 និង num2 ទៅកាន់ console
        // Prints the result of multiplying num1 and num2 to the console

        // គណនានិងបង្ហាញផលចែកនៃលេខទាំងពីរ
        // Calculate and print the division of the two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        // បង្ហាញលទ្ធផលនៃការចែក num1 និង num2 ទៅកាន់ console
        // Prints the result of dividing num1 by num2 to the console

        // គណនានិងបង្ហាញសំណល់នៃការចែកនៃលេខទាំងពីរ
        // Calculate and print the remainder of the division of the two numbers
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
        // បង្ហាញលទ្ធផលនៃសំណល់ការចែក num1 និង num2 ទៅកាន់ console
        // Prints the result of the remainder of dividing num1 by num2 to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise6
// Closes the Exercise6 class