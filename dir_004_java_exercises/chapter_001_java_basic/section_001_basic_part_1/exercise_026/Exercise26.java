import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Define an array to map octal digits to their binary equivalents
        int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        
        // Declare variables to store octal, temporary octal, and binary numbers, and a place value
        long octal_num, tempoctal_num, binary_num, place;
        int rem;
        
        // Prompt the user to input an octal number
        System.out.print("Input any octal number: ");
        octal_num = in.nextLong();
        tempoctal_num = octal_num;
        binary_num = 0;
        place = 1;
        
        // Convert the octal number to binary using the mapping array
        while (tempoctal_num != 0) {
            rem = (int)(tempoctal_num % 10);
            binary_num = octal_numvalues[rem] * place + binary_num;
            tempoctal_num /= 10;
            place *= 1000;
        }
        
        // Display the equivalent binary number
        System.out.print("Equivalent binary number: " + binary_num + "\n");
    }
}
