package Kuliah5;

import java.util.Scanner;

public class Kuliah5_1
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

        if (itemSold > 3){

            System.out.println("Please enter the total value of the items");

            totalValue = input.nextInt();

            if(totalValue > 1000){
                bonus = 50;
                System.out.println("The numbe of item sold: " + itemSold);
                System.out.println("The bonus from the total Value is " + bonus);
                System.exit(0);
            }
        }
        System.out.println("The number of item sold: " + itemSold);
    }
}
