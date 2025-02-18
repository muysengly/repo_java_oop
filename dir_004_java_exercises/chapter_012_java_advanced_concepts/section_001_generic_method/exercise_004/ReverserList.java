
// ReverserList.java
// ReverserList Class
import java.util.ArrayList;
import java.util.List;

public class ReverserList {

    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<String> colors = List.of("Red", "Green", "Orange");

        List<Integer> reversedNumbers = reverseList(numbers);
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed numbers: " + reversedNumbers); // Output: [6, 5, 4, 3, 2, 1]

        List<String> reversedWords = reverseList(colors);
        System.out.println("\nOriginal list of colors: " + colors);
        System.out.println("Reversed colors: " + reversedWords); // Output: [Orange, Green, Red]
    }
}
