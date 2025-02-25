public class Main {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Main
    // Declares a public class named Main

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declares the main method, the entry point of the program

        // បង្កើតអារេមួយដើម្បីរក្សាទុកបន្ទាត់នៃការរចនាអក្សរអាស៊ីស៊ី
        // Create an array to store lines of an ASCII art representation
        String[] arra = new String[5];
        // បង្កើតអារេថ្មីដែលមានទំហំ 5
        // Create a new array with a size of 5

        // បំពេញអារេដោយបន្ទាត់ដើម្បីបង្កើតការរចនាអក្សរអាស៊ីស៊ីនៃមុខសាមញ្ញ
        // Populate the array with lines to form an ASCII art representation of a simple
        // face
        arra[0] = " +\"\"\"\"\"+ ";
        // បំពេញអារេនៅទីតាំង 0 ដោយបន្ទាត់ " +\"\"\"\"\"+ "
        // Populate the array at index 0 with the line " +\"\"\"\"\"+ "
        arra[1] = "[| o o |]";
        // បំពេញអារេនៅទីតាំង 1 ដោយបន្ទាត់ "[| o o |]"
        // Populate the array at index 1 with the line "[| o o |]"
        arra[2] = " |  ^  |";
        // បំពេញអារេនៅទីតាំង 2 ដោយបន្ទាត់ " | ^ |"
        // Populate the array at index 2 with the line " | ^ |"
        arra[3] = " | '-' |";
        // បំពេញអារេនៅទីតាំង 3 ដោយបន្ទាត់ " | '-' |"
        // Populate the array at index 3 with the line " | '-' |"
        arra[4] = " +-----+";
        // បំពេញអារេនៅទីតាំង 4 ដោយបន្ទាត់ " +-----+"
        // Populate the array at index 4 with the line " +-----+"

        // ប្រើរង្វិលដើម្បីបង្ហាញបន្ទាត់នៃការរចនាអក្សរអាស៊ីស៊ី
        // Use a loop to print each line of the ASCII art representation
        for (int i = 0; i < 5; i++) {
            // បង្ហាញអារេនៅទីតាំង i
            // Print the array at index i
            System.out.println(arra[i]);
        }
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Main
// Closes the Main class