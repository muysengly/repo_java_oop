
// ReverserList.java
// ReverserList Class
import java.util.ArrayList;
import java.util.List;

public class Merge_two_lists {

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();

        int maxLength = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxLength; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }

            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 8, 10);
        System.out.println("List of numbers:");
        System.out.println(nums1);
        System.out.println(nums2);
        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink");
        System.out.println("\nList of colors:");
        System.out.println(colors1);
        System.out.println(colors2);
        List<Integer> mergedNumbers = mergeLists(nums1, nums2);
        // Output:[1, 2, 3, 4, 5, 8, 7, 10]
        System.out.println("\nMerged Numbers: " + mergedNumbers);
        // Output:[Red, White, Green, Black, Blue, Orange, Pink]
        List<String> mergedWords = mergeLists(colors1, colors2);
        System.out.println("Merged Colors: " + mergedWords);
    }
}
