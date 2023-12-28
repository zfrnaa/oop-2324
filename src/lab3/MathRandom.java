package lab3;

//import java.util.Random;
import java.util.Scanner;

public class MathRandom
{
    private static double number1;
    private static double number2;


    public static void main(String[] args)
    {
        double correctAnswer;

        Scanner inputAnswer = new Scanner(System.in);

//        Random r = new Random();
//        number1 = r.nextInt(10);
//        number2 = r.nextInt(10);

        number1 = Math.random() * 10;
        number2 = Math.random() * 10;

        correctAnswer = total();

        int answer;

        while (true) {
            System.out.println("What is " +  (int) number1 + "+" +  (int) number2 + "? ");
            answer = inputAnswer.nextInt();

            if (answer == correctAnswer) {
                System.out.println("You got it!");
                break;
            } else {
                System.out.println("Wrong answer. Try again.");
            }
        }
    }

    private static double total () {return (int) number2 + (int) number1;}
}