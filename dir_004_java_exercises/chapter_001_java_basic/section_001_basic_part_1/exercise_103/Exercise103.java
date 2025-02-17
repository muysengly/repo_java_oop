import java.util.*;

public class Exercise103 {
    public static void main(String[] args) {
        int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53};
        int result = 0; 
        System.out.println("Original Array: "+Arrays.toString(array_nums)); 

        int l = array_nums.length - 1;
        int[] new_array;

        // Find the last occurrence of 10 in the array
        while(array_nums[l] != 10)
            l--;

        // Create a new array with elements after the last 10
        new_array = new int[array_nums.length - 1 - l];
        for(int i = l + 1; i < array_nums.length; i++)
            new_array[i - l - 1] = array_nums[i];

        System.out.println("New Array: "+Arrays.toString(new_array)); 
    }
}
