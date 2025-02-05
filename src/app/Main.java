package app;

public class Main {

    private static final double CONV_MI = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double km = 6;
        double mils = 4;
        double miles = convKmToMiles(km);
        double klm = convMilesToKm(mils);
        System.out.println("Result is " + miles + " miles and " + klm + " km");

    }

    private static double convKmToMiles(double km) {
        return km / CONV_MI;
    }
    private static double convMilesToKm(double miles) {
        return miles * CONV_MI;
    }
}
