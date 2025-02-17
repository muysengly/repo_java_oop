// Import the necessary Java utility class for working with arrays.
import java.util.Arrays;
 
// Define the Main class.
public class Main
{
    // A method to rearrange an array with alternating smaller and larger elements.
    static int[] rearrange(int[] new_arra, int n)
    {
        // Create a temporary array for the rearranged elements.
        int temp[] = new int[n];
     
        // Initialize pointers for the smallest and largest elements.
        int small_num = 0, large_num = n - 1;
        // Initialize a flag for alternating between small and large elements.
        boolean flag = true;
     
        // Iterate through the array and rearrange elements.
        for (int i = 0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            // Toggle the flag to switch between small and large elements.
            flag = !flag;
        }
     
        return temp;
    }
 
    // The main method for executing the program.
    public static void main(String[] args) 
    {
        // Create an array of integers.
        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];
         
        // Print the original array.
        System.out.println("Original Array ");
        System.out.println(Arrays.toString(nums));
         
        // Rearrange the array.
        result = rearrange(nums, nums.length);
         
        // Print the rearranged array.
        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));
    }
}
