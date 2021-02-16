//Calculate Volume and Area of Sphere
package Java;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        // Declare the variables
        double R, A, V;

        // Get radius
        System.out.print("\nEnter Radius of Sphere : ");
        Scanner input = new Scanner(System.in);
        R = input.nextDouble();

        // Calculate Area and Volume
        V = ((4 * (22.0 / 7) * Math.pow(R, 3))) / 3;
        A = 4 * (22.0 / 7) * R * R;

        // Display result
        System.out.printf("\nVolume of Sphere :%.3f ", V);
        System.out.printf("\nArea of Sphere :%.3f", A);
    }
}
