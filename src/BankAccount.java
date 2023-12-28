import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Enter account type (s/S for savings, c/C for checking): ");
            char accountType = scanner.next().charAt(0);

            System.out.print("Enter minimum balance: ");
            double minBalance = scanner.nextDouble();

            System.out.print("Enter current balance: ");
            double currentBalance = scanner.nextDouble();

            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Type: " + Character.toUpperCase(accountType));
            System.out.println("Current Balance: " + currentBalance + " KD");

            double serviceCharge = currentBalance < minBalance ? (accountType == 's' || accountType == 'S') ? 10 : 25 : 0;
            currentBalance -= serviceCharge;

            if (serviceCharge > 0) {
                System.out.println("Service Charge: " + serviceCharge + " KD");
            }

            double interest = currentBalance >= minBalance ? (accountType == 's' || accountType == 'S') ? 0.04 * currentBalance : (currentBalance >= minBalance + 5000 ? 0.03 * currentBalance : 0.05 * currentBalance) : 0;
            System.out.println("Interest Earned: " + interest + " KD");

            System.out.println("Updated Balance: " + currentBalance + " KD");

            System.out.println(); // Add a blank line for separation
        }

        scanner.close();
    }
}
