package Decision;

import java.util.Scanner;
//import javax.swing.*;

public class ExerciseBMI
{
    private static final double a_pound = 0.45359237;
    private static final double an_inches = 0.0254;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double weight_pounds, height_inches, weight_kg, height_meters;
        double bmi;
        System.out.println(
                "What is your your weight in pounds? \n1 pound = " + a_pound + "your answer?");
        weight_pounds = input.nextDouble();
        System.out.println(
                "What is your height in inches? \n1 inches = " + an_inches + "your answer?");
        height_inches = input.nextDouble();

        weight_kg = weight_pounds / 2.2042;
        height_meters = height_inches * 0.0254;

        bmi = weight_kg / (height_meters * height_meters);
        System.out.printf("Your BMI is %5.2f\n", bmi);

        if (bmi < 18.5)
        {
            System.out.println("Your are underweight, please eat more!");
        } else if (bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.print("You are normal in weight, take daily calorie consistently");
        } else if (bmi >= 25 && bmi <= 29.9)
        {
            System.out.print("You are overweight, please exercise");
        } else if (bmi >= 30 && bmi <= 34.9)
        {
            System.out.print(
                    "You are obese, please make an effort to reduce calorie intake, consume healthy foods");
        } else if (bmi >= 35 && bmi <= 39.9)
        {
            System.out.print(
                    "You are severely obese, are you okay? Control your intake and stress!");
        } else
        {
            System.out.print(
                    "You are morbidly obese, are you okay? Control your intake and stress! do some light exercise too");
        }
    }
}

//        askWeight = JOptionPane.showInputDialog("What is your weight in pounds?");
//        JOptionPane.showMessageDialog(null, "1 pounds = 0.45359237", "Info", JOptionPane.INFORMATION_MESSAGE);
//        askHeight = JOptionPane.showInputDialog("What is your height in inches?");
//        JOptionPane.showMessageDialog(null, "1 pounds = 0.0254", "Info", JOptionPane.INFORMATION_MESSAGE);
//    private static String askWeight;
//    private static String askHeight;