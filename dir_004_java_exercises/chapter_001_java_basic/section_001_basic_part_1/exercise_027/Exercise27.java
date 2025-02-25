import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise27 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise27
    // Declare a public class named Exercise27

    public static void main(String args[]) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខអុកតាល់ និងតម្លៃទសភាគ និងសិប្បដិកស
        // Declare variables to store octal number and its decimal and hexadecimal
        // equivalents
        String octal_num, hex_num;
        // ប្រកាសអថេរខ្សែអក្សរ 'octal_num' និង 'hex_num'
        // Declare string variables 'octal_num' and 'hex_num'
        int decnum;
        // ប្រកាសអថេរទាំងស្រុង 'decnum'
        // Declare an integer variable 'decnum'

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Prompt the user to input an octal number
        System.out.print("Input an octal number : ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Display a message on the console asking the user to input an octal number
        octal_num = in.nextLine();
        // អានលេខអុកតាល់ដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the octal number input by the user

        // បម្លែងលេខអុកតាល់ទៅតម្លៃទសភាគដោយប្រើ parseInt
        // Convert the octal number to its decimal equivalent using parseInt
        decnum = Integer.parseInt(octal_num, 8);
        // បម្លែងលេខអុកតាល់ទៅទសភាគដោយប្រើ Integer.parseInt
        // Convert the octal number to decimal using Integer.parseInt

        // បម្លែងលេខទសភាគទៅតម្លៃសិប្បដិកស
        // Convert the decimal number to its hexadecimal equivalent
        hex_num = Integer.toHexString(decnum);
        // បម្លែងលេខទសភាគទៅសិប្បដិកសដោយប្រើ Integer.toHexString
        // Convert the decimal number to hexadecimal using Integer.toHexString

        // បង្ហាញតម្លៃសិប្បដិកសសមស្រប
        // Display the equivalent hexadecimal number
        System.out.print("Equivalent hexadecimal number: " + hex_num + "\n");
        // បង្ហាញតម្លៃសិប្បដិកសសមស្របទៅកាន់ console
        // Display the equivalent hexadecimal number to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise27
// Closes the Exercise27 class