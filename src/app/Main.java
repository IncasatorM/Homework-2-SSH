package app;

import java.util.Scanner;

public class Main {

    private static final double CONV_MI = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double km = 6;
        double miles = convKmToMiles(km);
        System.out.println("Result is " + miles + " miles.");
    }

    private static double convKmToMiles(double km) {
        return km / CONV_MI;
    }
}
