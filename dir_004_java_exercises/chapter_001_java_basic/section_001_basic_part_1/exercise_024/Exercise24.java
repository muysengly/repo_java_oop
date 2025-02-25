import java.util.*;
// នាំចូល class ទាំងអស់ពី package java.util
// Import all classes from the java.util package

public class Exercise24 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise24
    // Declare a public class named Exercise24

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខប៊ីណារី និងទសភាគ, សំណល់, ផលធៀប,
        // និងអារេសម្រាប់ខ្ទង់អុកតាល់
        // Declare variables to store binary and decimal numbers, remainder, quotient,
        // and an array for octal digits
        int binnum, binnum1, rem, decnum = 0, quot, i = 1, j;
        // អថេរសម្រាប់គណនា
        // Variables for calculation
        int octnum[] = new int[100];
        // អារេដើម្បីរក្សាទុកខ្ទង់អុកតាល់
        // Array to store octal digits

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number : ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Display a message on the console asking the user to input a binary number
        binnum = scan.nextInt();
        // អានលេខប៊ីណារីដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the binary number input by the user
        binnum1 = binnum;
        // រក្សាទុកលេខប៊ីណារីដើមសម្រាប់ប្រើប្រាស់នៅពេលក្រោយ
        // Store the original binary number for later use

        // បម្លែងលេខប៊ីណារីទៅទសភាគ
        // Convert the binary number to decimal
        while (binnum > 0) {
            // រង្វិលរហូតដល់លេខប៊ីណារីត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the binary number is reduced to 0
            rem = binnum % 10;
            // ទទួលបានខ្ទង់ចុងក្រោយនៃលេខប៊ីណារី
            // Get the last digit of the binary number
            decnum = decnum + rem * i;
            // បន្ថែមតម្លៃនៃខ្ទង់ចុងក្រោយគុណនឹងកត្តាបច្ចុប្បន្ននៃ 2 ទៅលេខទសភាគ
            // Add the value of the last digit multiplied by the current power of 2 to the
            // decimal number
            i = i * 2;
            // បន្ទាន់សម័យកត្តាទៅកាន់ថាមពលបន្ទាប់នៃ 2
            // Update the multiplier to the next power of 2
            binnum = binnum / 10;
            // លុបខ្ទង់ចុងក្រោយពីលេខប៊ីណារី
            // Remove the last digit from the binary number
        }

        i = 1;
        // កំណត់តម្លៃកត្តាថ្មីសម្រាប់ការបម្លែងបន្ទាប់
        // Reset the multiplier for the next conversion
        quot = decnum;
        // រក្សាទុកលេខទសភាគក្នុង quot សម្រាប់បម្លែងទៅអុកតាល់
        // Store the decimal number in quot for conversion to octal

        // បម្លែងលេខទសភាគទៅអុកតាល់
        // Convert the decimal number to octal
        while (quot > 0) {
            // រង្វិលរហូតដល់ផលធៀបត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the quotient is reduced to 0
            octnum[i++] = quot % 8;
            // ទទួលបានសំណល់នៅពេលចែកដោយ 8 (ខ្ទង់អុកតាល់) និងរក្សាទុកក្នុងអារេ octnum
            // Get the remainder when dividing by 8 (octal digit) and store it in the octnum
            // array
            quot = quot / 8;
            // បន្ទាន់សម័យផលធៀបដោយចែកវាដោយ 8
            // Update the quotient by dividing it by 8
        }

        // បង្ហាញតម្លៃអុកតាល់សមស្របនៃលេខប៊ីណារីដើម
        // Display the equivalent octal value of the original binary number
        System.out.print("Equivalent Octal Value of " + binnum1 + " is :");
        // បង្ហាញតម្លៃអុកតាល់សមស្របនៃលេខប៊ីណារីដើមទៅកាន់ console
        // Display the equivalent octal value of the original binary number to the
        // console
        for (j = i - 1; j > 0; j--) {
            // រង្វិលតាមលំដាប់បញ្ច្រាសនៅក្នុងអារេ octnum
            // Loop through the octnum array in reverse order
            System.out.print(octnum[j]);
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
// បិទថ្នាក់ Exercise24
// Closes the Exercise24 class