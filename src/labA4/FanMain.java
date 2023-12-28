package labA4;

class Fan {

    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW; // Default speed: SLOW
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //data validation
        if (speed < 1 || speed > 3) {
            System.out.println("Invalid speed: Please choose a value between 1 and 3");
            return;
        }

        this.speed = speed;
        int speedName = switch (speed)
        {
            //switch case with shorthand expression
            case 1 -> SLOW;
            case 2 -> MEDIUM;
            case 3 -> FAST;
            default -> 0;
        };
        System.out.println("Your new fan speed is " + speedName);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
        //print using if else in short way
        System.out.println(on ? "\nThe fan is on" : "\nThe fan is off");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        //validation
        if (radius <= 0) {
            System.out.println("Invalid radius: Please enter a positive value");
            return;
        }
        this.radius = radius;
    }

    public String getColor() {
        //tell the default color
        System.out.println("Default color was "+ this.color);
        return color;
    }

    public void setColor(String updatedColor) {
        //new color assign and update to the default color
        this.color = updatedColor;
        System.out.println("Your new fan color is " + color);
    }
    public void displayFanDetails(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On/Off: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        fan.setColor(fan == this ? "yellow" : "blue"); // Use ternary operator
    }

}


public class FanMain
{
    public static void main(String[] args) {
        // Create the first Fan object
        Fan fan1 = new Fan();

        //set value of object fan1
        fan1.setOn(true);
        fan1.setSpeed(3); // FAST
        fan1.setRadius(10.0);
        fan1.getColor();

        //Display attributes and value of object fan1
        fan1.displayFanDetails(fan1);

        // Create the second Fan object
        Fan fan2 = new Fan();

        //set value of object fan2
        fan2.setOn(false);
        fan2.setSpeed(2); // MEDIUM
        fan2.setRadius(5.0);
        fan2.getColor();

        //Display attributes and value of object fan2
        fan2.displayFanDetails(fan2);
    }
}
//        fan1.setColor("yellow");
//        fan2.setColor("blue");

          // Display attribute values for both objects
//        System.out.println("\nFan 1 Details:");
//        System.out.println("Speed: " + fan1.getSpeed());
//        System.out.println("On/Off: " + fan1.isOn());
//        System.out.println("Radius: " + fan1.getRadius());
//        System.out.println("Color: " + fan1.getColor());

//        System.out.println("\nFan 2 Details:");
//        System.out.println("Speed: " + fan2.getSpeed());
//        System.out.println("On/Off: " + fan2.isOn());
//        System.out.println("Radius: " + fan2.getRadius());
//        System.out.println("Color: " + fan2.getColor());