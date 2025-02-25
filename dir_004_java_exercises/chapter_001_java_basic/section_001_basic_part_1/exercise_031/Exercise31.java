public class Exercise31 {
    // ប្រកាសថ្នាក់សាធារណៈមានឈ្មោះ Exercise31
    // Declare a public class named Exercise31

    public static void main(String[] args) {
        // ប្រកាស method main ដែលជាចំណុចចាប់ផ្តើមនៃកម្មវិធី
        // Declare the main method, the entry point of the program

        // បង្ហាញកំណែ Java
        // Display Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));
        // បង្ហាញកំណែ Java ដោយប្រើ System.getProperty("java.version")
        // Display Java version using System.getProperty("java.version")

        // បង្ហាញកំណែ Java runtime
        // Display Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        // បង្ហាញកំណែ Java runtime ដោយប្រើ System.getProperty("java.runtime.version")
        // Display Java runtime version using System.getProperty("java.runtime.version")

        // បង្ហាញថតផ្ទះ Java
        // Display Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));
        // បង្ហាញថតផ្ទះ Java ដោយប្រើ System.getProperty("java.home")
        // Display Java home directory using System.getProperty("java.home")

        // បង្ហាញឈ្មោះអ្នកលក់ Java
        // Display Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        // បង្ហាញឈ្មោះអ្នកលក់ Java ដោយប្រើ System.getProperty("java.vendor")
        // Display Java vendor name using System.getProperty("java.vendor")

        // បង្ហាញ URL អ្នកលក់ Java
        // Display Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        // បង្ហាញ URL អ្នកលក់ Java ដោយប្រើ System.getProperty("java.vendor.url")
        // Display Java vendor URL using System.getProperty("java.vendor.url")

        // បង្ហាញ Java class path
        // Display Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
        // បង្ហាញ Java class path ដោយប្រើ System.getProperty("java.class.path")
        // Display Java class path using System.getProperty("java.class.path")
    }
    // បិទ method main
    // Closes the main method
}
// បិទថ្នាក់ Exercise31
// Closes the Exercise31 class