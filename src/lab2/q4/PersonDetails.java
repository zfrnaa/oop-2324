/*authors: Zafran/Rann

To calculate the volume and area of a cylinder
 */

package lab2.q4;

import java.util.Scanner;

class PersonDetails
{

    public static void main(String[] args)
    {
        Scanner personInput = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = personInput.nextLine();

        System.out.println("What is your year of birth ? ");
        int birthYear = personInput.nextInt();
        personInput.nextLine();

        System.out.println("What is your gender ? ");
        String gender = personInput.nextLine();

        int age = 2023 - birthYear;

        System.out.println("-Your personal details as below-");
        System.out.println("Your name is " + name);
        System.out.println("Your gender is " + gender);
        System.out.println("Your age is " + age);
    }
}
