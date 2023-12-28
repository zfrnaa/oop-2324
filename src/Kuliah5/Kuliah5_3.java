package Kuliah5;

import java.util.Scanner;

public class Kuliah5_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int bonus = 0;

        int itemSold;

        int totalValue;

        System.out.println("Welcome to the store system");

        System.out.println("Please enter the item sold today: ");

        itemSold = input.nextInt();

        if (itemSold > 100)
        {
            bonus = 200;
            System.out.println("The number of item sold: " + itemSold);
            System.out.println("The bonus from the total value: " + bonus);

        } else
        {
            System.out.println("Please enter the total value of the items");

            totalValue = input.nextInt();

            if (totalValue > 3000)
            {
                bonus = 200;
                System.out.println("The number of item sold: " + itemSold);
                System.out.println("The bonus from the total Value: " + bonus);
                System.exit(0);
            }
            System.out.println("The number of item sold: " + itemSold);
            System.out.println("The bonus from the total Value: " + bonus);
            System.exit(0);
        }
    }
}
