import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[] { 0, 1, 2, 3, 5, 7, 9, 12, 15, 17, 18, 21, 25, 32, 52, 54, 75, 89, 90, 93, 97, 104,
                120 };
        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));
        System.out.println("Input an element to search:");
        int val = scan.nextInt();
        int position = ternary_search(nums, val, 0, nums.length - 1);
        if (position == -1)
            System.out.println("\n" + val + " Element not found");
        else
            System.out.println("\n" + val + " element found at position " + position);

    }

    static int ternary_search(int[] nums, int val, int first_element, int last_element) {
        if (first_element > last_element) {
            return -1;
        }
        int mid1_element = first_element + (last_element - first_element) / 3;
        int mid2_element = first_element + 2 * (last_element - first_element) / 3;
        if (val == nums[mid1_element]) {
            return mid1_element;
        } else if (val == nums[mid2_element]) {
            return mid2_element;
        } else if (val > nums[mid1_element]) {
            first_element = mid1_element + 1;
        } else if (val < nums[mid2_element]) {
            last_element = mid2_element - 1;
        }
        return ternary_search(nums, val, first_element, last_element);
    }
}
