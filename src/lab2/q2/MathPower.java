/*authors: Zafran/Rann

Print a table of two number. A base number and the power number, then display the result of base
to the power number
 */

package lab2.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathPower {
    private static final List<Integer> baseList = new ArrayList<>();
    private static final List<Integer> powerList = new ArrayList<>();

    private static void enterValues(Scanner scanner) {
        System.out.println("Enter a number for variable a: ");
        int newA = scanner.nextInt();
        System.out.println("Enter a number for variable b: ");
        int newB = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        baseList.add(newA);
        powerList.add(newB);
    }

    private static void displayTable() {
        System.out.println("Displaying table:");
        System.out.println("a\tb\ta power of b");
        for (int i = 0; i < baseList.size(); i++) {
            int a = baseList.get(i);
            int b = powerList.get(i);
            double result = (int) Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + result);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        while (shouldContinue) {
            enterValues(scanner);

            System.out.println("Do you want to continue? (y/n)");
            String userInput = scanner.nextLine();

            if (userInput.equals("n")) {
                shouldContinue = false;
            }
        }

        displayTable();

        scanner.close();
    }
}

