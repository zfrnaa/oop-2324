package Decision;
import javax.swing.*;

public class BMIGUI {

    private static final double A_POUND = 0.45359237;
    private static final double AN_INCHES = 0.0254;

    public static void main(String[] args) {
        String weightStr = JOptionPane.showInputDialog(null, "What is your weight in pounds?\n(1 pound = " + A_POUND + " kg)", "Enter Weight", JOptionPane.QUESTION_MESSAGE);
        double weightPounds = Double.parseDouble(weightStr);

        String heightStr = JOptionPane.showInputDialog(null, "What is your height in inches?\n(1 inch = " + AN_INCHES + " meters)", "Enter Height", JOptionPane.QUESTION_MESSAGE);
        double heightInches = Double.parseDouble(heightStr);

        double weightKg = weightPounds / 2.2042;
        double heightMeters = heightInches * 0.0254;
        double bmi = weightKg / (heightMeters * heightMeters);

        String bmiMessage = "Your BMI is " + String.format("%.2f", bmi);

        String healthMessage;
        if (bmi < 18.5) {
            healthMessage = "You are underweight, please eat more!";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            healthMessage = "You are normal in weight, take daily calorie consistently";
        } else if (bmi >= 25 && bmi <= 29.9) {
            healthMessage = "You are overweight, please exercise";
        } else if (bmi >= 30 && bmi <= 34.9) {
            healthMessage = "You are obese, please make an effort to reduce calorie intake, consume healthy foods";
        } else if (bmi >= 35 && bmi <= 39.9) {
            healthMessage = "You are severely obese, are you okay? Control your intake and stress!";
        } else {
            healthMessage = "You are morbidly obese, are you okay? Control your intake and stress! do some light exercise too";
        }

        JOptionPane.showMessageDialog(null, bmiMessage + "\n" + healthMessage, "BMI Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
