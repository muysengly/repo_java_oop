import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package to read user input

public class Exercise18 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise18
    // Declare a public class named Exercise18

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខប៊ីណារីពីរ និងផលគុណ
        // Declare variables to store two binary numbers and the product
        long binary1, binary2, multiply = 0;
        // ប្រកាសអថេរទាំងស្រុងសម្រាប់លេខប៊ីណារី និងផលគុណរបស់ពួកវា
        // Declare long variables for binary numbers and their product

        // កំណត់តម្លៃដំបូងសម្រាប់អថេរខ្ទង់ និងកត្តាសម្រាប់ដំណើរការប៊ីណារី2
        // Initialize digit and factor variables for processing binary2
        int digit, factor = 1;
        // ប្រកាសនិងកំណត់តម្លៃដំបូងសម្រាប់អថេរខ្ទង់ និងកត្តា
        // Declare and initialize variables for digit and factor

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារីទីមួយ
        // Prompt the user to input the first binary number
        System.out.print("Input the first binary number: ");
        // អាននិងរក្សាទុកលេខប៊ីណារីទីមួយ
        // Read and store the first binary number
        binary1 = in.nextLong();

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខប៊ីណារីទីពីរ
        // Prompt the user to input the second binary number
        System.out.print("Input the second binary number: ");
        // អាននិងរក្សាទុកលេខប៊ីណារីទីពីរ
        // Read and store the second binary number
        binary2 = in.nextLong();

        // ដំណើរការប៊ីណារី2 ដើម្បីគណនាផលគុណ
        // Process binary2 to calculate the product
        while (binary2 != 0) {
            // រង្វិលរហូតដល់ប៊ីណារី2 គឺសូន្យ
            // Loop until binary2 is zero
            digit = (int) (binary2 % 10);
            // ដកខ្ទង់ចុងក្រោយនៃប៊ីណារី2
            // Extract the last digit of binary2
            if (digit == 1) {
                // ប្រសិនបើខ្ទង់គឺ 1
                // If the digit is 1
                binary1 = binary1 * factor;
                // គុណប៊ីណារី1 ជាមួយកត្តា
                // Multiply binary1 by the factor
                multiply = binaryproduct((int) binary1, (int) multiply);
                // គណនាផលគុណដោយប្រើវិធីសាស្រ្ត binaryproduct
                // Calculate the product using the binaryproduct method
            } else {
                // ប្រសិនបើខ្ទង់មិនមែន 1
                // If the digit is not 1
                binary1 = binary1 * factor;
                // គុណប៊ីណារី1 ជាមួយកត្តា
                // Multiply binary1 by the factor
            }
            binary2 = binary2 / 10;
            // លុបខ្ទង់ចុងក្រោយពីប៊ីណារី2
            // Remove the last digit from binary2
            factor = 10;
            // កំណត់កត្តាជា 10 សម្រាប់ការរង្វិលបន្ទាប់
            // Set the factor to 10 for the next iteration
        }

        // បង្ហាញផលគុណនៃលេខប៊ីណារីទាំងពីរ
        // Display the product of the two binary numbers
        System.out.print("Product of two binary numbers: " + multiply + "\n");

        // វិធីសាស្រ្តដើម្បីគណនាផលគុណនៃលេខប៊ីណារីពីរ
        // Method to calculate the product of two binary numbers
    }

    static int binaryproduct(int binary1, int binary2) {
        // ប្រកាសអថេរសម្រាប់សន្ទស្សន៍ និងសំណល់
        // Declare variables for indexing and remainder
        int i = 0, remainder = 0;
        // ចាប់ផ្តើមអារេមួយដើម្បីរក្សាទុកផលបូកនៃខ្ទង់ប៊ីណារី
        // Initialize an array to store the sum of binary digits
        int[] sum = new int[20];
        // ចាប់ផ្តើមលទ្ធផលនៃផលគុណប៊ីណារី
        // Initialize the result of the binary product
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            // រង្វិលរហូតដល់លេខប៊ីណារីទាំងពីរគឺសូន្យ
            // Loop until both binary numbers are zero
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            // គណនាខ្ទង់បច្ចុប្បន្ននៃផលបូក
            // Calculate the current digit of the sum
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            // គណនាសំណល់សម្រាប់ខ្ទង់បន្ទាប់
            // Calculate the carry for the next digit
            binary1 = binary1 / 10;
            // លុបខ្ទង់ចុងក្រោយពីប៊ីណារី1
            // Remove the last digit from binary1
            binary2 = binary2 / 10;
            // លុបខ្ទង់ចុងក្រោយពីប៊ីណារី2
            // Remove the last digit from binary2
        }

        if (remainder != 0) {
            // ប្រសិនបើមានសំណល់នៅសល់
            // If there is a remaining carry
            sum[i++] = remainder;
            // បន្ថែមសំណល់ទៅក្នុងផលបូក
            // Add the carry to the sum
        }

        --i;
        // បន្ថយសន្ទស្សន៍ដើម្បីបញ្ជាក់ទៅខ្ទង់ចុងក្រោយដែលមានតម្លៃនៅក្នុងអារេ sum
        // Decrement the index to point to the last valid digit in the sum array

        while (i >= 0) {
            // រង្វិលដើម្បីបង្កើតលទ្ធផលនៃផលគុណប៊ីណារីពីអារេ sum
            // Loop to construct the binary product result from the sum array
            binary_prod_result = binary_prod_result * 10 + sum[i--];
            // បង្កើតលទ្ធផលនៃផលគុណប៊ីណារី
            // Construct the binary product result
        }

        return binary_prod_result;
        // ត្រឡប់លទ្ធផលនៃផលគុណប៊ីណារី
        // Return the binary product result
    }
}