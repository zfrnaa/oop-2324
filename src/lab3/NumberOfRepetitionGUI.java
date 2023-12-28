/* Authors: Zulhafif/Zafran

Program: ask user to enter a number that represents repetition. Then, the user needs to enter
any random number based on the number of repetition. Lastly, display the average of these
numbers and count how many numbers that above the average

*/

package lab3;

import javax.swing.*;

public class NumberOfRepetitionGUI {

    private final String INPUT_MESSAGE = "Please insert the number of repetition";

    private String repetitionMessage;

    private String inputNumber;

    public NumberOfRepetitionGUI() {

        double number;
        inputNumber = JOptionPane.showInputDialog(null,INPUT_MESSAGE);

        int repetitionTimes = Integer.parseInt(inputNumber);

        // Sum the numbers
        number = sumNumbers(repetitionTimes);

        // Calculate the average of the numbers
        double average = number / repetitionTimes;

        JOptionPane.showMessageDialog(null,
                                      "Repetition: " + repetitionTimes + "\nThe average from " +
                                      "repetition is: " + average,
                                     "Result", JOptionPane.INFORMATION_MESSAGE);
    }


    private double sumNumbers(int repetitionTimes) {
        double sum = 0.0;
        for (int i = 0; i < repetitionTimes; i++) {
            // Prompt the user to enter a number
            repetitionMessage = JOptionPane.showInputDialog("Enter number " + (i + 1) + ": ");
            double number = Double.parseDouble(repetitionMessage);

            //every number user input will do addition
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        //initialize object
        new NumberOfRepetitionGUI();
    }
}

//public class NumberOfRepetitionGUI {
//
//    private static double number[];
//
//    public static void main(String[] args){
//
//        int i, repetition, aboveAverageCount = 0;
//        String re_String, iString;
//        double average, total = 0;
//
//        re_String = JOptionPane.showInputDialog("Enter the number of items:");
//        repetition = Integer.parseInt(re_String);
//
//        number = new double[repetition];
//
////        number = 0.0; // Initialize the number variable to 0 outside the loop
//        for (i= 0 ; i < repetition; i++){
//            iString= JOptionPane.showInputDialog("Enter number " + (i+1) );
//            number[i] = Double.parseDouble(iString);
//            total += number[i];
//        }
//
//        average = total/repetition;
//
//        for (i = 0; i < repetition; i++) {
//            if (number[i] > average) {
//                aboveAverageCount++;
//            }
//        }
//
//        JOptionPane.showMessageDialog(null,
//                                      "Number of items: " + repetition + "\nAverage: " + average + "\nNumber of elements above the average is: " + aboveAverageCount,
//                                      "Result",
//                                      JOptionPane.INFORMATION_MESSAGE);
//
//        System.exit(0);
//    }
//}