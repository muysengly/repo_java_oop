public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // កំណត់អថេរពុម្ពសម្រាប់ផ្នែកខាងលើនិងផ្នែកកណ្តាល
        // Define pattern strings for the top and middle sections
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        // កំណត់អថេរ p1 ជាខ្សែអក្សរដែលមានលំនាំសញ្ញាអស្ទិកនិងសញ្ញាស្មើ
        // Define the variable p1 as a string with a pattern of asterisks and equal
        // signs
        String p2 = "==============================================";
        // កំណត់អថេរ p2 ជាខ្សែអក្សរដែលមានលំនាំសញ្ញាស្មើ
        // Define the variable p2 as a string with a pattern of equal signs

        // បង្ហាញលំនាំផ្នែកខាងលើ 4 ដង
        // Print the top section pattern 4 times
        for (int i = 0; i < 4; i++) {
            // បង្ហាញអថេរ p1
            // Print the variable p1
            System.out.println(p1);
        }

        // បង្ហាញលំនាំផ្នែកខាងលើម្តង
        // Print the bottom section pattern once
        System.out.println("* * * * * * ==================================");
        // បង្ហាញខ្សែអក្សរដែលមានលំនាំសញ្ញាអស្ទិកនិងសញ្ញាស្មើ
        // Print a string with a pattern of asterisks and equal signs

        // បង្ហាញលំនាំផ្នែកកណ្តាល 6 ដង
        // Print the middle section pattern 6 times
        for (int i = 0; i < 6; i++) {
            // បង្ហាញអថេរ p2
            // Print the variable p2
            System.out.println(p2);
        }
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class