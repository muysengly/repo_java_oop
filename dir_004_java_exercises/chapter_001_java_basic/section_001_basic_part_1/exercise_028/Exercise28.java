import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise28 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise28
    // Declare a public class named Exercise28

    // មុខងារដើម្បីបម្លែងខ្សែអក្សរសិប្បដិកសទៅលេខទសភាគ
    // Function to convert a hexadecimal string to a decimal integer
    public static int hex_to_decimal(String s) {
        // កំណត់ខ្សែអក្សរមានខ្ទង់សិប្បដិកស
        // Define a string containing hexadecimal digits
        String digits = "0123456789ABCDEF";
        // បម្លែងខ្សែអក្សរបញ្ចូលទៅជាអក្សរធំ
        // Convert the input string to uppercase
        s = s.toUpperCase();
        // កំណត់តម្លៃទសភាគដំបូងជាសូន្យ
        // Initialize the decimal value to 0
        int val = 0;

        // រង្វិលតាមតួអក្សរនីមួយៗក្នុងខ្សែអក្សរបញ្ចូល
        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            // ទទួលបានតួអក្សរបច្ចុប្បន្ន
            // Get the current character
            char c = s.charAt(i);
            // រកឃើញសន្ទស្សន៍នៃតួអក្សរនៅក្នុងខ្សែអក្សរខ្ទង់
            // Find the index of the character in the digits string
            int d = digits.indexOf(c);
            // បន្ទាន់សម័យតម្លៃទសភាគដោយប្រើការបម្លែងសិប្បដិកស
            // Update the decimal value using hexadecimal conversion
            val = 16 * val + d;
        }

        // ត្រឡប់តម្លៃទសភាគ
        // Return the decimal value
        return val;
    }

    public static void main(String args[]) {
        // ប្រកាសអថេរខ្សែអក្សរ 'hexdec_num' និងអថេរទាំងស្រុង 'dec_num'
        // Declare string variable 'hexdec_num' and integer variable 'dec_num'
        String hexdec_num;
        int dec_num;
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខសិប្បដិកស
        // Prompt the user to input a hexadecimal number
        System.out.print("Input a hexadecimal number: ");
        // អានលេខសិប្បដិកសដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the hexadecimal number input by the user
        hexdec_num = scan.nextLine();

        // ហៅមុខងារ hex_to_decimal ដើម្បីបម្លែងលេខសិប្បដិកសទៅទសភាគ
        // Call the hex_to_decimal function to convert the hexadecimal number to decimal
        dec_num = hex_to_decimal(hexdec_num);

        // បង្ហាញតម្លៃទសភាគសមស្រប
        // Display the equivalent decimal number
        System.out.print("Equivalent decimal number is: " + dec_num + "\n");
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise28
// Closes the Exercise28 class