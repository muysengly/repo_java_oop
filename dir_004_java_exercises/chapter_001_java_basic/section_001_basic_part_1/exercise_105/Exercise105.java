import java.util.*;

public class Exercise105 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Original Array: " + Arrays.toString(array_nums));

        int result = 0;
        int l = 2;
        int start = 0;
        int end = array_nums.length - l;
        
        // Check if the elements at corresponding positions within the range [start, end] are equal.
        for (; l > 0; l--) {
            if (array_nums[start] != array_nums[end]) {
                result = 1;
            } else {
                start++;
                end++;
            }
        }

        if (result == 1) {
            System.out.printf(String.valueOf(false));
        } else {
            System.out.printf(String.valueOf(true));
        }

        System.out.printf("\n");
    }
}
