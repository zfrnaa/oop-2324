package Kuliah5;

import javax.swing.*;
//import java.util.Scanner;

public class Kuliah5_4 {
    
    public static final float RATE = 15.0F;
    public static final float OVERRATE = 25.0F;
    public static void main(String[] args) {
        
        int hoursWorked;
        float regularPay, overtimePay;
        String hourString;

        hourString = JOptionPane.showInputDialog("Enter your work hours: ");
        hoursWorked = Integer.parseInt(hourString);

        if (hoursWorked > 40) {
            regularPay = 40 * OVERRATE;
            overtimePay = (float)((hoursWorked - 40) * 1.5 * RATE);

        }else{
            regularPay = 40 * RATE;
            overtimePay = 0.0F;        
        }

        JOptionPane.showMessageDialog(null,"Your work hours: " + hoursWorked + 
        "\nYour regular pay is: RM" + regularPay + "\nYour overtime pay is: RM" + overtimePay,
        "Total Pay Result", 
        JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
