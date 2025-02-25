import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Import the Scanner class from the java.util package

public class Exercise32 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise32
    // Declare a public class named Exercise32

    public static void main(String args[]) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្កើតវត្ថុ Scanner ដើម្បីទទួលការបញ្ចូលពីកូនភ្លោះ
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        // ប្រកាសអថេរទាំងស្រុង 'number1' សម្រាប់លេខដំបូង
        // Declare an integer variable 'number1' for the first number
        int number1;
        // ប្រកាសអថេរទាំងស្រុង 'number2' សម្រាប់លេខទីពីរ
        // Declare an integer variable 'number2' for the second number
        int number2;

        // ស្នើសុំអ្នកប្រើប្រាស់បញ្ចូលលេខគត់ដំបូង
        // Prompt the user to input the first integer
        System.out.print("Input first integer: ");
        // អានលេខដំបូងពីអ្នកប្រើប្រាស់
        // Read the first number from the user
        number1 = input.nextInt();

        // ស្នើសុំអ្នកប្រើប្រាស់បញ្ចូលលេខគត់ទីពីរ
        // Prompt the user to input the second integer
        System.out.print("Input second integer: ");
        // អានលេខទីពីរពីអ្នកប្រើប្រាស់
        // Read the second number from the user
        number2 = input.nextInt();

        // ប្រៀបធៀបនិងបង្ហាញលទ្ធផល
        // Compare and display the results
        if (number1 == number2)
            // ប្រសិនបើ number1 ស្មើនឹង number2
            // If number1 is equal to number2
            System.out.printf("%d == %d\n", number1, number2);
        // បង្ហាញថា number1 ស្មើនឹង number2
        // Display that number1 is equal to number2
        if (number1 != number2)
            // ប្រសិនបើ number1 មិនស្មើនឹង number2
            // If number1 is not equal to number2
            System.out.printf("%d != %d\n", number1, number2);
        // បង្ហាញថា number1 មិនស្មើនឹង number2
        // Display that number1 is not equal to number2
        if (number1 < number2)
            // ប្រសិនបើ number1 តូចជាង number2
            // If number1 is less than number2
            System.out.printf("%d < %d\n", number1, number2);
        // បង្ហាញថា number1 តូចជាង number2
        // Display that number1 is less than number2
        if (number1 > number2)
            // ប្រសិនបើ number1 ធំជាង number2
            // If number1 is greater than number2
            System.out.printf("%d > %d\n", number1, number2);
        // បង្ហាញថា number1 ធំជាង number2
        // Display that number1 is greater than number2
        if (number1 <= number2)
            // ប្រសិនបើ number1 តូចជាងឬស្មើ number2
            // If number1 is less than or equal to number2
            System.out.printf("%d <= %d\n", number1, number2);
        // បង្ហាញថា number1 តូចជាងឬស្មើ number2
        // Display that number1 is less than or equal to number2
        if (number1 >= number2)
            // ប្រសិនបើ number1 ធំជាងឬស្មើ number2
            // If number1 is greater than or equal to number2
            System.out.printf("%d >= %d\n", number1, number2);
        // បង្ហាញថា number1 ធំជាងឬស្មើ number2
        // Display that number1 is greater than or equal to number2
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise32
// Closes the Exercise32 class