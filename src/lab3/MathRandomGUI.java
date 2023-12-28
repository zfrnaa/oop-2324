/* Authors: Zulhafif/Zafran

prompts the user to enter an answer for a question on addition of any
random two digits. Using a while loop, the program will let the user repeatedly enter a new
answer until it is correct.

*/

package lab3;

import javax.swing.*;

public class MathRandomGUI
{

    public static void main(String[] args)
    {

        //declaring variables
        int num1, num2, correct_answer, user_answer;
        String answerString;

        //Getting random number and casting it into integer
        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);

        while (true)
        {
            correct_answer = num1 + num2;

            answerString = JOptionPane.showInputDialog("What is\n" + num1 + " + " + num2 + " ?");
            user_answer = Integer.parseInt(answerString);

            //if user enter the matching answer with the mathematics it will display the correct
            // message
            if (user_answer == correct_answer)
            {
                JOptionPane.showMessageDialog(null,
                                              "You got it!\n " + num1 + " + " + num2 + " = " +
                                              correct_answer,
                                              "Correct!",
                                              JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            } else
            {
                JOptionPane.showMessageDialog(null,
                                              "Wrong answer!\n Try again.", "Wrong Answer :(",
                                              JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}