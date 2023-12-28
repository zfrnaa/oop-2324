import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = 5;

        int[] numberArray = new int[5];

        for(int i=0; i<number; i++){
            numberArray[i] = input.nextInt();
        }
        for(int i = number - 1; i>=0; i--){
            System.out.println("Array number " + numberArray[i]);
        }
    }
}
