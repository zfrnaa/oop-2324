package lab4;

import java.util.Scanner;

public class CAdmission {

//    public static String name;
//
//    public static float GPA;
//
//    public static float testScore;
//    static String decision;
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to admission college's office :)");
//        System.out.println("May I know your details? (y/n)");
//
//        decision = input.nextLine();
//        if (decision.equals("y")) {
//            // User agreed to proceed with the admission process
//            do {
//                System.out.print("Please enter your name: ");
//                name = input.nextLine();
//
//                System.out.print("Enter your GPA: ");
//                GPA = input.nextFloat();
//
//                System.out.print("Enter your Admission Score test: ");
//                testScore = input.nextFloat();
//
//                // Check for invalid GPA and test scores.
//                if ((GPA < 0 || GPA > 4) && (testScore < 0 || testScore > 100)) {
//                    System.out.println("Error." + "\nDoes not exist!");
//                    break;
//                }
//
//                // Check if the applicant is accepted.
//                if (GPA >= 3 && testScore >= 60) {
//                    System.out.println("Congratulations! " + name + ". Your admission to the college is accepted");
//                    System.out.println("Have a good day ahead :D");
//                    break;
//                } else if (GPA <= 3 && testScore >= 80) {
//                    System.out.println("Congratulations! " + name + ". Your admission to the college is accepted");
//                    System.out.println("Have a good day ahead :D");
//                    break;
//                } else if (GPA <= 3 && testScore < 60) {
//                    System.out.println("We regret to inform you that your admission to the " +
//                                       "college has been rejected");
//                    break;
//                }
//            } while (GPA != -1);
//        } else if (decision.equals("n")) {
//            // User decided not to proceed with the admission process
//            System.out.println("Thank you for your time.");
//            System.exit(0);
//        } else {
//            // Invalid input for decision
//            System.out.println("Invalid input. Please enter either 'y' or 'n'.");
//        }
//
//        System.exit(0);
//    }
public static String name;

    public static float GPA;

    public static float testScore;
    static String decision;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to admission college's office :)");
        System.out.println("May I know your details? (y/n)");

        decision = input.nextLine();

        if (decision.equals("y")) {
            // User agreed to proceed with the admission process
            do {
                System.out.print("Please enter your name: ");
                name = input.nextLine();

                System.out.print("Enter your GPA: ");
                GPA = input.nextFloat();

                System.out.print("Enter your Admission Score test: ");
                testScore = input.nextFloat();

                // Check for invalid GPA and test scores.
                if ((GPA < 0 || GPA > 4) && (testScore < 0 || testScore > 100)) {
                    System.out.println("Error." + "\nDoes not exist!");
                    break;
                }

                // Check if the applicant is accepted.
                String admissionStatus = (GPA >= 3 && testScore >= 60) || (GPA <= 3 && testScore >= 80)
                        ? "Congratulations! " + name + ". Your admission to the college is accepted"
                        : "We regret to inform you that your admission to the college has been rejected";

                System.out.println(admissionStatus);
                System.out.println("Have a good day ahead :D" + (admissionStatus.equals("Congratulations") ? "!" : ""));
                break;
            } while (GPA != -1);
        } else if (decision.equals("n")) {
            // User decided not to proceed with the admission process
            System.out.println("Thank you for your time.");
            System.exit(0);
        } else {
            // Invalid input for decision
            System.out.println("Invalid input. Please enter either 'y' or 'n'.");
        }

        System.exit(0);
    }
}
