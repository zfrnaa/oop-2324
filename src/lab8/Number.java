package lab8;

public class Number
{
    private static int num1;
    private static int num2;

    Number()
    {
        System.out.println("bhuban tak bawa laptop, biasalah");
        num1 = 7;
        num2 = 8;
    }
    Number(int a)
    {
        System.out.println("zafran");
        num1 = a;
        num2 = 5;
        System.out.println(num1+num2);
    }
    Number(int c, int d)
    {
        System.out.println("zul");
        num1 = c;
        num2 = 5;
        System.out.println(num1+num2);
        System.out.println(d);
    }

    public static void main(String[] args)
    {
        Number objNum = new Number();
        Number bhuban = new Number(20);
        Number zafran = new Number(45, 23);
    }
}
