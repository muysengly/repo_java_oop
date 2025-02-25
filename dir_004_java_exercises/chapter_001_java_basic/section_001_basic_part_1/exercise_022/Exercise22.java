import java.util.Scanner;
// នាំចូល class Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
// Import the Scanner class to read input from the user

public class Exercise22 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise22
    // Declare a public class named Exercise22

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខប៊ីណារី និងទសភាគ, សំណល់, និងកត្តា
        // Declare variables to store binary and decimal numbers, remainder, and a
        // multiplier
        long binaryNumber, decimalNumber = 0, j = 1, remainder;
        // ប្រកាសអថេរទាំងស្រុង 'binaryNumber', 'decimalNumber', 'j', និង 'remainder'
        // Declare long variables 'binaryNumber', 'decimalNumber', 'j', and 'remainder'

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Prompt the user to input a binary number
        System.out.print("Input a binary number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Display a message on the console asking the user to input a binary number
        binaryNumber = sc.nextLong();
        // អានលេខប៊ីណារីដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the binary number input by the user

        // បម្លែងលេខប៊ីណារីទៅទសភាគ
        // Convert the binary number to decimal
        while (binaryNumber != 0) {
            // រង្វិលរហូតដល់លេខប៊ីណារីត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the binary number is reduced to 0
            remainder = binaryNumber % 10;
            // ទទួលបានខ្ទង់ចុងក្រោយនៃលេខប៊ីណារី
            // Get the last digit of the binary number
            decimalNumber = decimalNumber + remainder * j;
            // បន្ថែមតម្លៃនៃខ្ទង់ចុងក្រោយគុណនឹងកត្តាបច្ចុប្បន្ននៃ 2 ទៅលេខទសភាគ
            // Add the value of the last digit multiplied by the current power of 2 to the
            // decimal number
            j = j * 2;
            // បន្ទាន់សម័យកត្តាទៅកាន់ថាមពលបន្ទាប់នៃ 2
            // Update the multiplier to the next power of 2
            binaryNumber = binaryNumber / 10;
            // លុបខ្ទង់ចុងក្រោយពីលេខប៊ីណារី
            // Remove the last digit from the binary number
        }

        // បង្ហាញតំណាងទសភាគនៃលេខប៊ីណារី
        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber);
        // បង្ហាញលេខទសភាគដែលបានបម្លែងទៅកាន់ console
        // Print the converted decimal number to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise22
// Closes the Exercise22 class