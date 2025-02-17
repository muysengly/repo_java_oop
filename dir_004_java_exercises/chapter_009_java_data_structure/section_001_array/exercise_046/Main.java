// Define the Main class.
public class Main
{
    // Define a method to check if there is a pair of elements in the array
    // that sum up to 'x'.
    static boolean sum_pair(int arr_int[], int n, int x)
    {
        int k;

        // Find the pivot point where the array is rotated.
        for (k = 0; k < n - 1; k++)
            if (arr_int[k] > arr_int[k + 1])
                break;

        int l = (k + 1) % n;
        int r = k;

        // Use two pointers approach to find a pair of elements with the sum 'x'.
        while (l != r)
        {
            if (arr_int[l] + arr_int[r] == x)
                return true;
            if (arr_int[l] + arr_int[r] < x)
                l = (l + 1) % n;
            else
                r = (n + r - 1) % n;
        }

        // If no pair is found, return false.
        return false;
    }

    // The main method for executing the program.
    public static void main(String[] args)
    {
        int arr_int[] = {22, 25, 17, 18, 19, 20};
        int sum = 42;
        int n = arr_int.length;

        // Check if there is a pair of elements in the array with the sum '42'.
        if (sum_pair(arr_int, n, sum))
            System.out.print("Array has a pair of elements with sum 42.");
        else
            System.out.print("Array has no pair with sum 42.");
    }
}
