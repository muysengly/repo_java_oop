import java.util.Scanner; // Import the Scanner class from the java.util package to read input from the user

public class Main { // Define a public class named Main

    public static void main(String[] Strings) { // Main method to execute the program

        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console

        System.out.print("Input an integer between 0 and 1000: "); // Prompt the user to input an integer between 0 and
                                                                   // 1000
        int num = input.nextInt(); // Read the user's input as an integer and store it in the variable num

        int firstDigit = num % 10; // Extract the last digit of the number
        int remainingNumber = num / 10; // Remove the last digit from the number
        int secondDigit = remainingNumber % 10; // Extract the new last digit of the remaining number
        remainingNumber = remainingNumber / 10; // Remove the last digit from the remaining number
        int thirdDigit = remainingNumber % 10; // Extract the new last digit of the remaining number
        remainingNumber = remainingNumber / 10; // Remove the last digit from the remaining number
        int fourthDigit = remainingNumber % 10; // Extract the new last digit of the remaining number
        int sum = thirdDigit + secondDigit + firstDigit + fourthDigit; // Calculate the sum of all extracted digits
        System.out.println("The sum of all digits in " + num + " is " + sum); // Print the sum of all digits in the
                                                                              // input number

    }
}
