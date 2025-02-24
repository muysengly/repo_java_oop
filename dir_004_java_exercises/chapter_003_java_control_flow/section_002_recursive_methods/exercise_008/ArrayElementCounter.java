public class ArrayElementCounter {

    public static <T> int countOccurrences(T[] arr, T target) {
        return countOccurrences(arr, target, 0);
    }

    private static <T> int countOccurrences(T[] arr, T target, int index) {
        // Base case: if the index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }

        // Recursive case: check if the element at the current index is equal to the
        // target,
        // and recursively call the method with the next index and add 1 if it is equal
        int count = countOccurrences(arr, target, index + 1);
        if (arr[index].equals(target)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {
                10,
                20,
                30,
                40,
                20,
                50,
                20,
                60
        };
        int target = 20;
        int occurrences = countOccurrences(numbers, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
    }
}
