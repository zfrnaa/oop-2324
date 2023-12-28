package lab4;

import java.util.Scanner;

public class Grade
{
    public static String name;

    public static int score;


    public static void main(String[] args)
    {
        String[] grade = {"A","B","C","D","E"};

        Scanner input = new Scanner(System.in);

            System.out.print("Please enter the student's name: ");
            name = input.next();

            System.out.print("Please enter the student's score: ");
            score = input.nextInt();

            if (score >= 85 && score <= 100)
            {
                System.out.println(name + score);
                System.out.println("Your mastery level is " + grade[4]);
            } else if (score >= 70 && score <= 84)
            {
                System.out.println(name + score);
                System.out.println("Your mastery level is " + grade[3]);
            } else if (score >= 55 && score <= 69)
            {
                System.out.println(name + score);
                System.out.println("Your mastery level is " + grade[2]);
            } else if (score >= 40 && score <= 54)
            {
                System.out.println(name + score);
                System.out.println("Your mastery level is " + grade[1]);
            } else if (score >= 0 && score <= 39)
            {
                System.out.println(name + score);
                System.out.println("Your mastery level is " + grade[0]);
            } else
            {
                System.exit(0);
            }
    }
}
