package Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double Principal, RateofInterest;
        int NoOfYears;
        double SimpleInterest;

        Scanner in = new Scanner(System.in);

        System.out.print("\n Enter Principal amount : ");
        Principal = in.nextDouble();

        System.out.print("\n Enter Rate of Interest : ");
        RateofInterest = in.nextDouble();

        System.out.print("\n Enter No of Years : ");
        NoOfYears = in.nextInt();

        SimpleInterest = (Principal * RateofInterest * NoOfYears) / 100;
        System.out.printf("\n Simple Interest = %.2f", SimpleInterest);
    }
}