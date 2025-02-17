import java.util.*;

public class Exercise102 {
    public static void main(String[] args) {
        int[] array_nums = {11, 11, 13, 31, 45, 20, 33, 53};
        int result = 1; 
        System.out.println("Original Array: "+Arrays.toString(array_nums));

        // Iterate through the array
        for(int i = 0; i < array_nums.length; i++) {
            if(array_nums[i] == 10 || array_nums[i] == 30) {
                // If the element is equal to 10 or 30, set the result to 0
                result = 0;
            }
        }

        if (result == 1)
            System.out.printf(String.valueOf(false)); // If the result is 1, print false
        else
            System.out.printf(String.valueOf(true)); // If the result is not 1, print true
    }
}
