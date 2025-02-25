import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise26 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise26
    // Declare a public class named Exercise26

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពី console
        // Create a Scanner object to read input from the console

        // កំណត់អារេមួយដើម្បីផ្គូផ្គងខ្ទង់អុកតាល់ទៅតម្លៃប៊ីណារីរបស់ពួកវា
        // Define an array to map octal digits to their binary equivalents
        int[] octal_numvalues = { 0, 1, 10, 11, 100, 101, 110, 111 };
        // ចាប់ផ្តើមអារេមួយដែលផ្គូផ្គងខ្ទង់អុកតាល់ទៅតម្លៃប៊ីណារីរបស់ពួកវា
        // Initialize an array that maps octal digits to their binary equivalents

        // ប្រកាសអថេរដើម្បីរក្សាទុកលេខអុកតាល់, អុកតាល់បណ្តោះអាសន្ន, លេខប៊ីណារី,
        // និងតម្លៃទីតាំង
        // Declare variables to store octal, temporary octal, and binary numbers, and a
        // place value
        long octal_num, tempoctal_num, binary_num, place;
        // ប្រកាសអថេរទាំងស្រុង 'octal_num', 'tempoctal_num', 'binary_num', និង 'place'
        // Declare long variables 'octal_num', 'tempoctal_num', 'binary_num', and
        // 'place'
        int rem;
        // ប្រកាសអថេរទាំងស្រុង 'rem' សម្រាប់សំណល់
        // Declare an integer variable 'rem' for the remainder

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Prompt the user to input an octal number
        System.out.print("Input any octal number: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខអុកតាល់
        // Display a message on the console asking the user to input an octal number
        octal_num = in.nextLong();
        // អានលេខអុកតាល់ដែលបានបញ្ចូលដោយអ្នកប្រើប្រាស់
        // Read the octal number input by the user
        tempoctal_num = octal_num;
        // រក្សាទុកលេខអុកតាល់ដើមក្នុងអថេរអុកតាល់បណ្តោះអាសន្ន
        // Store the original octal number in the temporary octal variable
        binary_num = 0;
        // កំណត់តម្លៃដំបូងសម្រាប់លេខប៊ីណារី
        // Initialize the binary number to 0
        place = 1;
        // កំណត់តម្លៃដំបូងសម្រាប់តម្លៃទីតាំង
        // Initialize the place value to 1

        // បម្លែងលេខអុកតាល់ទៅប៊ីណារីដោយប្រើអារេផ្គូផ្គង
        // Convert the octal number to binary using the mapping array
        while (tempoctal_num != 0) {
            // រង្វិលរហូតដល់លេខអុកតាល់បណ្តោះអាសន្នត្រូវបានកាត់បន្ថយទៅ 0
            // Loop until the temporary octal number is reduced to 0
            rem = (int) (tempoctal_num % 10);
            // ទទួលបានខ្ទង់ចុងក្រោយនៃលេខអុកតាល់
            // Get the last digit of the octal number
            binary_num = octal_numvalues[rem] * place + binary_num;
            // បន្ថែមតម្លៃប៊ីណារីដែលផ្គូផ្គងគុណនឹងតម្លៃទីតាំងទៅលេខប៊ីណារី
            // Add the mapped binary value multiplied by the place value to the binary
            // number
            tempoctal_num /= 10;
            // លុបខ្ទង់ចុងក្រោយពីលេខអុកតាល់បណ្តោះអាសន្ន
            // Remove the last digit from the temporary octal number
            place *= 1000;
            // បន្ទាន់សម័យតម្លៃទីតាំងដោយគុណវាជាមួយ 1000
            // Update the place value by multiplying it by 1000
        }

        // បង្ហាញតម្លៃប៊ីណារីសមស្របនៃលេខអុកតាល់
        // Display the equivalent binary number
        System.out.print("Equivalent binary number: " + binary_num + "\n");
        // បង្ហាញតម្លៃប៊ីណារីសមស្របនៃលេខអុកតាល់ទៅកាន់ console
        // Display the equivalent binary number of the octal number to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise26
// Closes the Exercise26 class