public class Main {

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564 };
        int search_num = 120;

        // Find the index of searched item
        int index_result = jumpSearch(nums, search_num);

        System.out.println(search_num + " is found at index " + index_result);

    }

    public static int jumpSearch(int[] nums, int item) {

        int array_size = nums.length;

        // Find block size to be jumped
        int block_size = (int) Math.floor(Math.sqrt(array_size));

        // If the element is present find the block where element is present
        int prev_item = 0;
        while (nums[Math.min(block_size, array_size) - 1] < item) {
            prev_item = block_size;
            block_size += (int) Math.floor(Math.sqrt(array_size));
            if (prev_item >= array_size)
                return -1;
        }

        // Using a linear search for element in block beginning with previous item
        while (nums[prev_item] < item) {
            prev_item++;
            if (prev_item == Math.min(block_size, array_size))
                return -1;
        }

        // If element is found
        if (nums[prev_item] == item)
            return prev_item;

        return -1;
    }
}
