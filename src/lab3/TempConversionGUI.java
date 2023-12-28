/* Authors: Zulhafif/Zafran

Program: To display the results of conversion either Celsius to Fahrenheit or Fahrenheit to Celsius

*/

package lab3;

import javax.swing.*;
import java.text.DecimalFormat;

public class TempConversionGUI
{
    static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static double celsiusToFahrenheit(double celsius)
    {
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        return fahrenheit;
    }

    public static void fahrenheitToCelsius(double Fahrenheit)
    {
        double celsius = 5.0 / 9.0 * (Fahrenheit - 32.0);
        JOptionPane.showMessageDialog(null,
                                      "Fahrenheit: " + Fahrenheit + " °F\nFahrenheit: " +
                                      decimalFormat.format(celsius) +
                                      " °C",
                                      "Fahrenheit To Celsius", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args)
    {

        int choice;
        double num;
        String choiceString, numString;

        numString = JOptionPane.showInputDialog("Temperature Converter\nEnter a value");
        num = Double.parseDouble(numString);

        choiceString = JOptionPane.showInputDialog(
                "Temperature Format\nEnter a desired format conversion\n1. Celsius To Fahrenheit\n2. Fahrenheit To Celsius");
        choice = Integer.parseInt(choiceString);

        switch (choice)
        {
            case 1:
                double cToF = celsiusToFahrenheit(num);
                JOptionPane.showMessageDialog(null,
                                              "Celsius: " + num + " °C\nFahrenheit:" +
                                              " " + decimalFormat.format(cToF) +
                                              " °F",
                                              "Celsius To Fahrenheit",
                                              JOptionPane.INFORMATION_MESSAGE);
                break;

            case 2:
                fahrenheitToCelsius(num);
                break;

            default:
                JOptionPane.showMessageDialog(null,
                                              "Invalid number input!", "Error",
                                              JOptionPane.ERROR_MESSAGE);
                break;
        }
//                System.exit(0);
    }
}

//import java.util.Scanner;

//public class TempConversionGUI
//{
//    private static double celsius;
//    private static double fahrenheit;
//
//    public static double getCelsius()
//    {
//        Scanner input = new Scanner(System.in);
//        JOptionPane.showInputDialog("Insert the temperature in Celsius:");
////        System.out.println("Insert the temperature in Celsius: ");
//        celsius = input.nextDouble();
//        return celsius;
//    }
//
//    public static double getFahrenheit()
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.println("\nInsert the temperature in Fahrenheit: ");
//        fahrenheit = input.nextDouble();
//        return fahrenheit;
//    }
//
//    public static double celsiusToFahrenheit(double celsius)
//    {
//        return (9.0 / 5.0) * celsius + 32;
//    }
//
//    public static void fahrenheitToCelsius()
//    {
//        celsius = (5.0 / 9.0) * (fahrenheit - 32);
//    }
//
//    public static void main(String[] args)
//    {
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//
//        System.out.println("Temperature Conversion");
//
//        // Get the temperature in Celsius
//        celsius = TempConversionGUI.getCelsius();
//
//        // Convert Celsius to Fahrenheit
//        fahrenheit = celsiusToFahrenheit(celsius);
//
//        // Print the temperature in Fahrenheit
//        System.out.println("The temperature in Fahrenheit is " + decimalFormat.format(fahrenheit));
//
//        // Get the temperature in Fahrenheit
//        fahrenheit = TempConversionGUI.getFahrenheit();
//
//        // Convert Fahrenheit to Celsius
//        fahrenheitToCelsius();
//
//        // Print the temperature in Celsius
//        System.out.println("The temperature in Celsius is " + decimalFormat.format(celsius));
//    }
//}