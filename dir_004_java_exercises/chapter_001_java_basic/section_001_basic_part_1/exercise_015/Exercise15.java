public class Exercise15 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise15
    // Declares a public class named Exercise15

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // ប្រកាសនិងផ្ដល់តម្លៃដំបូងសម្រាប់អថេរទាំងស្រុង a និង b
        // Declare and initialize integer variables a and b
        int a, b;
        // ផ្ដល់តម្លៃដំបូងសម្រាប់អថេរ a ជា 15
        // Initialize the variable a to 15
        a = 15;
        // ផ្ដល់តម្លៃដំបូងសម្រាប់អថេរ b ជា 27
        // Initialize the variable b to 27
        b = 27;

        // បង្ហាញតម្លៃមុនពេលប្តូរ
        // Print the values before swapping
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        // បង្ហាញតម្លៃ a និង b មុនពេលប្តូរទៅកាន់ console
        // Print the values of a and b before swapping to the console

        // ប្តូរតម្លៃដោយមិនប្រើអថេរបណ្តោះអាសន្ន
        // Perform the swap without using a temporary variable
        a = a + b;
        // បូក a និង b ហើយរក្សាទុកលទ្ធផលក្នុង a
        // Add a and b and store the result in a
        b = a - b;
        // ដក b ដើមចេញពី a ថ្មី ហើយរក្សាទុកលទ្ធផលក្នុង b
        // Subtract the original b from the new a and store the result in b
        a = a - b;
        // ដក b ថ្មីចេញពី a ថ្មី ហើយរក្សាទុកលទ្ធផលក្នុង a
        // Subtract the new b from the updated a and store the result in a

        // បង្ហាញតម្លៃបន្ទាប់ពីប្តូរ
        // Print the values after swapping
        System.out.println("After swapping : a, b = " + a + ", " + b);
        // បង្ហាញតម្លៃ a និង b បន្ទាប់ពីប្តូរទៅកាន់ console
        // Print the values of a and b after swapping to the console
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise15
// Closes the Exercise15 class