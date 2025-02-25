import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package to read user input

public class Exercise17 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise17
    // Declare a public class named Exercise17

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខពីរដែលមានទម្រង់ប៊ីណារី, សន្ទស្សន៍, និងសំណល់
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2;
        // ប្រកាសអថេរទាំងស្រុងពីរដើម្បីរក្សាទុកលេខប៊ីណារី
        // Declare two long variables to store the binary numbers

        int i = 0, remainder = 0;
        // ប្រកាសអថេរទាំងស្រុង 'i' សម្រាប់សន្ទស្សន៍ និង 'remainder' សម្រាប់សំណល់
        // Declare an integer variable 'i' for indexing and 'remainder' for carry

        // បង្កើតអារេមួយដើម្បីរក្សាទុកផលបូកនៃខ្ទង់ប៊ីណារី
        // Create an array to store the sum of binary digits
        int[] sum = new int[20];
        // ចាប់ផ្តើមអារេមួយដើម្បីរក្សាទុកផលបូកនៃខ្ទង់ប៊ីណារី
        // Initialize an array to store the sum of binary digits

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារីទីមួយ
        // Prompt the user to input the first binary number
        System.out.print("Input first binary number: ");

        // អាននិងរក្សាទុកលេខប៊ីណារីទីមួយ
        // Read and store the first binary number
        binary1 = scanner.nextLong();

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារីទីពីរ
        // Prompt the user to input the second binary number
        System.out.print("Input second binary number: ");
        // អាននិងរក្សាទុកលេខប៊ីណារីទីពីរ
        // Read and store the second binary number
        binary2 = scanner.nextLong();

        // គណនាផលបូកប៊ីណារីខណៈដែលមានខ្ទង់នៅក្នុងលេខប៊ីណារី
        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0) {
            // រង្វិលរហូតដល់លេខប៊ីណារីទាំងពីរគឺសូន្យ
            // Loop until both binary numbers are zero

            // គណនាផលបូកនៃខ្ទង់ប៊ីណារីនិងធ្វើបច្ចុប្បន្នភាពសំណល់
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            // គណនាខ្ទង់បច្ចុប្បន្ននៃផលបូក
            // Calculate the current digit of the sum
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            // គណនាសំណល់សម្រាប់ខ្ទង់បន្ទាប់
            // Calculate the carry for the next digit
            binary1 = binary1 / 10;
            // លុបខ្ទង់ចុងក្រោយពី binary1
            // Remove the last digit from binary1
            binary2 = binary2 / 10;
            // លុបខ្ទង់ចុងក្រោយពី binary2
            // Remove the last digit from binary2
        }

        // ប្រសិនបើមានសំណល់នៅសល់, បន្ថែមវាទៅក្នុងផលបូក
        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            // ពិនិត្យមើលថាមានសំណល់នៅសល់ឬអត់
            // Check if there is a carry left
            sum[i++] = remainder;
            // បន្ថែមសំណល់ទៅក្នុងផលបូក
            // Add the carry to the sum
        }

        // បន្ថយសន្ទស្សន៍ដើម្បីរៀបចំសម្រាប់បង្ហាញ
        // Decrement the index to prepare for printing
        --i;
        // បន្ថយសន្ទស្សន៍ដើម្បីបញ្ជាក់ទៅខ្ទង់ចុងក្រោយដែលមានតម្លៃនៅក្នុងអារេ sum
        // Decrement the index to point to the last valid digit in the sum array

        // បង្ហាញផលបូកនៃលេខប៊ីណារីទាំងពីរ
        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            // រង្វិលដើម្បីបង្ហាញអារេ sum ចាប់ពីខ្ទង់ដែលមានតម្លៃខ្ពស់បំផុត
            // Loop to print the sum array from the most significant digit
            System.out.print(sum[i--]);
            // បង្ហាញខ្ទង់នីមួយៗនៃផលបូក
            // Print each digit of the sum
        }

        // បិទ Scanner
        // Close the Scanner
        scanner.close();
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise17
// Closes the Exercise17 class