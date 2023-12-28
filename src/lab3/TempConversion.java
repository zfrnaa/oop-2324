package lab3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConversion
{
    private static double celsius;
    private static double fahrenheit;

    public static double getCelsius()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the temperature in Celsius: ");
        celsius = input.nextDouble();
        return celsius;
    }

    public static double getFahrenheit()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nInsert the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        return fahrenheit;
    }

    public static double celsiusToFahrenheit(double celsius)
    {
        return (9.0 / 5.0) * celsius + 32;
    }

    public static void fahrenheitToCelsius()
    {
        celsius = (5.0 / 9.0) * (fahrenheit - 32);
    }

    public static void main(String[] args)
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Temperature Conversion");

        // Get the temperature in Celsius
        celsius = TempConversion.getCelsius();

        // Convert Celsius to Fahrenheit
        fahrenheit = celsiusToFahrenheit(celsius);

        // Print the temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is " + decimalFormat.format(fahrenheit));

        // Get the temperature in Fahrenheit
        fahrenheit = TempConversion.getFahrenheit();

        // Convert Fahrenheit to Celsius
        fahrenheitToCelsius();

        // Print the temperature in Celsius
        System.out.println("The temperature in Celsius is " + decimalFormat.format(celsius));
    }
}