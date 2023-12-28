/*authors: Zafran/Rann

Declare every possible variable for an iPhone object.
 */

package lab2.q1;

import java.util.Scanner;

public class Iphone
{
    public static void main(String[] args)
    {
        String model;
        String displayType;
        String mainCamPixel;
        String selfieCamPixel;
        byte osVersion;
        int yearRelease;
        int weight;
        int batteryCapacity;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your Iphone Model?");
        model = input.nextLine();

        System.out.println("What is your IOS version?");
        osVersion = input.nextByte();

        input.nextLine();
        System.out.println("What is the display of the Iphone?");
        displayType = input.nextLine();

        System.out.println("What is the weight?");
        weight = input.nextInt();

        input.nextLine();
        System.out.println("What is the Main Camera of it?");
        mainCamPixel = input.nextLine();

        System.out.println("What is the Selfie Camera of it?");
        selfieCamPixel = input.nextLine();

        System.out.println("What is the Battery Capacity?");
        batteryCapacity = input.nextInt();

        System.out.println("What is the Year of Release for the Iphone?");
        yearRelease = input.nextInt();

        System.out.println("Iphone Model: " + model + " with version IOS, " + osVersion + " " +
                           "and Year " +
                           "of release " + yearRelease);
        System.out.println("Display Type: " + displayType);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Main Camera Module, " + mainCamPixel + ", and Selfie Camera Module, " +
                           selfieCamPixel);
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}
