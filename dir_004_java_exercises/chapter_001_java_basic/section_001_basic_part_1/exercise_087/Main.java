import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int sum = 0;
            // Read a line of text from the user
            String str = br.readLine();
            char[] numStr = str.toCharArray();

            // Calculate the sum of the digits in the input number
            for (int i = 0; i < numStr.length; i++) {
                sum += numStr[i] - '0';
            }

            // Print the original number and call the print_number function
            System.out.println("Original Number: " + str);
            print_number(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print_number(int n) {
        int x;
        int y;
        int z;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Print the sum of the digits of the number
        System.out.println("Sum of the digits of the said number: " + n);

        if (n < 10) {
            // If the number is less than 10, print the corresponding word
            System.out.println(number[n]);
        } else if (n < 100) {
            // If the number is less than 100, split it into tens and ones
            x = n / 10;
            y = n - x * 10;
            System.out.println("In English: " + number[x] + " " + number[y]);
        } else {
            // If the number is three digits, split it into hundreds, tens, and ones
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            System.out.println("In English: " + number[x] + " " + number[y] + " " + number[z]);
        }
    }
}
