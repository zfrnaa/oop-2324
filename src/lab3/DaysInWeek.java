/* Authors: Zulhafif/Zafran

Program: a switch statement that displays Sunday, Monday, Tuesday, Wednesday, Thursday,
Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly

*/

package lab3;

import java.util.Scanner;

public class DaysInWeek
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi there! You can get to know what day is by using a number in a week");


        char continueDecision;

        do{
            System.out.print("Please insert the day number: ");
            int choice = input.nextInt();

            switch (choice)
            {
                case 0:
                    System.out.println("Day - 0 is Sunday");
                    break;
                case 1:
                    System.out.println("Day - 1 is Monday");
                    break;
                case 2:
                    System.out.println("Day - 2 is Tuesday");
                    break;
                case 3:
                    System.out.println("Day - 3 is Wednesday");
                    break;
                case 4:
                    System.out.println("Day - 4 is Thursday");
                    break;
                case 5:
                    System.out.println("Day - 5 is Friday");
                    break;
                case 6:
                    System.out.println("Day - 6 is Saturday");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Would like to continue? (y/n) ");
            continueDecision = input.next().charAt(0);
        }
        while (continueDecision != 'n');

        input.close();
        System.out.println("Thank you!");
    }
}