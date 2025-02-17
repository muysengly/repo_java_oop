import java.util.Arrays;
public class ArraySortChecker {

  public static boolean isSorted(int[] arr) {
    return isSorted(arr, 0);
  }

  private static boolean isSorted(int[] arr, int index) {
    // Base case: if the index reaches the end of the array, 
    // the array is sorted
    if (index == arr.length - 1) {
      return true;
    }

    // Recursive case: check if the element at the current index 
    // is greater than the next element,
    // and recursively call the method with the next index
    if (arr[index] > arr[index + 1]) {
      return false;
    }

    return isSorted(arr, index + 1);
  }

  public static void main(String[] args) {
    int[] array1 = {
      1,
      2,
      3,
      4,
      5
    };
    System.out.println("Original Array: " + Arrays.toString(array1));
    boolean sorted1 = isSorted(array1);
    System.out.println("Is array1 sorted in ascending order? " + sorted1); // Output: true

    int[] array2 = {
      4,
      5,
      3,
      2,
      1
    };
    System.out.println("Original Array: " + Arrays.toString(array2));
    boolean sorted2 = isSorted(array2);
    System.out.println("Is array2 sorted in ascending order? " + sorted2); // Output: false
  }
}
