import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise33 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise33
    // Declare a public class named Exercise33

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        Scanner input = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ដើម្បីទទួលការបញ្ចូលពីកូនភ្លោះ
        // Create a Scanner to obtain input from the command window

        // ស្នើសុំអ្នកប្រើប្រាស់បញ្ចូលលេខគត់
        // Prompt the user to input an integer
        System.out.print("Input an integer: ");
        // អានលេខគត់ពីអ្នកប្រើប្រាស់
        // Read the integer from the user
        long n = input.nextLong();

        // គណនានិងបង្ហាញផលបូកនៃខ្ទង់
        // Calculate and display the sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(n));
        // បង្ហាញផលបូកនៃខ្ទង់
        // Display the sum of the digits
    }

    public static int sumDigits(long n) {
        // ប្រកាសមុខងារសាធារណៈមួយដែលមានឈ្មោះ sumDigits
        // Declare a public function named sumDigits
        int sum = 0;
        // ប្រកាសអថេរទាំងស្រុង 'sum' និងកំណត់តម្លៃដំបូងជាសូន្យ
        // Declare an integer variable 'sum' and initialize it to 0

        // គណនាផលបូកនៃខ្ទង់
        // Calculate the sum of the digits
        while (n != 0) {
            // រង្វិលរហូតដល់ n មិនស្មើសូន្យ
            // Loop until n is not equal to 0
            sum += n % 10;
            // បន្ថែមសំណល់នៃ n ចែក 10 ទៅ sum
            // Add the remainder of n divided by 10 to sum
            n /= 10;
            // បែងចែក n ដោយ 10
            // Divide n by 10
        }

        return sum;
        // ត្រឡប់តម្លៃ sum
        // Return the value of sum
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise33
// Closes the Exercise33 class