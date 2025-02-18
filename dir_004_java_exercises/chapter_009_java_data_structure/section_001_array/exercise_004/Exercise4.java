// Define a class named Exercise4.
public class Exercise4 {
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare an integer array 'numbers' and initialize it with values.
        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };

        // Initialize a variable 'sum' to store the sum of array elements.
        int sum = 0;

        // Use a for loop to iterate over the elements of the 'numbers' array.
        for (int i = 0; i < numbers.length; i++) {
            // Add the current element to the sum.
            sum = sum + numbers[i];
        }

        // Calculate the average value by dividing the sum by the number of elements.
        double average = sum / numbers.length;

        // Print the calculated average value to the console.
        System.out.println("Average value of the array elements is : " + average);
    }
}
