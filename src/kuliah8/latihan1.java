package kuliah8;

public class latihan1
{
    //data field with private access modifier
    private static int num1;
    private static int num2;

    latihan1(){
        System.out.println("object created");
    }

    public static int sum (int a, int b){
        int result = 0;
        for (int i = a; i<=b; i++)
        {
            result += i;
        }
        return result;
    }

    // a returning method to multiply two integers values
    public static int multiply (int x, int y){
        int result = x * y;
        return result;
    }

    //method overloading - same name, different parameters
    public static int multiply (int c){
        return c * 10;
    }

    public static void main(String[] args)
    {
        latihan1 objNum = new latihan1();

        num1 = 1;
        num2 = 10;

        //declare new variable to assign the value from method calling
        int sumToTen = objNum.sum(num1, num2);
        System.out.println("Sum from 1 to 10 is " + sumToTen);

        num1 = 88;
        num2 = 23;
        int multiply = multiply(num1, num2);
        System.out.println("Method multiply number " + multiply);

        int multiply1 = multiply(20);
        System.out.println("Method overloading multiply with one parameter " + multiply1);

        int sumToFourNine = sum(20,37);
        System.out.println("Sum from 35 to 49 is " + sumToFourNine);
    }
}
