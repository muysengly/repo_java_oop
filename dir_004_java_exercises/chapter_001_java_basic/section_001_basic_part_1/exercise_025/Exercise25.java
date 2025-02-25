import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise25 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise25
    // Declare a public class named Exercise25

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខអុកតាល់ និងទសភាគ, និងខ្ទង់សន្ទស្សន៍
        // Declare variables to store octal and decimal numbers, and an index counter
        long octal_num, decimal_num = 0;
        // ប្រកាសអថេរទាំងស្រុង 'octal_num' និង 'decimal_num'
        // Declare long variables 'octal_num' and 'decimal_num'
        int i = 0;
        // ប្រកាសអថេរទាំងស្រុង 'i' សម្រាប់សន្ទស្សន៍
        // Declare an integer variable 'i' for indexing

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Prompt the user to input an octal number
        System.out.print("Input any octal number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Display a message on the console asking the user to input an octal number
        octal_num = in.nextLong();
        // អានលេខអុកតាល់ដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the octal number input by the user

        // បម្លែងលេខអុកតាល់ទៅទសភាគ
        // Convert the octal number to decimal
        while (octal_num != 0) {
            // រង្វិលរហូតដល់លេខអុកតាល់ត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the octal number is reduced to 0
            decimal_num = (long) (decimal_num + (octal_num % 10) * Math.pow(8, i++));
            // គណនាតម្លៃទសភាគដោយបូកសំណល់គុណនឹងថាមពលបច្ចុប្បន្ននៃ 8
            // Calculate the decimal value by adding the remainder multiplied by the current
            // power of 8
            octal_num = octal_num / 10;
            // លុបខ្ទង់ចុងក្រោយពីលេខអុកតាល់
            // Remove the last digit from the octal number
        }

        // បង្ហាញតម្លៃទសភាគសមស្របនៃលេខអុកតាល់
        // Display the equivalent decimal number
        System.out.print("Equivalent decimal number: " + decimal_num + "\n");
        // បង្ហាញតម្លៃទសភាគសមស្របនៃលេខអុកតាល់ទៅកាន់ console
        // Display the equivalent decimal number of the octal number to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise25
// Closes the Exercise25 class