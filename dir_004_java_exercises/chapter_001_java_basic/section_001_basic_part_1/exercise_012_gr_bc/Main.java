import java.util.Scanner;
// នាំចូល class Scanner ពី package java.util
// Imports the Scanner class from the java.util package

public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // កំណត់អថេរសម្រាប់ផលបូកនិងការរាប់
        // Initialize variables for sum and counting
        double num = 0;
        // កំណត់អថេរ num ជា 0
        // Initialize the variable num to 0
        double x = 1;
        // កំណត់អថេរ x ជា 1
        // Initialize the variable x to 1

        // បង្កើតវត្ថុ Scanner ដើម្បីអានទិន្នន័យពីអ្នកប្រើប្រាស់
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // បង្កើតវត្ថុ Scanner ថ្មី សម្រាប់អានទិន្នន័យពី console
        // Creates a new Scanner object to read input from the console

        // សួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខ (n) សម្រាប់គណនាមធ្យម
        // Prompt the user to input the number (n) for which to calculate the average
        System.out.println("Input the number(n) you want to calculate the average: ");
        // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខ (n)
        // Displays a message on the console asking the user to input the number (n)
        int n = sc.nextInt();
        // អានលេខ integer ពី console ហើយរក្សាទុកក្នុងអថេរ n
        // Reads an integer from the console and stores it in the variable n

        // ប្រើរង្វិលដើម្បីប្រមូល n លេខនិងគណនាផលបូករបស់ពួកវា
        // Use a loop to collect n numbers and calculate their sum
        while (x <= n) {
            // បង្ហាញសារលើ console ដើម្បីសួរអ្នកប្រើប្រាស់ឱ្យបញ្ចូលលេខ (x)
            // Displays a message on the console asking the user to input number (x)
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            // បន្ថែមតម្លៃដែលបានបញ្ចូលទៅ num
            // Adds the input value to num
            num += sc.nextInt();
            // បន្ថែម 1 ទៅ x
            // Adds 1 to x
            x += 1;
        }

        // គណនាមធ្យមនៃលេខដែលបានប្រមូល
        // Calculate the average of the collected numbers
        double avgn = (num / n);
        // គណនាមធ្យមនៃ num ចែកនឹង n ហើយរក្សាទុកក្នុងអថេរ avgn
        // Calculates the average of num divided by n and stores it in the variable avgn

        // បង្ហាញមធ្យមដែលបានគណនា
        // Display the calculated average
        System.out.println("Average: " + avgn);
        // បង្ហាញមធ្យមទៅកាន់ console
        // Displays the average to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class