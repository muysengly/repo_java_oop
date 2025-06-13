import java.util.ArrayList;

public class TIP {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterate over the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove an element
        fruits.remove("Banana");

        // Print the ArrayList after removal
        System.out.println("After removal: " + fruits);
    }
}