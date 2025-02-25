public class Exercise13 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise13
    // Declares a public class named Exercise13

    public static void main(String[] strings) {
        // ប្រកាស method main ដែលទទួលអាធិប្បាយជាអារេនៃ string
        // Declares the main method which takes an array of strings as arguments

        // កំណត់ថេរសម្រាប់ទទឹងនិងកម្ពស់នៃចតុកោណ
        // Define constants for the width and height of the rectangle
        final double width = 5.6;
        // កំណត់ថេរ width ជា 5.6
        // Define the constant width as 5.6
        final double height = 8.5;
        // កំណត់ថេរ height ជា 8.5
        // Define the constant height as 8.5

        // គណនាព័ទ្ធជុំវិញនៃចតុកោណ
        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (height + width);
        // គណនាព័ទ្ធជុំវិញដោយគណនា 2 * (height + width) ហើយរក្សាទុកក្នុងអថេរ perimeter
        // Calculate the perimeter by computing 2 * (height + width) and store it in the
        // variable perimeter

        // គណនាតំបន់នៃចតុកោណ
        // Calculate the area of the rectangle
        double area = width * height;
        // គណនាតំបន់ដោយគណនា width * height ហើយរក្សាទុកក្នុងអថេរ area
        // Calculate the area by computing width * height and store it in the variable
        // area

        // បង្ហាញព័ទ្ធជុំវិញដែលបានគណនាដោយប្រើ placeholders សម្រាប់តម្លៃ
        // Print the calculated perimeter using placeholders for values
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        // បង្ហាញព័ទ្ធជុំវិញដែលបានគណនាដោយប្រើ placeholders សម្រាប់ height, width, និង
        // perimeter
        // Print the calculated perimeter using placeholders for height, width, and
        // perimeter

        // បង្ហាញតំបន់ដែលបានគណនាដោយប្រើ placeholders សម្រាប់តម្លៃ
        // Print the calculated area using placeholders for values
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        // បង្ហាញតំបន់ដែលបានគណនាដោយប្រើ placeholders សម្រាប់ width, height, និង area
        // Print the calculated area using placeholders for width, height, and area
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise13
// Closes the Exercise13 class