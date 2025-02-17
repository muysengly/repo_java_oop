import java.util.Arrays;
 public class Stooge {
    public static void main(String[] args) {
      System.out.println("Original Array:");
        int[] nums = {7, -5, 3, 2, 1, 0, 45};
        System.out.println(Arrays.toString(nums));
        stoogeSort(nums);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
    }
 
    public static void stoogeSort(int[] L) {
        stoogeSort(L, 0, L.length - 1);
    }
 
    public static void stoogeSort(int[] L, int i, int j) {
        if (L[j] < L[i]) {
            int tmp = L[i];
            L[i] = L[j];
            L[j] = tmp;
        }
        if (j - i > 1) {
            int t = (j - i + 1) / 3;
            stoogeSort(L, i, j - t);
            stoogeSort(L, i + t, j);
            stoogeSort(L, i, j - t);
        }
    }
}

