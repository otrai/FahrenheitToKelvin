import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        // to store the user's input and the Kelvin equivalent value
        double fahrenheit = 0.0;
        double kelvin = 0.0;

        // Below this comment: collect the required inputs from the user
        System.out.print("Enter temperature in Fahrenheit : ");
        fahrenheit = scnr.nextDouble();

        // Below this comment: call your FahrenheitToKelvin method
        kelvin = fahrenheitToKelvin(fahrenheit);

        // Below this comment: display the required results
        System.out.printf("%.2f degrees from Fahrenheit to Kelvin is %.2f\n"
                , fahrenheit, kelvin);
    }

    // define your FahrenheitToKelvin method here below
    public static double fahrenheitToKelvin (double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9 + 273.15;
    }



}