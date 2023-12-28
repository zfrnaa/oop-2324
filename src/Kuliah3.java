import java.util.Scanner;

public class Kuliah3
{
    public static final double CENTI = 2.54;

    public static final int INC = 12;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter length in feet: ");
        float feet = input.nextFloat();

        System.out.println("Enter length in inches: ");
        float inches = input.nextFloat();

        float totalInches = (INC * feet) + inches;
        double centimeters = totalInches * CENTI;

        System.out.println("The number you entered are: " + feet + " for feet and " + inches +
                           " for inches");
        System.out.println("");
        System.out.println("The total number of inches: " + totalInches);
        System.out.println("Number of centimeters: " + centimeters);
    }
}
