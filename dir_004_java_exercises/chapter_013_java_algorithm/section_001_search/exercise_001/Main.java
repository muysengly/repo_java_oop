public class Main {
    public static int binarySearch(int[] nums, int flag) {
        int hi_num = nums.length - 1;
        int lo_num = 0;
        while (hi_num >= lo_num) {
            int guess = (lo_num + hi_num) >>> 1;
            if (nums[guess] > flag) {
                hi_num = guess - 1;
            } else if (nums[guess] < flag) {
                lo_num = guess + 1;
            } else {
                return guess;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 5, 6, 7, 8, 11 };
        int search_num = 7;
        int index = binarySearch(nums, search_num);
        if (index == -1) {
            System.out.println(search_num + " is not in the array");
        } else {
            System.out.println(search_num + " is at index " + index);
        }
    }
}
