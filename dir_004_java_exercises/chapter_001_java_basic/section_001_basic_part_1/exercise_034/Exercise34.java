import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input the length of a side of the hexagon
        System.out.print("Input the length of a side of the hexagon: ");
        
        // Read the length of a side from the user
        double s = input.nextDouble();
        
        // Calculate and display the area of the hexagon
        System.out.print("The area of the hexagon is: " + hexagonArea(s) + "\n");
    }

    public static double hexagonArea(double s) {
        // Calculate the area of a hexagon based on its side length
        return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
    }
}
