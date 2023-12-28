/* Authors: Zulhafif/Zafran

Program: a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday,
Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly

*/

package lab3;

import javax.swing.*;

public class DaysInWeekGUI
{
    public static void main(String[] args) throws Exception {

        int num;
        String daynumString, dayString;

        daynumString = JOptionPane.showInputDialog("Day Counter!\nEnter a number between 0-6:");

        num = Integer.parseInt(daynumString);

        switch (num) {
            case 0:
                dayString = "Sunday";
                break;

            case 1:
                dayString = "Monday";
                break;

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednesday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            default:
                dayString = "Invalid Input!";
                JOptionPane.showMessageDialog(null,
                                              "Invalid number input!", "Error",
                                              JOptionPane.ERROR_MESSAGE);

                System.exit(0);
                break;
        }

        JOptionPane.showMessageDialog(null,
                                      "The number you entered:\n " + num + "\nThe day you chose:\n" + dayString,
                                      "Result",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}
