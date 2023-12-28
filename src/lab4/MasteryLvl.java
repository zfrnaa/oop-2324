package lab4;

import java.util.Scanner;

public class MasteryLvl
{
    public static String name;

    public static int score;


    public static void main(String[] args)
    {
        String[] masteryLevel = {"TP1", "TP2", "TP3", "TP4", "TP5"};
        int numberOfData;

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert the number of data: ");
        numberOfData = input.nextInt();

        for (int i = 0; i < numberOfData; i++)
        {
            System.out.print("Please enter the student's name: ");
            name = input.next();

            System.out.print("Please enter the student's score: ");
            score = input.nextInt();

            if (score >= 85 && score <= 100)
            {
                System.out.println(name + ", EXCELLENT! You get " + score);
                System.out.println("Your mastery level is " + masteryLevel[4]);
            } else if (score >= 70 && score <= 84)
            {
                System.out.println(name + ", WELL DONE! You get " + score);
                System.out.println("Your mastery level is " + masteryLevel[3]);
            } else if (score >= 55 && score <= 69)
            {
                System.out.println(name + ", GOOD! You get " + score);
                System.out.println("Your mastery level is " + masteryLevel[2]);
            } else if (score >= 40 && score <= 54)
            {
                System.out.println(name + ", TRY AGAIN! You get " + score);
                System.out.println("Your mastery level is " + masteryLevel[1]);
            } else if (score >= 0 && score <= 39)
            {
                System.out.println(name + ", FAILED! You sucks! " + score);
                System.out.println("Your mastery level is " + masteryLevel[0]);
            } else
            {
                System.exit(0);
            }
        }
    }
}
