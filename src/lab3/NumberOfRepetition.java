package lab3;

import java.util.Scanner;

public class NumberOfRepetition
{
    public static void averageOfNumbers(double number, int repetitionTimes){
        double average;
        average = number / repetitionTimes;
        System.out.println("The average of the numbers is " + average);
    }

    private static double number = 0.0;


    public static void main(String[] args)
    {
        int i;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items:" );

        int repetitionTimes = input.nextInt();

//        number = 0.0; // Initialize the number variable to 0 outside the loop
        for (i=1; i <= repetitionTimes; i++){
            System.out.println("Enter the number " + i);
            number += input.nextDouble();
        }
        averageOfNumbers(number, repetitionTimes);

        input.close();
    }
}
