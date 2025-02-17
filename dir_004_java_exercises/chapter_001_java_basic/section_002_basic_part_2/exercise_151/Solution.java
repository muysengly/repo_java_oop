public class Solution {
    public static void main(String[] args) {
        // Calculate the result of (101 + 0) divided by 3
        int r1 = (101 + 0) / 3;

        // Calculate the result of 3.0e-6 multiplied by 10000000.1
        double r2 = 3.0e-6 * 10000000.1;

        // Determine if both operands (true and true) are true using the AND operator
        boolean r3 = true && true;

        // Determine if one operand is false among true and false using the AND operator
        boolean r4 = false && true;

        // Determine if at least one operand is true among different combinations using the OR and AND operators
        boolean r5 = (false && false) || (true && true);

        // Determine if both sets of operands separately evaluate to false and true, using OR and AND operators
        boolean r6 = (false || false) && (true && true);
        
        // Display the results of the calculations
        System.out.println("(101 + 0) / 3) -> " + r1);
        System.out.println("(3.0e-6 * 10000000.1) -> " + r2);
        System.out.println("(true && true) -> " + r3);
        System.out.println("(false && true) -> " + r4);
        System.out.println("((false && false) || (true && true)) -> " + r5);
        System.out.println("(false || false) && (true && true) -> " + r6);
    }
} 
