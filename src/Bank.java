import java.util.Scanner;

public class Bank
{
    private static final int MINIMUM_BALANCE = 50;

    public static void main(String[] args)
    {
        char typeOfOperation;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Bank");

        System.out.println("Please enter your account number: ");

        int accountNumber = input.nextInt();

        System.out.println("Savings or checking?");
        typeOfOperation = input.next().charAt(0);

        if(typeOfOperation == 'c'){
            System.out.println("Checking");
        }
        if (typeOfOperation == 's'){
            System.out.println("Saving");
        }
    }
}
