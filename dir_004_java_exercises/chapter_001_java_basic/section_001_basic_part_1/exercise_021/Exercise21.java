import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package to read user input

public class Exercise21 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise21
    // Declare a public class named Exercise21

    public static void main(String args[]) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខទសភាគ, សំណល់, ផលធៀប, និងអារេសម្រាប់ខ្ទង់អុកតាល់
        // Declare variables to store decimal number, remainder, quotient, and an array
        // for octal digits
        int dec_num, rem, quot, i = 1, j;
        // ប្រកាសអថេរទាំងស្រុង 'dec_num', 'rem', 'quot', 'i', និង 'j'
        // Declare integer variables 'dec_num', 'rem', 'quot', 'i', and 'j'
        int oct_num[] = new int[100];
        // ចាប់ផ្តើមអារេមួយដើម្បីរក្សាទុកខ្ទង់អុកតាល់
        // Initialize an array to store octal digits

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទសភាគ
        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខទសភាគ
        // Display a message on the console asking the user to input a decimal number

        // អាននិងរក្សាទុកលេខទសភាគ
        // Read and store the decimal number
        dec_num = scan.nextInt();
        // អានលេខទសភាគពី console ហើយរក្សាទុកក្នុងអថេរ dec_num
        // Read the decimal number from the console and store it in the variable dec_num

        // ចាប់ផ្តើមផលធៀបជាមួយលេខទសភាគ
        // Initialize the quotient with the decimal number
        quot = dec_num;
        // ផ្ដល់តម្លៃដំបូងសម្រាប់អថេរ quot ជា dec_num
        // Initialize the variable quot with the value of dec_num

        // បម្លែងលេខទសភាគទៅអុកតាល់និងរក្សាទុកខ្ទង់អុកតាល់
        // Convert the decimal number to octal and store octal digits
        while (quot != 0) {
            // រង្វិលរហូតដល់ផលធៀបគឺសូន្យ
            // Loop until the quotient is zero
            oct_num[i++] = quot % 8;
            // រក្សាទុកសំណល់ (ខ្ទង់អុកតាល់) នៅក្នុងអារេ
            // Store the remainder (octal digit) in the array
            quot = quot / 8;
            // បន្ទាន់សម័យផលធៀបដោយចែកវាដោយ 8
            // Update the quotient by dividing it by 8
        }

        // បង្ហាញតំណាងអុកតាល់នៃលេខទសភាគ
        // Display the octal representation of the decimal number
        System.out.print("Octal number is: ");
        // បង្ហាញសារលើ console ដើម្បីបង្ហាញលេខអុកតាល់
        // Display a message on the console to show the octal number
        for (j = i - 1; j > 0; j--) {
            // រង្វិលដើម្បីបង្ហាញខ្ទង់អុកតាល់តាមលំដាប់បញ្ច្រាស
            // Loop to print the octal digits in reverse order
            System.out.print(oct_num[j]);
            // បង្ហាញខ្ទង់អុកតាល់នីមួយៗ
            // Print each octal digit
        }

        System.out.print("\n");
        // បង្ហាញតួអក្សរបញ្ចូលបន្ទាត់ថ្មី
        // Print a newline character
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise21
// Closes the Exercise21 class