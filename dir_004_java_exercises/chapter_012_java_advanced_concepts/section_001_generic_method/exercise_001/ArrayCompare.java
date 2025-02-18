import java.util.Arrays;

public class ArrayCompare {
    public static <T> boolean compare_Arrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Integer[] arr1 = { 1, 2, 3, 4, };
        Integer[] arr2 = { 1, 2, 4, 4 };
        Integer[] arr3 = { 1, 2, 3, 4 };

        String[] arr4 = { "Java", "World" };
        String[] arr5 = { "JavaScript", "World" };
        String[] arr6 = { "Java", "World" };

        System.out.println("Original arrays:");
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
        System.out.println("arr4: " + Arrays.toString(arr4));
        System.out.println("arr5: " + Arrays.toString(arr5));
        System.out.println("arr6: " + Arrays.toString(arr6));
        System.out.println("\nCompare arr1 and arr2: " + compare_Arrays(arr1, arr2)); // false
        System.out.println("Compare arr1 and arr3: " + compare_Arrays(arr1, arr3)); // true
        System.out.println("Compare arr4 and arr5: " + compare_Arrays(arr4, arr5)); // false
        System.out.println("Compare arr4 and arr6: " + compare_Arrays(arr4, arr6)); // true
    }
}
