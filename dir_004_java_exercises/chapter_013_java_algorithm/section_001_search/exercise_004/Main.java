public class Main {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564 };
        int searched_num = 91;
        // Find the index of searched item
        int index_result = Interpolation_search(nums, searched_num);
        System.out.println(searched_num + " is found at index " + index_result);
    }

    public static int Interpolation_search(int[] nums, int searched_num) {
        int low_num = 0;
        int high_num = nums.length - 1;
        int mid_num;
        while (nums[high_num] != nums[low_num] && nums[low_num] < searched_num && nums[high_num] >= searched_num) {
            mid_num = low_num
                    + ((searched_num - nums[low_num]) * (high_num - low_num) / (nums[high_num] - nums[low_num]));
            if (searched_num > nums[mid_num])
                low_num = mid_num + 1;
            else if (searched_num < nums[mid_num])
                high_num = mid_num - 1;
            else
                return mid_num;
        }
        if (nums[low_num] == searched_num) {
            return low_num;
        } else {
            return -1;
        }
    }
}
