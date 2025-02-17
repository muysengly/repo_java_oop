import java.util.*;

public class Exercise106 {
    public static void main(String[] args) {
        int[] array_nums = {11, 15, 13, 10, 45, 20};
        System.out.println("Original Array: "+Arrays.toString(array_nums)); 
        
        if (array_nums.length > 1) {
            int first = array_nums[0];

            // Shift elements to the left by one position
            for (int i = 1; i < array_nums.length; i++)
                array_nums[i - 1] = array_nums[i];

            // Move the first element to the end of the array
            array_nums[array_nums.length - 1] = first;

            System.out.println("New Array: "+Arrays.toString(array_nums)); 
        }
    }
}
