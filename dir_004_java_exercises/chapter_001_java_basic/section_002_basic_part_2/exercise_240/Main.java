// Importing required Java classes
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Main class named "Main"
public class Main {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Prompting the user to input numbers (Ctrl+C to exit)
        System.out.println("Input the numbers (Ctrl+C to exit):");
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Creating a List to store input lines as strings
        List<String> l = new ArrayList<>(); // Specify the type of List as String
        // Reading input until the user exits (Ctrl+C)
        while(sc.hasNext()) {
            l.add(sc.next());
        }
        // Getting the number of input lines
        int n = l.size();
        // Creating a 2D array 'a' to store parsed integers from input lines
        int[][] a = new int[n][];
        // Parsing input lines and populating the 2D array 'a'
        for(int i = 0; i < n; i++) {
            String[] s = l.get(i).split(",");
            int k = s.length;
            a[i] = new int[k];
            for(int j = 0; j < k; j++) {
                a[i][j] = Integer.parseInt(s[j]);
            }
        }
        // Initializing an array 'sd' with the first element of the first row of 'a'
        int[] sd = {a[0][0]};
        // Dynamic programming approach to find the maximum sum
        for(int i = 1; i < n; i++) {
            int[] tmp = new int[a[i].length];
            for(int j = 0; j < tmp.length; j++) {
                if(i <= n / 2) {
                    if(j == 0) tmp[j] = sd[j] + a[i][j];
                    else if(j == tmp.length - 1) tmp[j] = sd[j - 1] + a[i][j];
                    else tmp[j] = Math.max(sd[j - 1] + a[i][j], sd[j] + a[i][j]);
                }
                else {
                    tmp[j] = Math.max(sd[j] + a[i][j], sd[j + 1] + a[i][j]);
                }
            }
            sd = tmp;
        }
        // Prompting the user with the result
        System.out.println("Maximum value of the sum of integers passing according to the rule on one line.");
        // Printing the final result
        System.out.println(sd[0]);
    }
}
