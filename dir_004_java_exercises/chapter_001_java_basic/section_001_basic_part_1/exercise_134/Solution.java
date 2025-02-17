import java.util.*;

class Solution {
    // Static method to calculate the distinct ways to climb stairs
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // If there is 0 or 1 step, there is only 1 way to climb.
        }
        int[] s_case = new int[n + 1]; // Create an array to store the number of distinct ways for each step count.
        s_case[0] = 1; // There is 1 way to climb 0 steps.
        s_case[1] = 1; // There is 1 way to climb 1 step.
        for (int i = 2; i <= n; i++) {
            // Calculate the number of distinct ways for each step by adding the ways from
            // the previous two steps.
            s_case[i] = s_case[i - 1] + s_case[i - 2];
        }
        return s_case[n]; // Return the number of distinct ways to climb n steps.
    }

    public static void main(String[] args) {
        int steps = 5; // The number of steps to climb
        System.out.println("Distinct ways can you climb to the top: " + climbStairs(steps));
    }
}
