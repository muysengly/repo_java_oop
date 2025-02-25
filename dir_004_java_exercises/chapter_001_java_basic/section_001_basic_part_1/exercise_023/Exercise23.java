import java.util.Scanner;
// នាំចូល class Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
// Import the Scanner class to read input from the user

public class Exercise23 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise23
    // Declare a public class named Exercise23

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអារេដើម្បីរក្សាទុកខ្ទង់សិប្បដិកស, អថេរសម្រាប់គណនា, និងបញ្ចូលប៊ីណារី
        // Declare an array to store hexadecimal digits, variables for calculation, and
        // binary input
        int[] hex = new int[1000];
        // អារេដើម្បីរក្សាទុកខ្ទង់សិប្បដិកស
        // Array to store hexadecimal digits
        int i = 1, j = 0, rem, dec = 0, bin;
        // អថេរសម្រាប់គណនា
        // Variables for calculation

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារី
        // Display a message on the console asking the user to input a binary number
        bin = in.nextInt();
        // អានលេខប៊ីណារីដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the binary number input by the user

        // បម្លែងលេខប៊ីណារីទៅទសភាគ
        // Convert the binary number to decimal
        while (bin > 0) {
            // រង្វិលរហូតដល់លេខប៊ីណារីត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the binary number is reduced to 0
            rem = bin % 2;
            // ទទួលបានខ្ទង់ចុងក្រោយនៃលេខប៊ីណារី
            // Get the last digit of the binary number
            dec = dec + rem * i;
            // បន្ថែមតម្លៃនៃខ្ទង់ចុងក្រោយគុណនឹងកត្តាបច្ចុប្បន្ននៃ 2 ទៅលេខទសភាគ
            // Add the value of the last digit multiplied by the current power of 2 to the
            // decimal number
            i = i * 2;
            // បន្ទាន់សម័យកត្តាទៅកាន់ថាមពលបន្ទាប់នៃ 2
            // Update the multiplier to the next power of 2
            bin = bin / 10;
            // លុបខ្ទង់ចុងក្រោយពីលេខប៊ីណារី
            // Remove the last digit from the binary number
        }
        i = 0;
        // កំណត់តម្លៃកត្តាថ្មីសម្រាប់ការបម្លែងបន្ទាប់
        // Reset the multiplier for the next conversion

        // បម្លែងលេខទសភាគទៅសិប្បដិកស
        // Convert the decimal number to hexadecimal
        while (dec != 0) {
            // រង្វិលរហូតដល់លេខទសភាគត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the decimal number is reduced to 0
            hex[i] = dec % 16;
            // ទទួលបានសំណល់នៅពេលចែកដោយ 16 (ខ្ទង់សិប្បដិកស)
            // Get the remainder when dividing by 16 (hexadecimal digit)
            dec = dec / 16;
            // បន្ទាន់សម័យលេខទសភាគដោយចែកវាដោយ 16
            // Update the decimal number by dividing it by 16
            i++;
            // ផ្លាស់ទីទៅទីតាំងបន្ទាប់នៅក្នុងអារេ hex
            // Move to the next position in the hex array
        }

        // បង្ហាញតម្លៃសិប្បដិកស
        // Display the hexadecimal value
        System.out.print("Hexadecimal value: ");
        // បង្ហាញតម្លៃសិប្បដិកសទៅកាន់ console
        // Display the hexadecimal value to the console
        for (j = i - 1; j >= 0; j--) {
            // រង្វិលតាមលំដាប់បញ្ច្រាសនៅក្នុងអារេ hex
            // Loop through the hex array in reverse order
            if (hex[j] > 9) {
                // ប្រសិនបើខ្ទង់សិប្បដិកសធំជាង 9, បម្លែងវាទៅជាតួអក្សរ (A-F)
                // If the hex digit is greater than 9, convert it to a letter (A-F)
                System.out.print((char) (hex[j] + 55));
                // បម្លែងទៅជាតួអក្សរ ASCII (A-F)
                // Convert to corresponding ASCII character (A-F)
            } else {
                System.out.print(hex[j]);
                // បង្ហាញខ្ទង់សិប្បដិកស (0-9)
                // Print the hex digit (0-9)
            }
        }
        System.out.print("\n");
        // បង្ហាញតួអក្សរបញ្ចូលបន្ទាត់ថ្មី
        // Print a newline character
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise23
// Closes the Exercise23 class