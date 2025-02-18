// Main.java

// Declare the Main class
public class Main {
    public static void main(String[] args) {
        // Create an array of integers to be sorted
        int[] arr = {
                4,
                2,
                0,
                3,
                1,
                6,
                8
        };

        // Create an instance of BubbleSort and perform sorting
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.print("Bubble Sort: ");
        printArray(arr);

        // Create an instance of SelectionSort and perform sorting
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.print("Selection Sort: ");
        printArray(arr);
    }

    // Method to print the elements of an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
// SelectionSort.java

// Declare the SelectionSort class, which implements the Sortable interface
class SelectionSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Outer loop for the current element
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
// BubbleSort.java

// Declare the BubbleSort class, which implements the Sortable interface
class BubbleSort implements Sortable {
    // Implement the "sort" method required by the Sortable interface
    public void sort(int[] arr) {
        // Get the length of the array
        int n = arr.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons and swaps
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
// Sortable.java

// Declare the Sortable interface
interface Sortable {
    // Declare the abstract method "sort" that classes implementing this interface
    // must provide
    void sort(int[] arr);
}
