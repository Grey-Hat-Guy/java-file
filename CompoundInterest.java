package Java;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // Declare Variables
        double P, R, N, I;
        double result;

        // Input Principal, RateofInterest, No of Years
        Scanner in = new Scanner(System.in);
        System.out.print("\nEnter Principal Amount : ");
        P = in.nextDouble();

        System.out.print("\nEnter Rate of Interest : ");
        R = in.nextDouble();

        System.out.print("\nEnter No of Years : ");
        N = in.nextDouble();

        // Calculate Compound Interest
        I = R / 100;
        result = P * Math.pow(1 + I, N);

        // Display the result
        System.out.printf("\nCompound Interest is %.2f", result);
    }

}
