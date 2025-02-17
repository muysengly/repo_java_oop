// Define a class named Exercise22.
public class Exercise22 {
    // Create a static method named pairs_value that takes an integer array and an input number.
    static void pairs_value(int inputArray[], int inputNumber) {
        System.out.println("Pairs of elements and their sum : ");

        // Iterate through the elements of the inputArray.
        for (int i = 0; i < inputArray.length; i++) {
            // Iterate through the elements following the current i.
            for (int j = i + 1; j < inputArray.length; j++) {
                // Check if the sum of inputArray[i] and inputArray[j] equals the inputNumber.
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    // Print the pair of elements and their sum.
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
                }
            }
        }
    }

    // The main method for executing the program.
    public static void main(String[] args) {
        // Call the pairs_value method with a sample array and input number.
        pairs_value(new int[]{2, 7, 4, -5, 11, 5, 20}, 15);

        // Call the pairs_value method with another sample array and input number.
        pairs_value(new int[]{14, -15, 9, 16, 25, 45, 12, 8}, 30);
    }
}
