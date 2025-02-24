public class DigitSumCalculator {

    public static int calculateDigitSum(int number) {
        // Base case: if the number is a single digit, return the number itself
        if (number < 10) {
            return number;
        }

        // Recursive case: calculate the sum of the last digit and the digit sum of the
        // remaining number
        int lastDigit = number % 10;
        int remainingNumber = number / 10;

        return lastDigit + calculateDigitSum(remainingNumber);
    }

    public static void main(String[] args) {
        int number = 123456;
        int digitSum = calculateDigitSum(number);
        System.out.println("The sum of the digits of " + number + " is: " + digitSum);
    }
}
