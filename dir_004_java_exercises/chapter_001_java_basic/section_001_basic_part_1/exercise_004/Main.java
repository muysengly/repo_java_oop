public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // គណនានិងរក្សាទុកលទ្ធផលនៃសមីការក្រាប: -5 + 8 * 6
        // Calculates and stores the result of the expression: -5 + 8 * 6
        int w = -5 + 8 * 6;

        // គណនានិងរក្សាទុកលទ្ធផលនៃសមីការក្រាប: (55 + 9) % 9
        // Calculates and stores the result of the expression: (55 + 9) % 9
        int x = (55 + 9) % 9;

        // គណនានិងរក្សាទុកលទ្ធផលនៃសមីការក្រាប: 20 + (-3 * 5 / 8)
        // Calculates and stores the result of the expression: 20 + (-3 * 5 / 8)
        int y = 20 + (-3 * 5 / 8);

        // គណនានិងរក្សាទុកលទ្ធផលនៃសមីការក្រាប: 5 + 15 / 3 * 2 - 8 % 3
        // Calculates and stores the result of the expression: 5 + 15 / 3 * 2 - 8 % 3
        int z = 5 + 15 / 3 * 2 - 8 % 3;

        // បង្ហាញតម្លៃដែលបានគណនាដែលមាននៅក្នុងអថេរ w, x, y, និង z, មួយក្នុងមួយបន្ទាត់ថ្មី
        // Displays the calculated values stored in variables w, x, y, and z, each on a
        // new line
        System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class