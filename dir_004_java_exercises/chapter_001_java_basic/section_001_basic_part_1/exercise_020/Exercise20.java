import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package to read user input

public class Exercise20 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise20
    // Declare a public class named Exercise20

    public static void main(String args[]) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខទសភាគ និងសំណល់
        // Declare variables to store the decimal number and the remainder
        int dec_num, rem;
        // ប្រកាសអថេរទាំងស្រុង 'dec_num' និង 'rem'
        // Declare integer variables 'dec_num' and 'rem'

        // ចាប់ផ្តើមខ្សែអក្សរទទេដើម្បីរក្សាទុកលេខសិប្បដិកស
        // Initialize an empty string to store the hexadecimal number
        String hexdec_num = "";
        // ចាប់ផ្តើមខ្សែអក្សរទទេ 'hexdec_num'
        // Initialize an empty string 'hexdec_num'

        // កំណត់ខ្ទង់លេខសិប្បដិកសនៅក្នុងអារេតួអក្សរ
        // Define the hexadecimal number digits in a character array
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        // ចាប់ផ្តើមអារេតួអក្សរ 'hex' ដែលមានខ្ទង់លេខសិប្បដិកស
        // Initialize a character array 'hex' with hexadecimal digits

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទសភាគ
        // Prompt the user to input a decimal number
        System.out.print("Input a decimal number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទសភាគ
        // Display a message on the console asking the user to input a decimal number

        // អាននិងរក្សាទុកលេខទសភាគដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the decimal number input by the user
        dec_num = in.nextInt();
        // អានលេខទសភាគពី console ហើយរក្សាទុកក្នុងអថេរ dec_num
        // Read the decimal number from the console and store it in the variable dec_num

        // បម្លែងលេខទសភាគទៅសិប្បដិកស
        // Convert the decimal number to hexadecimal
        while (dec_num > 0) {
            // រង្វិលរហូតដល់លេខទសភាគធំជាង 0
            // Loop until the decimal number is greater than 0
            rem = dec_num % 16;
            // រកសំណល់នៅពេលចែកលេខទសភាគដោយ 16
            // Find the remainder when the decimal number is divided by 16
            hexdec_num = hex[rem] + hexdec_num;
            // បន្ថែមខ្ទង់សិប្បដិកសដែលត្រូវនឹងសំណល់ទៅខ្សែអក្សរផលបូក
            // Prepend the corresponding hexadecimal digit to the result string
            dec_num = dec_num / 16;
            // បន្ទាន់សម័យលេខទសភាគដោយចែកវាដោយ 16
            // Update the decimal number by dividing it by 16
        }

        // បង្ហាញតំណាងសិប្បដិកសនៃលេខទសភាគ
        // Display the hexadecimal representation of the decimal number
        System.out.print("Hexadecimal number is: " + hexdec_num + "\n");
        // បង្ហាញតំណាងសិប្បដិកសនៃលេខទសភាគទៅកាន់ console
        // Display the hexadecimal representation of the decimal number to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise20
// Closes the Exercise20 class