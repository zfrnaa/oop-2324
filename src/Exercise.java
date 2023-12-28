public class Exercise
{
    private static final int SECRET = 11;
    private static final double RATE = 12.50;

    public static void main(String[] args)
    {
        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;

        num1 =15; num2 =28;

        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);
        newNum = num1 * 2 + num2;

        System.out.println("The value of new Number that have been multiply and addition = " + newNum);

        newNum += SECRET;

        System.out.println("The value of new Number that add with SECRET = " + newNum);

        name = "Cynthia Jacobson";

        hoursWorked = 45.50;

        wages = hoursWorked * RATE;

        System.out.println("Name: " +  name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);
    }
}
