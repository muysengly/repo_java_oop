import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Initializing an array of integers
        Integer nums[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
        double sum = 0; // Initializing the sum variable
        // Displaying the original array
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(nums));
        // Calculating the sum of elements in the array
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        // Calculating the average of the elements in the array
        double average = (double) sum / nums.length;
        // Displaying the average of the array
        System.out.println("The average of the said array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are: ");
        // Printing numbers greater than the average in the array
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > average) {
                System.out.println(nums[i]);
            }
        }
    }
}
