// Define a class named Main
public class Main {
    
    // The main method, entry point of the program
    public static void main(String[] args) {
        // Define the main string
        String main_string = "Java is the foundation for virtually every type of " +
            "networked application and is the global standard for developing and " +
            " delivering embedded and mobile applications, games, Web-based content, " +
            " and enterprise software. With more than 9 million developers worldwide," +
            " Java enables you to efficiently develop, deploy and use exciting applications and services.";

        // Display the original string
        System.out.println("Original string:");
        System.out.println(main_string);

        // Define two sub-strings to search within the main string
        String sub_string1 = "million";
        String sub_string2 = "millions";

        // Check if the first sub-string is present in the main string
        boolean result1 = is_present(main_string, sub_string1);
        System.out.println("\nIs '" + sub_string1 + "'" + " present in the said text?");
        System.out.println(result1);

        // Check if the second sub-string is present in the main string
        boolean result2 = is_present(main_string, sub_string2);
        System.out.println("\nIs '" + sub_string2 + "'" + " present in the said text?");
        System.out.println(result2);
    }

    // Method to check if a sub-string is present in the main string
    public static boolean is_present(String main_string, String sub_string) {
        // Check for null or empty strings
        if (main_string == null || sub_string == null || main_string.isEmpty() || sub_string.isEmpty()) {
            return false;
        }

        // Check if the sub-string exists in the main string
        return main_string.indexOf(sub_string) != -1;
    }
}
