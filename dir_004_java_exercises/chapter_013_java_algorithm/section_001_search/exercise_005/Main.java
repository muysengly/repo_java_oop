import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564 };
        int search_num = 120;

        // Find the index of searched item
        int index_result = exponentialSearch(nums, search_num);

        System.out.println(search_num + " is found at index " + index_result);

    }

    private static int exponentialSearch(int[] arr, int i) {
        int start_num = 0;

        if (arr[start_num] == i)
            return start_num;
        start_num = 1;
        while (start_num < arr.length && arr[start_num] <= i) {
            start_num *= 2;
        }
        return Arrays.binarySearch(arr, start_num / 2, Math.min(start_num, arr.length), i);
    }
}
