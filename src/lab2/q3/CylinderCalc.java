/*authors: Zafran/Rann

To calculate the volume and area of a cylinder
 */

package lab2.q3;

public class CylinderCalc
{
    public static void main(String[] args)
    {
        int cylinderHeight = 38;
        int cylinderRadius = 35;
        final double PHI = 3.142;
        double volume = PHI * (cylinderRadius * cylinderRadius) * cylinderHeight;
        double area = 2 * PHI * cylinderRadius * cylinderHeight;

        System.out.println("The calculation of the cylinder:\n");
        System.out.println("Volume of the cylinder = " + volume);
        System.out.println("Area of the cylinder = " + area);
    }
}