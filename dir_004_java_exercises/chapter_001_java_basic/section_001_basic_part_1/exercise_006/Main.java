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
        Scanner scanner = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ថ្មី សម្រាប់អានទិន្នន័យពី console
        // Creates a new Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Prompt the user to input the first number
        System.out.println("Input the first number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីមួយ
        // Displays a message on the console asking the user to input the first number

        // អាននិងរក្សាទុកលេខទីមួយ
        // Read and store the first number
        int n1 = scanner.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ n1
        // Reads an integer from the console and stores it in the variable n1

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Prompt the user to input the second number
        System.out.println("Input the second number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទីពីរ
        // Displays a message on the console asking the user to input the second number

        // អាននិងរក្សាទុកលេខទីពីរ
        // Read and store the second number
        int n2 = scanner.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ n2
        // Reads an integer from the console and stores it in the variable n2

        // គណនានិងបង្ហាញផលបូកនៃលេខទាំងពីរ
        // Calculate the sum of the two numbers
        int sum = n1 + n2;
        // គណនានិងរក្សាទុកផលបូកនៃ n1 និង n2 ក្នុងអថេរ sum
        // Calculates and stores the sum of n1 and n2 in the variable sum

        // គណនានិងបង្ហាញផលដកនៃលេខទាំងពីរ
        // Calculate the difference of the two numbers
        int minus = n1 - n2;
        // គណនានិងរក្សាទុកផលដកនៃ n1 និង n2 ក្នុងអថេរ minus
        // Calculates and stores the difference of n1 and n2 in the variable minus

        // គណនានិងបង្ហាញផលគុណនៃលេខទាំងពីរ
        // Calculate the product of the two numbers
        int multiply = n1 * n2;
        // គណនានិងរក្សាទុកផលគុណនៃ n1 និង n2 ក្នុងអថេរ multiply
        // Calculates and stores the product of n1 and n2 in the variable multiply

        // គណនានិងបង្ហាញផលបូកនៃលេខទាំងពីរ (សម្គាល់: សេចក្តីអធិប្បាយនេះអាចជាកំហុស;
        // វាដូចគ្នានឹងការគណនាផលបូក)
        // Calculate the addition of the two numbers (Note: This comment may be a typo;
        // it seems similar to the "sum" calculation)
        int subtract = n1 + n2;
        // គណនានិងរក្សាទុកផលបូកនៃ n1 និង n2 ក្នុងអថេរ subtract
        // Calculates and stores the sum of n1 and n2 in the variable subtract

        // គណនានិងបង្ហាញផលចែកនៃលេខទាំងពីរ
        // Calculate the division of the two numbers
        int divide = n1 / n2;
        // គណនានិងរក្សាទុកផលចែកនៃ n1 និង n2 ក្នុងអថេរ divide
        // Calculates and stores the division of n1 by n2 in the variable divide

        // គណនានិងបង្ហាញសំណល់នៃការចែកនៃលេខទាំងពីរ
        // Calculate the remainder when dividing the two numbers
        int rnums = n1 % n2;
        // គណនានិងរក្សាទុកសំណល់នៃការចែក n1 និង n2 ក្នុងអថេរ rnums
        // Calculates and stores the remainder of dividing n1 by n2 in the variable
        // rnums

        // បង្ហាញលទ្ធផលនៃការគណនាទាំងអស់
        // Display the results of the calculations
        System.out.printf(
                "Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ",
                sum, minus, multiply, subtract, divide, rnums);
        // បង្ហាញលទ្ធផលនៃការគណនាទាំងអស់ទៅកាន់ console
        // Displays the results of all calculations to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class