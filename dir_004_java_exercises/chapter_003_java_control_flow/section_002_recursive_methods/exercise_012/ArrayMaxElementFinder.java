import java.util.Arrays;
public class ArrayMaxElementFinder {

  public static int findMaxElement(int[] arr) {
    return findMaxElement(arr, 0, arr.length - 1);
  }

  private static int findMaxElement(int[] arr, int left, int right) {
    // Base case: if the left and right indices are equal, 
    // we have a single element and return it as the maximum
    if (left == right) {
      return arr[left];
    }

    // Recursive case: divide the array into two halves, recursively 
    //find the maximum in each half,and return the greater of the 
    // two maximums
    int mid = (left + right) / 2;
    int maxLeft = findMaxElement(arr, left, mid);
    int maxRight = findMaxElement(arr, mid + 1, right);

    return Math.max(maxLeft, maxRight);
  }

  public static void main(String[] args) {
    int[] array = {
      34,
      45,
      34,
      23,
      56,
      62,
      27,
      55
    };
    System.out.println("Original Array: " + Arrays.toString(array));
    int maxElement = findMaxElement(array);
    System.out.println("The maximum element in the array is: " + maxElement);
  }
