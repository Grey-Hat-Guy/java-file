package Java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Declare Variables
        float r, area;

        // Get user input for radius
        System.out.print("Enter radius of circle : ");

        Scanner in = new Scanner(System.in);
        r = in.nextFloat();

        // Calculation
        area = (float) (22.0 / 7) * r * r;

        // Display Area of Circle
        System.out.printf("\nArea of Circle with radius %.3f is %.3f", r, area);
    }
}
