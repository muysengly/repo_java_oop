
// Import the necessary Java utilities package.
import java.util.*;

// Define a class named Exercise14.
public class Exercise14 {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize two string arrays, array1 and array2.
        String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
        String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

        // Print the original contents of array1 and array2.
        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        // Create a HashSet to store common elements.
        HashSet<String> set = new HashSet<String>();

        // Iterate through both arrays to find and store common elements.
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                // Check if elements in array1 and array2 are equal.
                if (array1[i].equals(array2[j])) {
                    // Add the common element to the HashSet.
                    set.add(array1[i]);
                }
            }
        }

        // Print the common elements.
        System.out.println("Common element : " + (set)); // OUTPUT: [SQL, JAVA]
    }
}
//