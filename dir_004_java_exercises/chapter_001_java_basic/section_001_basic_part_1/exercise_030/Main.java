import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declare a public class named Main

    // មុខងារដើម្បីបម្លែងខ្សែអក្សរសិប្បដិកសទៅលេខទសភាគ
    // Function to convert a hexadecimal string to a decimal integer
    public static int hex_to_oct(String s) {
        // កំណត់ខ្សែអក្សរមានខ្ទង់សិប្បដិកស
        // Define a string containing hexadecimal digits
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase(); // បម្លែងខ្សែអក្សរបញ្ចូលទៅជាអក្សរធំ
        // Convert the input string to uppercase
        int val = 0; // កំណត់តម្លៃទសភាគដំបូងជាសូន្យ
        // Initialize the decimal value to 0

        // រង្វិលតាមតួអក្សរនីមួយៗក្នុងខ្សែអក្សរបញ្ចូល
        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // ទទួលបានតួអក្សរបច្ចុប្បន្ន
            // Get the current character
            int d = digits.indexOf(c); // រកឃើញសន្ទស្សន៍នៃតួអក្សរនៅក្នុងខ្សែអក្សរខ្ទង់
            // Find the index of the character in the digits string
            val = 16 * val + d; // បន្ទាន់សម័យតម្លៃទសភាគដោយប្រើការបម្លែងសិប្បដិកស
            // Update the decimal value using hexadecimal conversion
        }

        return val; // ត្រឡប់តម្លៃទសភាគ
        // Return the decimal value
    }

    public static void main(String args[]) {
        // ប្រកាសអថេរខ្សែអក្សរ 'hexdec_num' និងអថេរទាំងស្រុង 'dec_num'
        // Declare string variable 'hexdec_num' and integer variable 'dec_num'
        String hexdec_num;
        int dec_num, i = 1, j;
        // ប្រកាសអារេ 'octal_num' ដើម្បីរក្សាទុកខ្ទង់អុកតាល់
        // Declare an array 'octal_num' to store octal digits
        int octal_num[] = new int[100];
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខសិប្បដិកស
        // Prompt the user to input a hexadecimal number
        System.out.print("Input a hexadecimal number: ");
        // អានលេខសិប្បដិកសដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the hexadecimal number input by the user
        hexdec_num = in.nextLine();

        // ហៅមុខងារ hex_to_oct ដើម្បីបម្លែងលេខសិប្បដិកសទៅទសភាគ
        // Call the hex_to_oct function to convert the hexadecimal number to decimal
        dec_num = hex_to_oct(hexdec_num);

        // បម្លែងលេខទសភាគទៅអុកតាល់
        // Convert the decimal number to octal
        while (dec_num != 0) {
            // រង្វិលរហូតដល់លេខទសភាគត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the decimal number is reduced to 0
            octal_num[i++] = dec_num % 8;
            // ទទួលបានសំណល់នៅពេលចែកដោយ 8 (ខ្ទង់អុកតាល់) និងរក្សាទុកក្នុង octal_num
            // Get the remainder when dividing by 8 (octal digit) and store it in octal_num
            dec_num = dec_num / 8;
            // បន្ទាន់សម័យលេខទសភាគដោយចែកវាដោយ 8
            // Update the decimal number by dividing it by 8
        }

        // បង្ហាញតម្លៃអុកតាល់សមស្រប
        // Display the equivalent octal number
        System.out.print("Equivalent of octal number is: ");
        // បង្ហាញតម្លៃអុកតាល់សមស្របទៅកាន់ console
        // Display the equivalent octal number to the console
        for (j = i - 1; j > 0; j--) {
            // រង្វិលតាមលំដាប់បញ្ច្រាសនៅក្នុង octal_num
            // Loop through the octal_num array in reverse order
            System.out.print(octal_num[j]);
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
// បិទថ្នាក់ Main
// Closes the Main class