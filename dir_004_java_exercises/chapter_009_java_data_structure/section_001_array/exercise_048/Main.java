// Import the necessary Java utility class for working with arrays.
import java.util.Arrays;

// Define the Main class.
public class Main {

    // The main method for executing the program.
    public static void main(String[] args) {
        // Define an array of integers.
        int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        
        // Print the original array.
        System.out.println("Original Array: " + Arrays.toString(nums)); 
        
        // Call the sort_nums method to modify the array.
        sort_nums(nums);
        
        // Print the modified array.
        System.out.println("New Array: " + Arrays.toString(nums)); 
    }
    
    // Method to sort the numbers in the array based on their signs.
    public static void sort_nums(int[] nums){
        int pos_num = 0;
        int neg_num = 0;
        int i, j;
        int max = Integer.MIN_VALUE;

        // Count the positive and negative numbers and find the maximum value.
        for(i = 0; i < nums.length; i++){
            if(nums[i] < 0) neg_num++;
            else pos_num++;
            if(nums[i] > max) max = nums[i];
        }
        max++;

        // If there are no negative or positive numbers, return.
        if(neg_num == 0 || pos_num == 0) return;

        i = 0;
        j = 1;
        
        // Reorder the array.
        while(true){
            while(i <= neg_num && nums[i] < 0) i++;
            while(j < nums.length && nums[j] >= 0) j++;
            
            if(i > neg_num || j >= nums.length) break;
            
            nums[i] += max * (i + 1);
            swap_nums(nums, i, j);
        }

        i = nums.length - 1;
        
        // Adjust the values to their original range.
        while(i >= neg_num){
            int div = nums[i] / max;
            
            if(div == 0) i--;
            else{
                nums[i] %= max;
                swap_nums(nums, i, neg_num + div - 2); 
            }
        }
    }
    
    // Method to swap elements in the array.
    private static void swap_nums(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
