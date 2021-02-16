//Convert temperature fahrenheit into celsius
package Java;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        // Declare the variables
        double F, C;

        // Get Fahrenheit temperature
        System.out.print("\nEnter Fahrenheit temperature : ");
        Scanner in = new Scanner(System.in);
        F = in.nextDouble();

        // Calculate the celsius
        C = (5 / 9.0) * (F - 32);

        // Display the result
        System.out.printf("\n%.2f deg F is %.2f deg C ", F, C);
    }
}
