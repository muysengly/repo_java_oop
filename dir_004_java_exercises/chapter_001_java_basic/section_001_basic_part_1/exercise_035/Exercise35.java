import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input the number of sides on the polygon
        System.out.print("Input the number of sides on the polygon: ");
        
        // Read the number of sides from the user
        int ns = input.nextInt();
        
        // Prompt the user to input the length of one of the sides
        System.out.print("Input the length of one of the sides: ");
        
        // Read the length of one side from the user
        double side = input.nextDouble();
        
        // Calculate and display the area of the polygon
        System.out.print("The area is: " + polygonArea(ns, side) + "\n");
    }
    
    public static double polygonArea(int ns, double side) {
        // Calculate the area of a polygon based on the number of sides and side length
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}
